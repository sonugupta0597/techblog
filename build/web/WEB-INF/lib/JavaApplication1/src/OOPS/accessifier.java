/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;

/**
 *
 * @author pc
 */
class A{
    private int a;
    protected int b;
    public int c;
    
    private void ab(){
    
    }
}

class B extends A{
      void aa(){
           b=0;
      }
}

public class accessifier {
   protected int a;
    public static void main(String[] args) {
        
        A a = new A();
        
        a.a=0;
        a.b=0;
        a.ab();
        
        B b = new B();
        
        b.b=0;
        
        
    }
}

class c {
      
    void ca(){
        
        accessifier a = new accessifier();
        a.a=0;
        
    }
}
