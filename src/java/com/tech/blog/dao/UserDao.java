/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;

/**
 *
 * @author pc
 */
public class UserDao {

    private Connection conn;

    public UserDao(Connection conn) {
        this.conn = conn;
    }

    public boolean saveUser(User u) {
        boolean status = false;
        System.err.println("nccccccccccccc");
        try {
            String query = "insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
            PreparedStatement pstm = this.conn.prepareStatement(query);
            pstm.setString(1, u.getName());
            pstm.setString(2, u.getEmail());
            pstm.setString(3, u.getPassword());
            pstm.setString(4, u.getGender());
            pstm.setString(5, u.getAbout());

            pstm.executeUpdate();
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public User getUserByEmailAndPassword(String email , String password) {
        User u = null;
        try {

            String query = "select * from user where email=? and password=?";
            PreparedStatement pstm =conn.prepareStatement(query);
            pstm.setString(1, email);
            pstm.setString(2, password);
            ResultSet set=pstm.executeQuery();
            System.err.println("mcdkmlllllllllllllllll");
            if(set.next()){
            u=new User();
            u.setId(set.getInt("id"));
            u.setName(set.getString("name"));
            u.setEmail(set.getString("email"));
            u.setPassword(set.getString("password"));
            u.setGender(set.getString("gender"));
            u.setAbout(set.getString("about"));
            u.setDateAndTime(set.getTimestamp("rdate"));
            u.setProfile(set.getString("profile"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
    
    public boolean UpdateUser(User u) {
        boolean status = false;
        
        try {
            String query = "update user set name=? , email=?,password=?,gender=?,about=?,profile=? where id=?";
            PreparedStatement pstm = this.conn.prepareStatement(query);
            pstm.setString(1, u.getName());
            pstm.setString(2, u.getEmail());
            pstm.setString(3, u.getPassword());
            pstm.setString(4, u.getGender());
            pstm.setString(5, u.getAbout());
            pstm.setString(6, u.getProfile());
            pstm.setInt(7,u.getId());
            pstm.executeUpdate();
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
