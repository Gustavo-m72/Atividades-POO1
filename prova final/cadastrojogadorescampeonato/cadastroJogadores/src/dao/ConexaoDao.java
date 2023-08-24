/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class ConexaoDao implements Login{
   
    
        static final String DATA_BASE_URL = "jdbc:mysql://localhost/jogadores";
   
        static final String USERNAME = "root";
   
        static final String PASSOWORD = "";
        Connection connection = null;
        //Statement statement = null;
        //ResultSet resultSet = null;
        
        
        @Override
        public Connection getConexao(){
            try {
                connection = DriverManager.getConnection(DATA_BASE_URL, USERNAME, PASSOWORD);
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Conexão estabelecida");
        return connection;
    }
}

