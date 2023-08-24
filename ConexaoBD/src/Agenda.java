
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Agenda {
   static final String DATA_BASE_URL = "jdbc:mysql://localhost/agenda";
   
   static final String USERNAME = "root";
   
   static final String PASSOWORD = "";
   
   public static void main(String[] args){
       Connection connection = null;
       Statement statement = null;
       ResultSet resultSet = null;

   try{
    connection = DriverManager.getConnection(DATA_BASE_URL, USERNAME, PASSOWORD);
    
    statement = connection.createStatement();
    
    resultSet = statement.executeQuery("select nome, endereco from agenda.contato");
    ResultSetMetaData metaData = resultSet.getMetaData();
    int numberOfColumns = metaData.getColumnCount();
    System.out.println("Titulos de tables contatdo no banco agenda");
    System.out.println("----------------------------------------------");
    for (int i = 1; i <= numberOfColumns; i++){
        System.out.printf("%-40s\t", metaData.getColumnName(i));
    }
    System.out.println("");
    while (resultSet.next()){
        for(int i = 1; i <= numberOfColumns; i++){
        System.out.printf("%-40s\t", resultSet.getObject(i));
        }
    System.out.println();
    }
}catch(SQLException sqlException){
    sqlException.printStackTrace();
    
}finally{
    try{
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println("conexoes fechadas");
    }catch (Exception exception){
            exception.printStackTrace();
    }
}
}
}