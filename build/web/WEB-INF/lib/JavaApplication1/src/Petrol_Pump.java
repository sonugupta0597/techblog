
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Petrol_Pump {
    static int result=Integer.MAX_VALUE;
    static int diff=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int ar[]=new int[str.length];
        
        for(int i=0;i<str.length;i++){
              ar[i]=Integer.parseInt(str[i]);
        }
        
        int first=0;
        int second=0;
        int value=0;
        result=Integer.MAX_VALUE;
        recursion(first+ar[value],second,value+1,ar);
        recursion(first,second+ar[value],value+1,ar);
        
        System.out.println(result);
    }

    private static void recursion(int first, int second, int value,int ar[]) {
        if(value==ar.length){
            if ((int)Math.abs(first-second)<diff) {
                  diff=Math.abs(first-second);
                  if(Math.max(first,second)<result){
                          result=Math.max(first,second);
                }
            }
                
                return;
        }
        
        
        recursion(first+ar[value],second,value+1,ar);
        recursion(first,second+ar[value],value+1,ar);
        
    }
}
