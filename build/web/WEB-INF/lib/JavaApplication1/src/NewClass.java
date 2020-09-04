
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class NewClass {
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
       int ar[] =new int[n];
       
       for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
       }
       Arrays.sort(ar);
       
       int max=0;
       for(int i=0;i<n;i++){
           
           if((ar[i]*(n-i))>max){
               max=ar[i]*(n-i);
           }
           
       }
       
        System.out.println(max);
    }
}
