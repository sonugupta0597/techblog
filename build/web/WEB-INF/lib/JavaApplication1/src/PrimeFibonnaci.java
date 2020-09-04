
import java.util.ArrayList;
import java.util.Collections;
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
public class PrimeFibonnaci {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        for(int j=n1;j<=n2;j++){
              if(isPrime(j)){
                  l.add(j);
              }
        }
        ArrayList<Long> l1 = new ArrayList<Long>();
        
        for(int j=0;j<l.size();j++){
             for(int k=0;k<l.size();k++){
                    if(j!=k){
                          String s = ""+l.get(j)+l.get(k);
                          long v = Long.parseLong(s);
                          if(!l1.contains(v)){
                               l1.add((long)v);
                          }
                    }
             }
        }
        ArrayList<Long> l2 = new ArrayList<Long>();
        
        for(int j=0;j<l1.size();j++){
              if(isPrime(l1.get(j))){
                  l2.add(l1.get(j));
              }
        }
        
        Collections.sort(l2);
        
        long first=l2.get(0);
        long second=l2.get(l2.size()-1);
        
        long value=0;
        
        for(int j=3;j<=l2.size();j++){
        
            value=first+second;
            first=second;
            second=value;
        
        }
        
        System.out.println(value);
    }

    private static boolean isPrime(long j) {
        boolean value=true;
        
        for(int k=2;k<j;k++){
            if(j%k==0){
                  value=false;
                  break;
            }
        }
        
        return  value;
    }
}
