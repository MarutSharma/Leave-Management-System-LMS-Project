/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_project_java;

import java.sql.DriverManager;

/**
 *
 * @author marut
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DBManager {
    
    public static Connection ConnectDatabase()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsdb","root","marut36");
            System.out.println("Connection Establishment Sucessful");
            return con;
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Connection Error");
            return null;
        }
        catch(SQLException x)
        {
            System.out.println("Sql Related Error");
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Main part");
        Connection con =DBManager.ConnectDatabase();
    }
    
}
