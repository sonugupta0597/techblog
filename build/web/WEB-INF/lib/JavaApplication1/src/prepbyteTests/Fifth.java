/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyteTests;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Fifth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
            String s1=scan.next();
            String s2=scan.next();
            int br[]=new int[s2.length()];
            int ar[]=new int[s2.length()];
            for(int j=0;j<br.length;j++){
                 br[j]=Integer.parseInt(""+s2.charAt(j));
                 ar[j]=Math.abs(br[j]-2);
            }
            
            for(int j=1;j<br.length;j++){
                 br[j]=br[j]+br[j-1];
                 ar[j]=ar[j]+ar[j-1];
            }
            
            long result=0;
            
            for(int j=0;j<s1.length();j++){
                 char ch = s1.charAt(j);
                 if(ch=='2'){
                     if(j==0)
                       result=result+ar[s2.length()-(s1.length()-j)];
                     else{
                       result=result+ar[s2.length()-(s1.length()-j)]-ar[j-1];
                     }
                 }
                 else{
                     if(j==0)
                       result=result+br[s2.length()-(s1.length()-j)];
                     else{
                       result=result+br[s2.length()-(s1.length()-j)]-br[j-1];
                     }
                 }
            }
            
            System.out.println(result);
            
        
    }
}
