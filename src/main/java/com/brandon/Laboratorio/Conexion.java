/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brandon.Laboratorio;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author administradorPC
 */
public class Conexion {
    private Connection conectar;
    String BD;
    String usuario;
    String clave;

    public Conexion(Connection conectar, String BD, String usuario, String clave) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Conexion() {
        this.conectar = null;
        this.BD = "";
        this.usuario = "";
        this.clave = "";
    }

    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.BD = "jdbc:postgresql://localhost:5432/bd_guegacel";
            this.usuario = "postgres";
            this.clave = "123456";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, clave);
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {
            System.out.println("Error al conectar "+e);
        }
    }
    
    public Connection getConexion(){
        return conectar;
    }

}
