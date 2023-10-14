/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gautesalva.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author obedg
 */
public class conexion {

    private static Connection enlace;

    public static Connection getEnlace() throws SQLException {
        if (enlace == null) {
            try {
                Configurations config = Configurations.getInstance();
                Class.forName(config.getDRIVER());
                enlace = DriverManager.getConnection(config.getURL(), config.getUsuario(), config.getPassword());
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "No se puede conectar a la base");
            }
        }
        return enlace;
    }
}
