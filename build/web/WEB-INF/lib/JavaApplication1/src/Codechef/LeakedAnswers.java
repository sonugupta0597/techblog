/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class LeakedAnswers {


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            
            String s[]=br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
           
            int count=0;
            int value=0;
            int result[];
            for (int r = 0; r < n; r++) {
                result=new int[m+1];
                value=0;
                count=0;
                String s1[]=br.readLine().trim().split(" ");
                for (int c = 0; c < k; c++) {
                     int a=Integer.parseInt(s1[c]);
                     result[a]++;
                     if(result[a]>count){
                                     count=result[a];
                                     value=a;
                     }
                }
                System.out.print(value+" ");
            }

            System.out.println("");

        }
    }



}
