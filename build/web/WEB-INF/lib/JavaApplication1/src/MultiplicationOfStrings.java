import java.util.*;
  import java.io.*;
  
  public class MultiplicationOfStrings {
    public static void main(String args[]) throws IOException {
      
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      
      for(int i=0;i<t;i++){
        
        String s1=scan.next();
        String s2 = scan.next();
        
        int ar[][] = new int[Math.min(s1.length(),s2.length())][s1.length()+s2.length()+1];
        
        int row = 0;
        int col = s1.length()+s2.length();
        
        if(s1.length()<s2.length()){
          
           for(int l=s1.length()-1;l>=0;l--){
             
                 int carry =0;
                 
                 for(int r=s2.length()-1;r>=0;r--){
                     int value = Integer.parseInt(""+s1.charAt(l))*Integer.parseInt(""+s2.charAt(r));
                     value=value+carry;
                     
                     String s = ""+value;
                     
                     if(s.length()>1){
                          ar[row][col--]=Integer.parseInt(""+s.charAt(1));
                          carry = Integer.parseInt(""+s.charAt(0));
                     }
                     else{
                       ar[row][col--]=Integer.parseInt(""+s.charAt(0));
                          carry =0;
                     }
                     
                 }
                 
                 if(carry!=0)
                     ar[row][col--]=carry;
                 row++;
                 col = s1.length()+s2.length()-row;
                 
                 
           }
        
        }
        else{
          for(int l=s2.length()-1;l>=0;l--){
             
                 int carry =0;
                 
                 for(int r=s1.length()-1;r>=0;r--){
                     int value = Integer.parseInt(""+s2.charAt(l))*Integer.parseInt(""+s1.charAt(r));
                     value=value+carry;
                     
                     String s = ""+value;
                     
                     
                     
                     if(s.length()>1){
                          ar[row][col--]=Integer.parseInt(""+s.charAt(1));
                          carry = Integer.parseInt(""+s.charAt(0));
                     }
                     else{
                       ar[row][col--]=Integer.parseInt(""+s.charAt(0));
                          carry =0;
                     }
                     
                 }
                 if(carry!=0)
                     ar[row][col--]=carry;
                 row++;
                 col = s1.length()+s2.length()-row;
                 
           }
        }
        
       int carry =0;
        String result = "";
        for(int j=s1.length()+s2.length();j>=0;j--){
            int sum=0;
            for(int k =0;k<Math.min(s1.length(),s2.length());k++){
                 sum=sum+ar[k][j];
                
                 
            }
             String s =""+(sum+carry);
                 if(s.length()>1){
                     carry = Integer.parseInt (s.substring(0,s.length()-1));
                     result = result + s.charAt(s.length()-1);
                     
                 }else{
                     result = result + s.charAt(s.length()-1);
                     carry=0;
                 }
                 
                 
        
      }
      
      if(carry!=0)
      System.out.print(carry);
      int j=result.length()-1;
      for(j=result.length()-1;j>=0;j--){
             if(result.charAt(j)!='0'){
                   break;
             }
      }
      
      
      
      for(j=j;j>=0;j--){
           System.out.print(result.charAt(j));
      }
      
      System.out.println();
      }
    }
  }