import java.util.*;
import java.io.*;
  
class Main1 {
    public static void main(String args[]) throws IOException {
      
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      
      for(int i=0;i<t;i++){
        int n = scan.nextInt();
        int ar[] = new int[n];
        
        for(int j=0;j<n;j++){
            ar[j]=scan.nextInt();
        }
        
       int result = mergesort(ar,0,n-1);
       
       System.out.println(result);
       
      }
      
    }
    
    public static int mergesort( int ar[] , int min , int max ){
         
         
         
         if(min==max){
           return 1;
         }
         
         int flag=0;
         
         for(int j=min+1;j<=max;j++){
                if(ar[j]<ar[j-1]){
                    flag=1;
                    break;
                }
         }
         
         if(flag==0){
                 return max-min+1;
         }
         
         int mid = (min+max)/2;
         
         
         int left = mergesort(ar,min,mid);
         int right = mergesort(ar,mid+1,max);
         
         return Math.min(left,right);
         
         
    }
    
  }