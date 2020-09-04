/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class LiftRequests {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               int n=scan.nextInt();
               int q=scan.nextInt();
               int floor=0;
               long count=0;
               for(int j=0;j<q;j++){
                     int a=scan.nextInt();
                     int b=scan.nextInt();
                     count=count+Math.abs(a-floor);
                     count=count+Math.abs(a-b);
                     floor=b;
               }
               System.out.println(count);
        }
    }
}
