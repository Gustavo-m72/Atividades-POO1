/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class ConexaoDao {
   static final String DATA_BASE_URL = "jdbc:mysql://localhost/cadastro";
   
   static final String USERNAME = "root";
   
   static final String PASSOWORD = "";
   Connection connection = null;
   //Statement statement = null;
   //ResultSet resultSet = null;
    public Connection getConexao() throws SQLException{
        connection = DriverManager.getConnection(DATA_BASE_URL, USERNAME, PASSOWORD);
        System.out.println("Conexão estabelecida");
        return connection;
    }
    
}
