/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class RectangularSweetBox {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
                 int n=scan.nextInt();
                 int ar[]=new int[n];
                 int count=0;
                 ArrayList<Integer> aa=new ArrayList<Integer>();
                 for(int j=0;j<n;j++){
                        int a=scan.nextInt();
                        ar[j]=a;
                        
                        aa.add(a);
                 }
                 
                 Arrays.sort(ar);
                 
                 
                 int index=0;
                 
                 for(int j=0;j<n;j++){
                     
                     if(aa.lastIndexOf(ar[j])>index){
                           count++;
                           index=aa.lastIndexOf(ar[j]);
                           int l=index;
                           while(l>0&&ar[l-1]==ar[l]){
                                 count++;
                                 l--;
                           }
                     }
                     if(index==n-1){
                          break;
                     }
                 }
                 
                 System.out.println(count);
                 
        }
    }
}
