
import java.util.HashMap;
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
class FoolishItems {
    static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              int n=scan.nextInt();
              if(n==2){
                  System.out.println(1);
                  continue;
              }
              else if(n==3){
                  System.out.println(2);
                  continue;
              }
              int result=n;
              for(int j=1;j<=n;j++){
                   result=Math.max(result,j*recursion(n-j));
              }
              if(!map.containsKey(n)){
                   map.put(n, result);
              }
              System.out.println(result);
    }
    }
    private static int recursion(int n) {
        if(n<=3){
           return n;
        }
        else{
              int result=n;
              if(map.containsKey(n)){
                  return map.get(n);
              }
              for(int j=1;j<=n;j++){
                   result=Math.max(result,j*recursion(n-j));
              }
              if(!map.containsKey(n)){
                   map.put(n, result);
              }
              return result;
        }
    }
}
