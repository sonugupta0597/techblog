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
class BirthdayGift {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            long a=scan.nextLong();
            long b=scan.nextLong();
            long d=scan.nextLong();
            if(d==0&&a==b){
                System.out.println("YES");
                continue;
            }
            if(d!=0&&Math.abs(b-a)%(Math.abs(d))==0 && b>=a && d>0){
                System.out.println("YES");
            }
            else if(d!=0&&Math.abs(b-a)%(Math.abs(d))==0 && b<=a && d<0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
