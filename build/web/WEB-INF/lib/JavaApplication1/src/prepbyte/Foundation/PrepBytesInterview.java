/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Foundation;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class PrepBytesInterview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(100000%210);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               int n=scan.nextInt();
               int m=scan.nextInt();
               
               int a=n%2;
               int b=m%2;
               
               if((a==1&&b==0)||(a==0&&b==1)){
                    System.out.println("Yes");
               }
               else
               {
                    System.out.println("No");
               }
        }
    }
}
