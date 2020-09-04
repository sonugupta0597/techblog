/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.helper;



import java.sql.*;

/**
 *
 * @author pc
 */
public class ConnectionProvider {
    private static Connection conn;
    public static Connection getConnection(){
        if(conn==null){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","root");
        }catch(Exception e){
                 e.printStackTrace();
        }
        }
         return conn;
    }
}
