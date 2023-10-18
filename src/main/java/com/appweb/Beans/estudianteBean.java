/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appweb.Beans;

import com.appweb.controllers.estudianteData;
import com.appweb.modelos.estudiante;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author obedg
 */
@Named
@RequestScoped
public class estudianteBean {

    //campos temporales de uso
    private String usuario;
    private String password;
    private String nombres;
    private String apellidos;
    private String carrera;
    private estudiante estudianteMatch;
    //contenedor de los datos en base de datos
    private List<estudiante> listaEstudinates;

    @Inject
    private estudianteData estudianteData;

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

    public estudiante getEstudianteMatch() {
        return estudianteMatch;
    }

    public void setEstudianteMatch(estudiante estudianteMatch) {
        this.estudianteMatch = estudianteMatch;
    }

    public estudianteData getEstudianteData() {
        return estudianteData;
    }

    public void setEstudianteData(estudianteData estudianteData) {
        this.estudianteData = estudianteData;
    }

    //metodos para el cambio o retorno de lista si son necesarios
    public List<estudiante> getListaEstudinates() {
        return listaEstudinates;
    }

    public void setListaEstudinates(List<estudiante> listaEstudinates) {
        this.listaEstudinates = listaEstudinates;
    }
    //*

    //*obtiene la lista de estudiantes existentes en base de datos
    public void obtenerListaEstudinates() {
        this.listaEstudinates = estudianteData.finAllEstudiantes();
    }

    //Metodo pendiente de definir... el metodo al plantearse el registro puede ser una funcion con valor de retorno boleano o cadena
    public void registrarUsuario() {
        //
    }

    public void reiniciarValores() {
        usuario = new String();
        password = new String();
        nombres = new String();
        apellidos = new String();
        carrera = new String();
    }

    public String verificarUsuario() {
        estudiante autentificar = new estudiante(this.usuario, this.password);

        reiniciarValores();

        if (estudianteData.autentificarEstudiante(autentificar)) {
            return "index?faces-redirect=true";
        } else {
            return "autentificiacion-estudiantes?faces-redirect=true";
        }
    }
}
