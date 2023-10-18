/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appweb.conexiones;

/**
 *
 * @author obedg
 */
public class Configurations {

    private String DRIVER = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://127.0.0.1:3306/control" + "?verifyServerCertificate=false&useSSL=false&allowPublicKeyRetrieval=true";
    private String usuario = "obed";
    private String password = "1234";
    private static Configurations config;

    public Configurations() {
    }

    public static Configurations getInstance() {
        if (config == null) {
            config = new Configurations();
        }
        return config;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
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

    public static Configurations getConfig() {
        return config;
    }

    public static void setConfig(Configurations config) {
        Configurations.config = config;
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER;
    }
}
