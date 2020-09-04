/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.PREPBYTESINCEPTIONCHALLENGEIncept;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class Second {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
            int n=scan.nextInt();
            int m=scan.nextInt();
            int c=scan.nextInt();
            int k=scan.nextInt();
            int ar[]=new int[n+1];
            int br[]=new int[n+1];
            for(int j=1;j<=n;j++){
                ar[j]=scan.nextInt();
                br[j]=scan.nextInt();
            }
            int count=0;
            int flag=0;
            int j=0;
            for( j=1;j<n;j++){
                
                c=c-(br[j]-br[j-1]+k*(br[j]-br[j-1]));
                int fuel=br[j+1]-br[j]+k*(br[j+1]-br[j]);
                if(c>=fuel){
                   continue;
                }
                else{
                    count++;
                   c=c+ar[j];
                   if(c<fuel){
                      flag=1;
                      break;
                   }
                }
            }
                c=c-(br[j]-br[j-1]+k*(br[j]-br[j-1]));
                int fuel=m-br[j]+k*(m-br[j]);
                if(c>=fuel){
                   
                }
                else{
                   c=c+ar[j];
                   count++;
                }
                if(c<fuel){
                      flag=1;
                      
                   }
                if(flag==1){
                    System.out.println("-1");
                }
                else
                    System.out.println(count);
        
    }
}
