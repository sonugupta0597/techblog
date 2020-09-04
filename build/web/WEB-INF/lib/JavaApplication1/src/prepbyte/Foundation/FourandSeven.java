/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Foundation;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class FourandSeven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
            int n=scan.nextInt();
            int count4=0;
            int count7=0;
            int fours=Integer.MIN_VALUE;
            int sevens=Integer.MIN_VALUE;
            int v=0;
            while(4*v<=n){
                  int r=(n-4*v)%7;
                  count7=(n-4*v)/7;
                  count4=v;
                  if(r==0&&count7>sevens){
                      fours=count4;
                      sevens=count7;
                  }
                  v++;
            }
            if(fours!=Integer.MIN_VALUE||sevens!=Integer.MIN_VALUE){
                for(int j=0;j<fours;j++){
                     System.out.print(4);
                }
                for(int j=0;j<sevens;j++){
                     System.out.print(7);
                }
                System.out.println("");
            }
            else 
            {
                System.out.println("-1");
            }
        
    }
}
