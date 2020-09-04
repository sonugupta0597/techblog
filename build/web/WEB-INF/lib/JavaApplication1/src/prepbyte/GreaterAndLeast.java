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
class GreaterAndLeast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int m = scan.nextInt();
            String s = "" + m;
            char ch[] = s.toCharArray();

            for (int j = ch.length - 1; j >= 1; j--) {
                if (Integer.parseInt(ch[j - 1] + "") < Integer.parseInt(ch[j] + "")) {

                    int lindex=j;
                    char c;
                    int b=Integer.parseInt(ch[j]+"");
                    int aa = Integer.parseInt(ch[j-1]+"");
                    for(int k=j+1;k<ch.length;k++){
                           if(aa<Integer.parseInt(ch[k]+"")&&Integer.parseInt(ch[k]+"")<=Integer.parseInt(ch[j]+"")){
                             lindex=k;
                           }
                    }
                     c=ch[lindex];
                    ch[lindex]=ch[j-1];
                    ch[j-1]=c;
                     int a = lindex;
                    while (a + 1 < ch.length && Integer.parseInt(ch[a] + "") >= Integer.parseInt(ch[a + 1] + "")) {
                        c = ch[a];
                        ch[a] = ch[a+1];
                        ch[a+1] = c;
                        a++;
                    }
                    break;
                }
            }

            String ss = "";
            for (int j = 0; j < ch.length; j++) {
                ss = ss + ch[j];
            }
            System.out.println(Integer.parseInt(ss));

        }
    }
}
