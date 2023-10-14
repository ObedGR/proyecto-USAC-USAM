/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.guatesalva.interfaces;

import com.guatesalva.modelos.usuarioEstudiante;
import java.util.List;

/**
 *
 * @author obedg
 */
public interface usuarioDAO {
    public List<usuarioEstudiante> findall();
    //public void insertUsuario(usuarioEstudiante estudiante);
    //public void BusquedaByID(Integer id); muy posiblemente no implementar por el concepto
    //public void BusquedaByUser(Integer id);
    public boolean Autentificar(String User, String Password);
    //public void ActualizarEstudiante(usuarioEstudiante estudiante);
    //public void BorrarEstudiante(usuarioEstudiante estudiante);
}
