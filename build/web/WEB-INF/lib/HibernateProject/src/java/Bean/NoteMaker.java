/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.security.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author pc
 */
@Entity
public class NoteMaker {
    
    @Id
    @GeneratedValue
    private int id;
    private String tittle;
    private String content;
    

    public NoteMaker() {
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public NoteMaker(int id, String tittle, String content, Timestamp date) {
        this.id = id;
        this.tittle = tittle;
        this.content = content;
      
    }
    
    
}
