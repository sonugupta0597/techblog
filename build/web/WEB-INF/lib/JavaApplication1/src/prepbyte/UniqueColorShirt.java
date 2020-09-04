/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class UniqueColorShirt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ar[]=new int[1001];
        
        for(int i=0;i<n;i++){
               ar[scan.nextInt()]++;
        }
        int count=0;
        for(int i=0;i<1001;i++){
               if(ar[i]==1){
                     count++;
               }
        }
              System.out.println(count);
        
    }
}
