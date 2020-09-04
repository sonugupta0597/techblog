/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class Dfraction {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            recursion(a,b);
            System.out.println("");
        }
    }

    private static void recursion(int a, int b) {
        if(a==0||b==0){
             return;
        }
        if(a>b){
           System.out.print("1/"+(a/b)+" ");
            recursion(a%b,b);
        }
        else if(a%b==0){
            System.out.print("1/"+a/b+" ");
            return;
        }
        else if(a==1){
            System.out.print(b+" ");
        }
        else{
            int n=(int)Math.ceil((double)b/a);
            System.out.print(n+" ");
            recursion(a*n-b,b*n);
        }
    }
}
