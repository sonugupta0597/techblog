/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Arrays;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class ArrayZigzag {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ar[]=new int[n];
        int br[]=new int[n];
        int cr[]=new int[n];
        for(int i=0;i<n;i++){
             ar[i]=scan.nextInt();
             br[i]=ar[i];
             cr[i]=ar[i];
        }
        
        int firstcount=0;
        int secondcount=0;
        
        for(int i=1;i<n;i=i+2){
              if(i-1>=0&&ar[i]-ar[i-1]>=0){
                   firstcount=firstcount+ar[i]-ar[i-1]+1;
                   ar[i]=ar[i]-(ar[i]-ar[i-1]+1);
              }
              if(i+1<n&&ar[i]-ar[i+1]>=0){
              
                   firstcount=firstcount+ar[i]-ar[i+1]+1;
                   ar[i]=ar[i]-(ar[i]-ar[i+1]+1);
              }
        }
        
         for(int i=0;i<n;i=i+2){
              if(i-1>=0&&br[i]-br[i-1]>=0){
                   secondcount=secondcount+br[i]-br[i-1]+1;
                   br[i]=br[i]-(br[i]-br[i-1]+1);
              }
              if(i+1<n&&br[i]-br[i+1]>=0){
              
                   secondcount=secondcount+br[i]-br[i+1]+1;
                   br[i]=br[i]-(br[i]-br[i+1]+1);
              }
        }
         
         System.out.println((int)Math.min(firstcount,secondcount));
    }
}
