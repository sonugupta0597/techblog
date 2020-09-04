/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.dao;

import com.tech.blog.entities.Category;
import com.tech.blog.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class CategoryDao {
    private Connection conn;

    public CategoryDao(Connection conn) {
        this.conn = conn;
    }
    
    public List<Category> getCategoryList(){
            List<Category> l=null;
            try {

            String query = "select * from categories";
            PreparedStatement pstm =conn.prepareStatement(query);
            ResultSet set=pstm.executeQuery();
            l=new ArrayList<Category>();
            while(set.next()){
                 Category c=new Category(set.getInt("cid"),set.getString("cname"),set.getString("description"));
                 l.add(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
            return l;
    }
}
