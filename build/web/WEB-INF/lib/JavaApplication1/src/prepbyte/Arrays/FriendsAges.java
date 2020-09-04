/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Arrays;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class FriendsAges {

    public static void main(String[] args) {
        System.out.println(Math.pow(4,-1)%998244353);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double ar[] = new double[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextDouble();
        }
        int countRequests = 0;

        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                
                if ((ar[k]<=0.5*ar[j]+7||(ar[k]>100&&ar[j]<100)||ar[k]>ar[j])) {
                          
                }
                else
                {
                    
                       countRequests++;
                }
                
                if ((ar[j]<=0.5*ar[k]+7||(ar[j]>100&&ar[k]<100)||ar[j]>ar[k])) {
                         
                }
                else
                {
                       countRequests++;
                }

            }
        }
        
        
        System.out.println(countRequests);
    }
}
