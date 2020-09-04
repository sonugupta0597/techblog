import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner scan=new Scanner(System.in);
    
    String s=scan.next();
    String t=scan.next();
    
    char ch1[]=s.toCharArray();
    char ch2[]=s.toCharArray();
    
    int index1=0;
    int index2=0;
    
    boolean b=recursion(index1,index2,ch1,ch2);
    
    if(b==true){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
  
   static boolean recursion(int index1,int index2,char ch1[],char ch2[])
  {
    System.out.println(index1+" "+index2);
    if((index1==ch1.length&&index2!=ch2.length)||(index1!=ch1.length&&index2==ch2.length))
    {
      System.out.println(index1+" "+index2);
      return false;
    }
    else
    {
      if((index1==ch1.length&&index2==ch2.length)){
            return true;
      }
      else{
             if(ch2[index2]!='?'&&ch2[index2]!='*'){
               if(ch1[index1]!=ch2[index2]){
                 return false;
               }
               else{
                return recursion(index1+1,index2+1,ch1,ch2);
               }
             }
             else if(ch2[index2]=='?')
             {
              return recursion(index1+1,index2+1,ch1,ch2);
             }
             else
             {
              return recursion(index1+1,index2+1,ch1,ch2)||recursion(index1+1,index2,ch1,ch2);
             }
      }
    }
  }
  
 
  
}
  
