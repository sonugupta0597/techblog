
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
public class Dole_Out_Cadbury {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minl=scan.nextInt();
        int maxl=scan.nextInt();
        int minw=scan.nextInt();
        int maxw=scan.nextInt();
        int count=0;
        for(int i=minl;i<=maxl;i++){
             for(int j=minw;j<=maxw;j++){
                  int length=Math.max(i, j);
                  int width=Math.min(i, j);
                  while( length!=0 && width!=0){
                         int min=(int)Math.min(length,width);
                         count=count+((int)Math.max(length,width)/min);
                         
                         width=length%min;
                         length=min;
                         
                  }
             }
        }
        
        System.out.println(count);
        
    }
}
