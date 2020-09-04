/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
class A{
  A(String name){
        System.out.println(name);
  }
  
  public  void m(int a){
  
  }
       public int m(float a){
           return 0;
  }
       
}
public class ContructorInvocationbCheck extends A{
        ContructorInvocationbCheck(String name){
              super(name);
              System.out.println(name);
        }
            public void m(int a){
  
  } 
   
        
      public static void main(String[] args) {
        ContructorInvocationbCheck a = new ContructorInvocationbCheck("sonu");
        
    }
}
