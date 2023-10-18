/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appweb.modelos;

import java.io.Serializable;

/**
 *
 * @author obedg
 */
public class estudiante implements Serializable {

    private String usuario;
    private String password;
    private String nombres;
    private String apellidos;
    private String carrera;

    public estudiante() {
    }
    
    //constructor para la validacion del usuario
    public estudiante(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public estudiante(String usuario, String password, String nombres, String apellidos, String carrera) {
        this.usuario = usuario;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
