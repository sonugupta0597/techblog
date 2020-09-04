/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Matrixandcombination {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s[]=br.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        char ar[][]=new char[n][m];
        
        for(int j=0;j<n;j++){
            String ss[]=br.readLine().trim().split(" ");
              for(int k=0;k<m;k++){
                     ar[j][k]=ss[k].charAt(0);
              }
            
        }
        
        ArrayList<Character> l=new ArrayList<Character>();
        int value=0;
        
        recursion(value,ar,n,l,m);
        
        System.out.println("");
    }

    private static void recursion(int value, char[][] ar,int n,ArrayList<Character> l,int m) {
        if(value==n){
              for(int j=0;j<l.size();j++){
                   System.out.print(l.get(j));
              }
              System.out.print(" ");
        }
        else{
             for(int j=0;j<m;j++){
                 l.add(ar[value][j]);
                 recursion(value+1,ar,n,l,m);
                 l.remove(value);
             }
        }
    }
}
