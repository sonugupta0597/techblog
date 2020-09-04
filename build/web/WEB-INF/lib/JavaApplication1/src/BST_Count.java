
import java.io.IOException;
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
public class BST_Count {
    public static void main(String args[]) throws IOException {
      
      Scanner scan = new Scanner(System.in);
      int t=scan.nextInt();
      
      for(int i=0;i<t;i++){
          int n=scan.nextInt();
          long result=0;
          long ar[]=new long[n];
          
          for(int j=1;j<=n;j++){
              result=result+bst(j-1,ar)*bst(n-j,ar);
          }
          System.out.println(result);
      }
      
    }
    
    public static long bst(int start,long ar[]){
        System.out.println("Sonu");
      long result=0;
      if(start==1||start==0){
        return 1;
      }else{
        if(ar[start]>0){
              return ar[start];
        }
        else{
          for(int j=1;j<=start;j++){
              result=result+bst(j-1,ar)*bst(start-j,ar);
          }
          ar[start]=result;
          return result;
        }
      }
    }
}
