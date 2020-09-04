/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author pc
 */
class MyThread extends Thread{

}
class MyThread1 extends Thread{
     
    public void start(){
         for(int i=0;i<1000;i++){
              System.out.println("secondThread = "+i);
         }
    }
}
public class StartAndRunMethods {
    public static void main(String[] args) {
        MyThread1 mythread1 = new MyThread1();
        mythread1.start();
        
        for(int i=0;i<1000;i++){
              System.out.println("main thread = "+i);
         }
        
    }
}
