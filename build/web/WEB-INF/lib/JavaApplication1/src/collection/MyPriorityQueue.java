/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.PriorityQueue;

/**
 *
 * @author pc
 */
public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> p = new PriorityQueue<>();
        
        p.add("b");
        p.add("A");
        
        System.out.println(p);
    }
            
}
