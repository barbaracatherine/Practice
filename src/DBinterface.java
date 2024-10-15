/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barbara.johnson
 */
import java.sql.*;
import java.sql.Connection;  
import java.sql.DriverManager;  

public class DBinterface {
    
     public static String getRecord(String query) {
        

        try {
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/phppractice";

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, userName, password);

            return "Database connection established";
        }
        catch (Exception e) {  
                //return e.toString();
                return e.toString();
        }
    }     
}
         
 
            // Printing ID, name, email of customers
            // of the SQL command above
            //System.out.println("id\t\tname\t\temail");
 
            // Condition check
            //while (rs.next()) {
 
                //int id = rs.getInt("id");
                //String name = rs.getString("name");
                //String email = rs.getString("email");
                //System.out.println(id + "\t\t" + name
                 //                  + "\t\t" + email);
            //}
        
 
        // Catch block to handle exception
        //catch (SQLException e) {
 
            // Print exception pop-up on screen
            //System.out.println(e);
        //}
        
