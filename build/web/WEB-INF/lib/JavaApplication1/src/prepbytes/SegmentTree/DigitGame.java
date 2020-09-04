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
class DigitGame {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               String str=scan.next();
               char ch[]=str.toCharArray();
               int m=scan.nextInt();
               for(int j=0;j<m;j++){
                   int value=Integer.MAX_VALUE;
                   int index=-1;
                       for(int k=0;k<str.length();k++){
                               if(ch[k]!='a' && Integer.parseInt(ch[k]+"")<value){
                                         value=Integer.parseInt(ch[k]+"");
                                         index=k;
                               }
                       }
                       ch[index]='a';
               }
               String result="";
               for(int k=0;k<str.length();k++){
                           if(ch[k]!='a'){
                               result=result+ch[k];
                           }
               }
               System.out.println(result);
        }
    }
}
