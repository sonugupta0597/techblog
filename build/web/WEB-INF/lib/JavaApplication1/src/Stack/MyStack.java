/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author pc
 */
public class MyStack {

    static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<Character>();
        String ss = "";
        String c = "+-*/^";
        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);

            if (ch == ')') {

                while (!st.isEmpty() && (!(st.peek() == '('))) {
                    ss = ss + st.pop();
                }

                st.pop();

            } else if (ch == '+' || ch == '^' || ch == '*' || ch == '-' || ch == '/' || ch == '(') {

                if (ch != '(') {

                    while (!st.isEmpty() && ((c.indexOf(ch) <= c.indexOf(st.peek())) || c.indexOf(ch) == '+' && st.peek() == '-' || c.indexOf(ch) == '-' && st.peek() == '+' || c.indexOf(ch) == '*' && st.peek() == '/' || c.indexOf(ch) == '/' && st.peek() == '*')) {

                        
                        if (st.peek() == '(') {
                            break;
                        }
                        ss=ss+st.pop();
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

    static long evalutePostfix(String str) {

        Stack<Long> st = new Stack<>();
        int n = str.length();
        for (int k = 0; k < n; k++) {
            String s = str.charAt(k) + "";

            if (s.equals("+")) {

                long a = st.pop();
                long b = st.pop();
                st.push(a + b);
            } else if (s.equals("*")) {
                long a = st.pop();
                long b = st.pop();
                st.push(a * b);
            } else if (s.equals("/")) {
                long a = st.pop();
                long b = st.pop();
                st.push(b / a);
            } else if (s.equals("-")) {
                long a = st.pop();
                long b = st.pop();
                st.push(b - a);
            } else {
                st.push(Long.parseLong(s));
            }
        }

        return st.pop();
    }

    static void simpleMethodForStockSpanProblem(int ar[]) {

        for (int i = 0; i < ar.length; i++) {

            int count = 0;

            for (int j = i; j >= 0; j--) {

                if (ar[j] <= ar[i]) {
                    count++;
                } else {
                    break;
                }

            }

            System.out.print(count + " ");

        }

    }

    static void stockSpanProblemUsingStack(int ar[]) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(0);

        System.out.print(1 + " ");

        for (int i = 1; i < ar.length; i++) {

            while (!stack.isEmpty() && ar[stack.peek()] <= ar[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.println(i + 1 + " ");
            } else {
                System.out.print(i - stack.peek() + " ");
            }

            stack.push(i);

        }

    }

    static int maxLengthBalancedParanthesis(String s) {

        Stack<Character> st = new Stack<Character>();
        int count = 0;

        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);
            if (ch == '<') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {

                    break;
                } else {
                    st.pop();
                    if (st.isEmpty()) {
                        count = k + 1;
                    }
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        System.out.println("infix to postfix coversion ...................... " + infixToPostfix("a+b-(c+d)*e"));

        System.out.println("evalute infix to postfix...................." + "=" + evalutePostfix("23+12+*"));

        int ar[] = {15, 1, 2, 5, 3, 6};

        System.out.print("SimpleMethodStockSpanProblemSloution.............15 1 2 5 3 6" + "=");

        simpleMethodForStockSpanProblem(ar);

        System.out.println("");

        System.out.print("stockSpanProblemSloutionUsingStack.............15 1 2 5 3 6" + "=");

        stockSpanProblemUsingStack(ar);

        System.out.println("");

        System.out.println("maxLengthBalancedParanthesisCheck................." + "=" + maxLengthBalancedParanthesis("<>>>"));

    }
}
