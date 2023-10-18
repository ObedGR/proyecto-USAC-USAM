/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appweb.controllers;

import com.appweb.conexiones.conexion;
import java.io.Serializable;
import com.appweb.interfaces.usuario;
import com.appweb.modelos.estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author obedg
 */
public class estudianteData implements Serializable, usuario {

    @Override
    public List<estudiante> finAllEstudiantes() {

        List<estudiante> listaEstudiantes = null;

        String Query = "SELECT usuario, contrasenia, nombres, apellidos, carrera FROM estudiante";

        try (PreparedStatement ps = conexion.getEnlace().prepareStatement(Query)) {
            listaEstudiantes = new ArrayList<>();

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    listaEstudiantes.add(new estudiante(rs.getString(1),
                            rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getString(5)));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return listaEstudiantes;
    }

    @Override
    public boolean autentificarEstudiante(estudiante estudiante) {

        String Query = "SELECT usuario, contrasenia FROM estudiante WHERE usuario=? and contrasenia=?";

        try (PreparedStatement ps = conexion.getEnlace().prepareStatement(Query)) {

            ps.setString(1, estudiante.getUsuario());
            ps.setString(2, estudiante.getPassword());

            try (ResultSet rs = ps.executeQuery()) {

                return rs.next(); //verifica si en base existe un elementos con exactamente los mismos datos coincidentes

            } catch (Exception e) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
}
