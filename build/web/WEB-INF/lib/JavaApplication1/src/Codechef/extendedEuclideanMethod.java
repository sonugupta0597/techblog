/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author pc
 */
class extendedEuclideanMethod {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scan.next();
            String postString = convertToPostFix(s);

            long count_a = 0;
            long count_A = 0;
            long count_0 = 0;
            long count_1 = 0;

            long count_a2 = 0;
            long count_A2 = 0;
            long count_02 = 0;
            long count_12 = 0;

            if (s.length() == 1) {

                long inverse = modInverse(4, 998244353);

                System.out.print(inverse + " ");
                System.out.print(inverse + " ");
                System.out.print(inverse + " ");
                System.out.print(inverse + " ");

                System.out.println("");
                continue;
            }
            Stack<Long> st = new Stack<Long>();
            int length = 0;
            while (length < postString.length()) {
                char ch = postString.charAt(length);

                if (ch == '&' || ch == '|' || ch == '^') {

                    long lcount_a = st.pop();
                    long lcount_A = st.pop();
                    long lcount_0 = st.pop();
                    long lcount_1 = st.pop();

                    count_a2 = st.pop();
                    count_A2 = st.pop();
                    count_02 = st.pop();
                    count_12 = st.pop();

                    count_a = 0;
                    count_A = 0;
                    count_0 = 0;
                    count_1 = 0;

                    if (ch == '&') {
                        count_a =  lcount_a * count_a2 +lcount_a*count_12+lcount_1*count_a2;
                        count_A =  lcount_A * count_A2 +lcount_A*count_12+lcount_1*count_A2;
                        count_0 =  lcount_a*count_02+lcount_a*count_A2+lcount_A*count_02+lcount_A*count_a2+lcount_0*count_02+lcount_0*count_12+lcount_0*count_a2+lcount_0*count_A2+lcount_1*count_02;
                        count_1 =  lcount_1*count_12;

                    }

                    if (ch == '|') {

                        count_a =lcount_a*count_02+lcount_a*count_a2+lcount_0*count_a2;
                        count_A =lcount_A*count_02+lcount_A*count_A2+lcount_0*count_A2 ;
                        count_0 =lcount_0*count_02;
                        count_1 =lcount_a*count_12+lcount_a*count_A2+lcount_A*count_12+lcount_A*count_a2+lcount_0*count_12+lcount_1*(count_02+count_12+count_a2+count_A2);
                    }

                    if (ch == '^') {
                        count_a =lcount_a*count_02+lcount_A*count_12+lcount_1*count_A2+lcount_0*count_a2;
                        count_A =lcount_a*count_12+lcount_A*count_02+lcount_1*count_a2+lcount_0*count_A2;
                        count_0 =lcount_a*count_a2+lcount_A*count_A2+lcount_1*count_12+lcount_0*count_02;
                        count_1 =lcount_a*count_A2+lcount_A*count_a2+lcount_1*count_02+lcount_0*count_12;

                    }
                      st.push(count_1);
                      st.push(count_0);
                      st.push(count_A);
                      st.push(count_a);
                    
                } else {
                    st.push(1L);
                    st.push(1L);
                    st.push(1L);
                    st.push(1L);
                }
                length++;

            }
            
            count_a=st.pop();
            count_A=st.pop();
            count_0=st.pop();
            count_1=st.pop();
            
            long total = (count_0 + count_1 + count_A + count_a);

            long inverse = modInverse(total, 998244353);

            System.out.print(((count_0 % 998244353) * inverse) % 998244353 + " ");
            System.out.print(((count_1 % 998244353) * inverse) % 998244353 + " ");
            System.out.print(((count_a % 998244353) * inverse) % 998244353 + " ");
            System.out.print(((count_A % 998244353) * inverse) % 998244353 + " ");

            System.out.println("");

        }
    }

    static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1) {
            return 0;
        }

        while (a > 1) {
            // q is quotient 
            long q = a / m;

            long t = m;

            // m is remainder now, process 
            // same as Euclid's algo 
            m = a % m;
            a = t;
            t = y;

            // Update x and y 
            y = x - q * y;
            x = t;
        }

        // Make x positive 
        if (x < 0) {
            x += m0;
        }

        return x;
    }

    private static String convertToPostFix(String s) {
        Stack<Character> st = new Stack<Character>();
        String ss = "";
        String c = "&|^";
        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);

            if (ch == ')') {

                while (!st.isEmpty() && (!(st.peek() == '('))) {
                    ss = ss + st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop();
                }

            } else if (ch == '&' || ch == '|' || ch == '^' || ch == '(') {

                if (ch != '(') {
                    while (!st.isEmpty() && (c.indexOf(ch) <= c.indexOf(st.peek()))) {
                        ss = ss + st.pop();
                    }

                }

                st.push(ch);
            } else {
                ss = ss + ch;
            }
        }
        while (!st.isEmpty()) {
            ss = ss + st.pop();
        }
        return ss;
    }
}
