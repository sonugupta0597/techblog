/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.String;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class FakePassword {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             String s1=scan.next();
             String s2=scan.next();
             String s=s2.substring(2)+s2.substring(0,2);
             
             if(s1.equals(s)){
                   System.out.println("Yes");
                   continue;
             }
             s=s2.substring(s2.length()-2)+s2.substring(0,s2.length()-2);
             if(s1.equals(s)){
                   System.out.println("Yes");
                   continue;
             }
             else
                 System.out.println("No");
        }
    }
}
