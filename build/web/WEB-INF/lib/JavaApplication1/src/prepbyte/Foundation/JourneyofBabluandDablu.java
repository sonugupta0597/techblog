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
class JourneyofBabluandDablu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ar[]=new String[8];
        ar[0]="SL";
        ar[1]="LB";
        ar[2]="MB";
        ar[3]="UB";
        ar[4]="LB";
        ar[5]="MB";
        ar[6]="UB";
        ar[7]="SL";
        int br[]=new int[8];
        br[0]=-1;
        br[1]=3;
        br[2]=3;
        br[3]=3;
        br[4]=-3;
        br[5]=-3;
        br[6]=-3;
        br[7]=1;
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              int n=scan.nextInt();
              System.out.println(n+br[n%8]+ar[n%8]);
        }
    }
}
