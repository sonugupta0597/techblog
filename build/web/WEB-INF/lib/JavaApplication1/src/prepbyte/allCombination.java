import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner scan=new Scanner(System.in);
    
    int n=scan.nextInt();
    
    int ar[]=new int[n];
    
    for(int i=0;i<n;i++)
    {
      ar[i]=scan.nextInt();
    }
    
    ArrayList<Integer> l= new ArrayList<Integer>();
    
    int value=0;
    
    recursion(value,l,ar);
    
    
  }
  
  static void recursion(int value , ArrayList<Integer> l , int ar[])
  {
       if(value==ar.length)
       {
         for(int j=0;j<l.size();j++)
         {
           System.out.print(l.get(j)+" ");
         }
         System.out.println();
       }
       else
       {
         for(int j=0;j<ar.length;j++)
         {
                
                 int a=ar[j];
                 if(!l.contains(a)){
                 l.add(a);
                 recursion(value+1,l,ar);
                 l.remove(value);
                 }
         }
         
       }
  }
}