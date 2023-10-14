/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.guatesalva.controllers;

import com.guatesalva.modelos.usuarioEstudiante;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author obedg
 */
public class usuarioEstudianteImplementsTest {
    
    public usuarioEstudianteImplementsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findall method, of class usuarioEstudianteImplements.
     */
    /*@Test
    public void testFindall() {
        System.out.println("findall");
        usuarioEstudianteImplements instance = new usuarioEstudianteImplements();
        List<usuarioEstudiante> expResult = null;
        List<usuarioEstudiante> result = instance.findall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of Autentificar method, of class usuarioEstudianteImplements.
     */
    @Test
    public void testAutentificar() {
        System.out.println("Autentificar");
        String user = "202241269";
        String password = "123";
        usuarioEstudianteImplements instance = new usuarioEstudianteImplements();
        boolean expResult = true;
        boolean result = instance.Autentificar(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
