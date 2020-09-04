/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.entities;

/**
 *
 * @author pc
 */
public class Message {
    private String Message;
    private String type;
    private String cssType;

    public Message(String Message, String type, String cssType) {
        this.Message = Message;
        this.type = type;
        this.cssType = cssType;
    }
    
    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCssType() {
        return cssType;
    }

    public void setCssType(String cssType) {
        this.cssType = cssType;
    }
    
    
}
