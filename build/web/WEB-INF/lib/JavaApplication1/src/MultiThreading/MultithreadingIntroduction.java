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
class SecondThread extends Thread{

     public void run(){
      
         for(int i=0;i<1000;i++){
              System.out.println("secondThread = "+i);
         }
     }

}
public class MultithreadingIntroduction {
    public static void main(String[] args) {
        SecondThread secodeThread = new SecondThread();
        secodeThread.start();
        
         for(int i=0;i<1000;i++){
              System.out.println("main thread = "+i);
         }
    }
}
