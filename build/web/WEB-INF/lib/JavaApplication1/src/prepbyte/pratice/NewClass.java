/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.pratice;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class NewClass {

    public static void main(String args[]) throws IOException {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s[] = new String[n];

            for (int j = 0; j < n; j++) {
                s[j] = scan.next();
            }

            int totalCount =Integer.MAX_VALUE;
            int flag = 0;
            l1: for (int j = 0; j < n; j++) {
                int c=0;
                for (int k = 0; k < n; k++) {
                    int f=0;
                    if (!s[j].equals(s[k])) {
                        
                        char ch1[]=s[j].toCharArray();
                        char ch2[]=s[k].toCharArray();
                        int lcount=0;
                        boolean b=false;
                        while(lcount<s[j].length()&&b==false){
                               char ch=ch2[0];
                               for(int j1=0;j1<ch2.length-1;j1++){
                                     ch2[j1]=ch2[j1+1];
                               }
                               ch2[ch2.length-1]=ch;
                               int h=0;
                               for(int j1=0;j1<ch2.length;j1++){
                                     if(ch1[j1]!=ch2[j1]){
                                          h=1;
                                     }
                               }
                               if(h==0){
                                    b=true;
                               }
                               lcount++;
                        }
                        
                        if(lcount==s[j].length()&&b==false){
                              flag=1;
                              break l1;
                        }
                        c=c+lcount;
                    }
                }
                
                if(c<totalCount){
                    totalCount=c;
                }
            }
            Integer.
            if(flag==1){
                System.out.println("-1");
                continue;
            }
            System.out.println(totalCount);

        }
    }

}
