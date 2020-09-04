
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
public class TruckandCircularRoute {
    public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           
           int n=scan.nextInt();
           int ar[]=new int[n];
           int br[]=new int[n];
           for(int i=0;i<n;i++){
                  ar[i]=scan.nextInt();
           }
           
           for(int i=0;i<n;i++){
                  br[i]=scan.nextInt();
           }
           
           long a=0;
           long b=0;
           int result=0;
           int flag=0;
           long al=0;
           long bl=0;
           for(int i=0;i<n;i++){
                a=a+ar[i];
                b=b+br[i];
                 al=al+ar[i];
                 bl=bl+br[i];
                
                if(al-bl<0){
                     if(a-b<0){
                     result=-1;
                     flag=1;
                     }
                     al=0;
                     bl=0;
                }
                else {
                     if(flag<2)
                     result=i;
                     flag=2;
                }
                
                
           }
           
           if(a-b>=0){
               System.out.println(result);
           }
           else{
               System.out.println(-1);
           }
    }
}
