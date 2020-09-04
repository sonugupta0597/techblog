
import java.util.ArrayList;
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
class PhilalandCoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        for(int i=0;i<t;i++){
             int n=scan.nextInt();
             ArrayList<Integer> l = new ArrayList<Integer>();
             l.add(1);
            
             for(int j=2;j<=n;j++){
                 int value=j;
                   for(int k=l.size()-1;k>=0;k--){
                        if(value-l.get(k)>=0){
                             value=value-l.get(k);
                        }
                        if(value==0){
                             break;
                        }
                   }
                   
                   if(value!=0){
                        l.add(j);
                   }
             }
             
             System.out.println(l.size());
             
        }
    }
}
