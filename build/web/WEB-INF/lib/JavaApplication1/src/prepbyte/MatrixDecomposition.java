/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class MatrixDecomposition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               int n=scan.nextInt();
               long a=scan.nextInt();
               int s=1;
               long count=0;
               for(int j=0;j<n;j++){
                     long p=power(a,s);
                     a=(a*p)%1000000007;
                     s=s+2;
                     count=(count+p)%(1000000007);
               }
               System.out.println(count);
        }
    }
    static long power(long x, int y) 
    { 
        long temp; 
        if( y == 0) 
            return 1; 
        temp = power(x, y/2);  
          
        if (y%2 == 0) 
            return (temp%(1000000007))*(temp%(1000000007))%(1000000007); 
        else
        { 
            if(y > 0) 
                return ((x%1000000007) * (temp%(1000000007)) * (temp%(1000000007)))%1000000007; 
            else
                return (temp%(1000000007))*(temp%(1000000007))%(1000000007) / x; 
        } 
    }   
  
  
    
}
