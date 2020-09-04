/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.dao;

import com.tech.blog.entities.Category;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.Post;
import com.tech.blog.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class PostDao {
    private Connection conn;

    public PostDao(Connection conn) {
        this.conn = conn;
    }

    public boolean newPost(Post p) {
        boolean status = false;
        
        try {
            String query = "insert into post(ptittle,pcontent,pcode,ppic,cid,userid) values(?,?,?,?,?,?)";
            PreparedStatement pstm = this.conn.prepareStatement(query);
            pstm.setString(1,p.getpTittle());
            pstm.setString(2,p.getpContent());
            pstm.setString(3,p.getpCode());
            pstm.setString(4,p.getPostPic());
            pstm.setInt(5,p.getpCotegory());
            pstm.setInt(6,p.getpAuther());

            pstm.executeUpdate();
            status = true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    public List<Post> getAllPost(){
            List<Post> l=null;
            try {

            String query = "select * from post";
            PreparedStatement pstm =conn.prepareStatement(query);
            ResultSet set=pstm.executeQuery();
            l=new ArrayList<Post>();
            while(set.next()){
                 Post c=new Post(set.getInt("pid"),set.getString("ptittle"),set.getString("pcontent"),set.getString("pcode"),set.getTimestamp("pdate"),set.getInt("cid"),set.getInt("userid"),set.getString("ppic"));
                 l.add(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PostDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return l;
    }
    public List<Post> getAllPostByCategory(int c_id){
            List<Post> l=null;
            try {
          
            String query = "select * from  post Where cid=?";
            PreparedStatement pstm =conn.prepareStatement(query);
            pstm.setInt(1,c_id);
            ResultSet set=pstm.executeQuery();
            l=new ArrayList<Post>();
            while(set.next()){
                 Post c=new Post(set.getInt("pid"),set.getString("ptittle"),set.getString("pcontent"),set.getString("pcode"),set.getTimestamp("pdate"),set.getInt("cid"),set.getInt("userid"),set.getString("ppic"));
                 l.add(c);
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PostDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return l;
    }

}
