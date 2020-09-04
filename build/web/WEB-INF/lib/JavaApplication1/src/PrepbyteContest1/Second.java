/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrepbyteContest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Second {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        for(int i=0;i<t;i++){
               int n=Integer.parseInt(br.readLine().trim());
                
               System.out.print(n+" ");
               while(n>1){
                    if(n%2==0){
                        n=(int)Math.pow(n,1f/2);
                    }
                    else{
                            n=(int)Math.pow(n,3f/2);
                    }
                    System.out.print(n+" ");
               }
               System.out.println("");
               
        }
    }
}
