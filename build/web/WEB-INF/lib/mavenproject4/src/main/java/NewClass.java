/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pc
 */
public class NewClass {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        System.out.println("ndskmskcmskd");
    }
}
