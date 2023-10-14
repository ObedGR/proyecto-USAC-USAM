/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guatesalva.controllers;

import com.gautesalva.conexiones.conexion;
import com.guatesalva.interfaces.usuarioDAO;
import com.guatesalva.modelos.usuarioEstudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author obedg
 */
public class usuarioEstudianteImplements implements usuarioDAO {

    @Override
    public List<usuarioEstudiante> findall() {
        List<usuarioEstudiante> listaEstudiantes = null;
        String Query = "select * from estudiante";
        try {
            PreparedStatement ps = conexion.getEnlace().prepareStatement(Query);
            listaEstudiantes = new ArrayList<>(10);//capacidad promedio para ahorrar recursos de inicio del Array

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String usuario = rs.getString(2);
                    String password = rs.getString(3);
                    String nombres = rs.getString(4);
                    String apellidos = rs.getString(5);
                    String carrera = rs.getString(6);

                    listaEstudiantes.add(new usuarioEstudiante(usuario, password, nombres, apellidos, carrera));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return listaEstudiantes;
    }

    @Override
    public boolean Autentificar(String user, String password) {
        
        String Query = "SELECT usuario, contrasenia FROM estudiante WHERE usuario = ? AND contrasenia = ?";

        try (Connection connection = conexion.getEnlace(); PreparedStatement ps = connection.prepareStatement(Query)) {
            ps.setString(1, user);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                return user.trim().equals(rs.getString(1)) && password.trim().equals(rs.getString(2));
            }
        } catch (SQLException e) {
            return false;
        }
    }
}
