
import java.util.ArrayList;
import java.util.Arrays;
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
class PossibleAttack2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             int n=scan.nextInt();
             int ar[]=new int[n];
             for(int j=0;j<n;j++){
                  ar[j]=scan.nextInt();
             }
             Arrays.sort(ar);
             ArrayList<String> check=new ArrayList<>();
             ArrayList<Integer> l=new ArrayList<Integer>();
             ArrayList<Integer> index=new ArrayList<Integer>();
             int value=0;
             recursion(ar,index,l,value,check); 
        }
    }

    private static void recursion(int[] ar, ArrayList<Integer> index, ArrayList<Integer> l, int value ,ArrayList<String> check) {
        if(value==ar.length){
              String s="";
              for(int j=0;j<value;j++){
                 s=s+" "+l.get(j);
              }
              if(!check.contains(s)){
                   System.out.println(s);
                   check.add(s);
              }
        }
        else{
              for(int j=0;j<ar.length;j++){
                   if(!index.contains(j)){
                         index.add(j);
                         l.add(ar[j]);
                         recursion(ar,index,l,value+1,check);  
                         index.remove(value);
                         l.remove(value);
                   }
              }
        }
    }
}
