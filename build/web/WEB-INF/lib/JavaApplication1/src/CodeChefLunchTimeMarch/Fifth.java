/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChefLunchTimeMarch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Fifth {
    public static void main(String args[]) throws IOException {
    
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    
    for(int i=0;i<t;i++)
    {
      String s=scan.next();
      
      ArrayList<Character> l=new ArrayList<Character>();
      int value=0;
      int index=0;
      recursion(value,s,l,index);
      
    }
    
  }
  
  static void recursion(int value,String s,ArrayList<Character> l,int index)
  {
    if(value>s.length()){
      return;
    }
    else{
        
      for(int j=0;j<l.size();j++){
        System.out.print(l.get(j));
      }
      System.out.println();
      for(int j=value;j<s.length();j++){
        char ch=s.charAt(j);
        l.add(ch);
        index++;
        recursion(j+1,s,l,index);
        index--;
        l.remove(index);
      }
    }
  }
}
