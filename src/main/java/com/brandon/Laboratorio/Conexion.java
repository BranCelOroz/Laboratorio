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
            this.BD = "jdbc:postgresql://ec2-54-147-36-107.compute-1.amazonaws.com:5432/d7m98cmpoan90d";
            this.usuario = "vxdhahzhbbosfo";
            this.clave = "f21114140126ad7a2e0e1f92e0cf741614516818dcc56c45aab6dd03b575fa3f";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, clave);
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {
            System.out.println("Error al conectar "+e);
        }
    }
    
    public Connection getConexion(){
        return conectar;
    }

}
