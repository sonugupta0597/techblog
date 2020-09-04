/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.greedy;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class DigitGame {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             String n=scan.next();
             int m=scan.nextInt();
             String result="";
             int index=0;
             int maximum=Integer.MIN_VALUE;
             int l=0;
             for(int j=1;j<=(n.length()-m);j++){
                 maximum=Integer.MIN_VALUE;
                 for(int k=index;k<n.length();k++){
                      int a=Integer.parseInt(n.charAt(k)+"");
                      
                      if(maximum<a&&n.length()-(k)>=n.length()-m-l){
                            index=k;
                            maximum=a;
                      }
                      
                    }
                 result=result+n.charAt(index);
                 index++;
                 l++;
             }
             System.out.println(result);
        }
    }
}
