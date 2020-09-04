/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyteTestSeries.String;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class EqualString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s[] = new String[n];
            for (int j = 0; j < n; j++) {
                s[j] = scan.next();
            }
            long minimumCount = Long.MAX_VALUE;
            int flag = 0;
            l1:  for (int j = 0; j < n; j++) {
                int localCount = 0;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        int index = s[j].indexOf(s[k].charAt(0));
                        String sub1 = s[j].substring(index);
                        String sub2 = s[k].substring(0, sub1.length());
                        if (sub1.equals(sub2)) {
                            String sub12 = s[j].substring(0, index);
                            String sub22 = s[k].substring(sub1.length());
                            if (sub12.equals(sub22)) {
                                localCount = localCount + sub12.length();
                            } else {
                                flag = 1;
                                break l1;
                            }
                        } else {
                            flag = 1;
                            break l1;
                        }
                    }

                }
                
                if(minimumCount>localCount){
                   minimumCount=localCount;
                }
            }
            
            if(flag==1){
                   System.out.println("-1");
            }
            else{
                   System.out.println(minimumCount);
            }
        }
    }
}
