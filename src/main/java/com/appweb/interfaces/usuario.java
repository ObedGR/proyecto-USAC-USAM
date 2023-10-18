/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.appweb.interfaces;

import com.appweb.modelos.estudiante;
import java.util.List;

/**
 *
 * @author obedg
 */
public interface usuario {
    public List<estudiante> finAllEstudiantes();
    //public void crearEstudiante();
    //public void buscarEstudiante();
    public boolean autentificarEstudiante(estudiante estudiante);
    //public void editarEstudiante();
    
    //por el momento no se implementaran mas alla de las utilizadas para la prueba de autentificacion de usuarios/estudiantes
}
