/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.entities;

import java.sql.Timestamp;



/**
 *
 * @author pc
 */
public class Post {
    private int pId;
    private String pTittle;
    private String pContent;
    private String pCode;
    private Timestamp pDate;
    private int pCotegory;
    private int pAuther;
    private String postPic;

    public Post(int pId, String pTittle, String pContent, String pCode, Timestamp pDate, int pCotegory, int pAuther, String postPic) {
        this.pId = pId;
        this.pTittle = pTittle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pDate = pDate;
        this.pCotegory = pCotegory;
        this.pAuther = pAuther;
        this.postPic = postPic;
    }
    
    public Post(String pTittle, String pContent, String pCode, int pCotegory, int pAuther, String postPic) {
        this.pTittle = pTittle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pCotegory = pCotegory;
        this.pAuther = pAuther;
        this.postPic = postPic;
    }
    
    public Post(int pId, String pTittle, String pContent, String pCode, Timestamp pDate, int pCotegory, int pAuther) {
        this.pId = pId;
        this.pTittle = pTittle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pDate = pDate;
        this.pCotegory = pCotegory;
        this.pAuther = pAuther;
    }

    public Post(String pTittle, String pContent, String pCode, int pCotegory, int pAuther) {
        this.pTittle = pTittle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pCotegory = pCotegory;
        this.pAuther = pAuther;
    }

    public Post() {
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpTittle() {
        return pTittle;
    }

    public void setpTittle(String pTittle) {
        this.pTittle = pTittle;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public Timestamp getpDate() {
        return pDate;
    }

    public void setpDate(Timestamp pDate) {
        this.pDate = pDate;
    }

    public int getpCotegory() {
        return pCotegory;
    }

    public void setpCotegory(int pCotegory) {
        this.pCotegory = pCotegory;
    }

    public int getpAuther() {
        return pAuther;
    }

    public void setpAuther(int pAuther) {
        this.pAuther = pAuther;
    }

    public String getPostPic() {
        return postPic;
    }

    public void setPostPic(String postPic) {
        this.postPic = postPic;
    }
    
    
    
    
    
}
