
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
public class TelevisionSets {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int ar[] = new int[365];
        int index=0;
        
        for(int m=1;m<=12;m++){
             if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
                  for(int k=1;k<=31;k++){
                       int value=(int)Math.pow(6-m,2)+Math.abs(k-15);
                       ar[index++]=value;
                  }
             }
             else if(m==4||m==6||m==9||m==11){
                  for(int k=1;k<=30;k++){
                        
                       int value=(int)Math.pow(6-m,2)+Math.abs(k-15);
                       ar[index++]=value;
                       
                  }
             }
             else{
                  for(int k=1;k<=28;k++){
                         
                       int value=(int)Math.pow(6-m,2)+Math.abs(k-15);
                       ar[index++]=value;
                       
                  }
             }
            
        }
        
        int n = scan.nextInt();
        int r1=scan.nextInt();
        int r2=scan.nextInt();
        
        int revenue= scan.nextInt();
        int result=n;
        for(int j=1;j<=n;j++){
             int nonAc=n-j;
             int ac=j;
             int total=0;
             for(int k=0;k<365;k++){
                   if(ar[k]>nonAc){
                         total=total+nonAc*r2;
                         int v=ar[k]-nonAc;
                         if(v>=j){
                               total=total+j*r1;
                         }else{
                               total=total+v*r1;
                         }
                   }else{
                      
                       total=total+ar[k]*r2;
                   
                   }
             }
             
             if(total>=revenue){
                  result=j;
                  break;
             }
             
        }
        
        System.out.println(result);
        
    }
}
