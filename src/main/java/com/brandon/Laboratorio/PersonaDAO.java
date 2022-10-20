/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brandon.Laboratorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administradorPC
 */
public class PersonaDAO {
       public static final String SQL_READALL="SELECT * FROM tb_persona";


    public PersonaDAO() {
      
    }
    
    
    public List<PersonaDTO> readAll(){
        Conexion con = new Conexion();
        con.conectar();
        List<PersonaDTO> lista=null;
        PreparedStatement ps;
        try{
          ps=  con.getConexion().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next()){
                PersonaDTO obj = new PersonaDTO(rs.getString("Nombre"), rs.getString("Correo"), rs.getString("Clave"), rs.getString("Telefono"));
              lista.add(obj);
            }
        }catch(SQLException ex){
            System.out.println("error al conectar "+ ex);
        }
        return lista;
    }
}
