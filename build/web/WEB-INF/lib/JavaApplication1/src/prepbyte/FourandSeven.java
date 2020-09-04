/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class FourandSeven {
   public static void main(String args[]) throws IOException {
    
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    
    for(int i=0;i<t;i++)
    {
      int n=scan.nextInt();
      
      char ch[]=new char[10];
      
      Arrays.fill(ch,'0');
      
      int value=0;
      
      recursion(n,ch,value);
    }
  }
  
  static void recursion(int n,char ch[],int value){
    
    String s="";
      int j=0;
      for(j=0;j<4;j++){
        s=s+ch[j];
          
      }
      String ss="";
    for(j=4;j<10;j++){
      ss=ss+ch[j];
      
    }
      
    int a=Integer.parseInt(s,2);
    int b=Integer.parseInt(ss,2);
    
      
      
    if(a>11||b>59){
      return;
    }
    if(n==0)
    {
        
      if((""+b).length()==1)
      System.out.println(a+":"+0+b);
      else
      System.out.println(a+":"+b);
      return;
    }
    else{
        if(value>=ch.length){
            return;
        }
      for(int k=1;k>=0;k--){
        if(k==0){
          ch[value]='0';
          recursion(n,ch,value+1);
        }
        else{
          ch[value]='1';
          recursion(n-1,ch,value+1);
        }
        ch[value]='0';
      }
      
    }
    
  }
}
