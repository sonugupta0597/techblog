/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelpingClass;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pc
 */
public class SessionFactoryObject {
    
    public static SessionFactory getSessionFactoryObject(){
        
        
        SessionFactory factory=new Configuration().configure("Resources/hibernate.cfg.xml").
                buildSessionFactory();
        
        return factory;
   
    }
}
