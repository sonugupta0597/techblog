/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.String;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MinusMinusisPlus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = scan.next();
            String s2 = scan.next();

            int s_1_length = 0;
            int s_2_length = 0;
            int flag = 0;
            while (s_1_length < s1.length() && s_2_length < s2.length()) {

                char ch1 = s1.charAt(s_1_length);
                char ch2 = s2.charAt(s_2_length);

                if (ch1 == '-' && ch2 == '+') {
                    if (s_1_length + 1 < s1.length() && s1.charAt(s_1_length + 1) == '-') {
                        s_1_length = s_1_length + 2;
                        s_2_length = s_2_length + 1;
                    } else {
                        flag = 1;
                        break;
                    }
                } else if (ch1 == '+' && ch2 == '-') {
                    flag = 1;
                    break;
                } else {
                    s_1_length = s_1_length + 1;
                    s_2_length = s_2_length + 1;
                }

            }
            
            if(flag==0&&s_1_length==s1.length()&&s_2_length==s2.length()){
                  System.out.println("Yes");
            }
            else
            {
                  System.out.println("No");
            }

        }
    }
}
