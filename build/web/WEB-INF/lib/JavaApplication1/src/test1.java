/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
		    
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		int onesx=0;
		int threesx=0;
		int onesy=0;
		int twosy=0;
		
		int ar[]=new int[x];
		int br[]=new int[y];
		
		for(int j=0;j<x;j++){
		    ar[j]=scan.nextInt();
		    if(ar[j]==1){
		        onesx++;
		    }
		    if(ar[j]==3){
		        threesx++;
		    }
		}
		
		for(int j=0;j<y;j++){
		    br[j]=scan.nextInt();
		    
		    if(br[j]==1){
		        onesy++;
		    }
		    if(br[j]==2){
		        twosy++;
		    }
		    
		}
		
		
		Arrays.sort(br);
		
		int count=0;
		    for(int j=0;j<x;j++){
		        if(ar[j]!=1){
		            int index=Integer.MAX_VALUE;
		            if(ar[j]==2){
		                   index = findmax(4,br);
		            }
		            else{
		                  index = findmax(ar[j],br);
		            }
		            if(index!=Integer.MAX_VALUE){
		                  count=count+(br.length-index);
		            }
		        }
		    }
		    count=count+onesy*(x-onesx)+threesx*twosy;
		    System.out.println(count);
		}
	}
	
	public static int findmax(int value,int br[]){
	       int l=0;
	       int r=br.length-1;
	       int result=Integer.MAX_VALUE;
	       while(l<=r){
	                  
	           int mid=(l+r)/2;
                   System.out.println(mid);
	           if(br[mid]<=value){
	               l=mid+1;
	           }
	           else{
	               if(result>mid){
	                   result=mid;
	               }
	                  r=mid-1;
	                  
	           }
	       }
	       return result;
	}
}