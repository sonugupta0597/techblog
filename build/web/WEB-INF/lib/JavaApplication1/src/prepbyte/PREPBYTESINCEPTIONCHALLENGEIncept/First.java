/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.PREPBYTESINCEPTIONCHALLENGEIncept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author pc
 */
class First {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine().trim();
            Stack<Character> st = new Stack<Character>();
            String ss = "aeiou123456789";
            long sum = 0;
            
            for (int j = 0; j < s.length(); j++) {
                if (!ss.contains(s.charAt(j) + "")) {
                    while (!st.isEmpty() && (st.peek() >= 48 && st.peek() <= 57)) {
                        sum = sum + Integer.parseInt(st.pop() + "");
                    }
                }
                st.push(s.charAt(j));

            }
            String result="";
            int s1=0;
            int flag=0;
            int size=st.size();
            while(!st.isEmpty()){
                  if(st.peek()>=48&&st.peek()<=57){
                        s1 = s1+ Integer.parseInt(st.peek()+ "");
                        flag++;
                  }
                  result=result+st.pop();
            }
            if(flag==size){
                System.out.println(s1);
                continue;
            }
            for(int j=result.length()-1;j>=0;j--){
                 System.out.print(result.charAt(j));
            }
            if(sum!=0){
                  System.out.print(sum);
            }
            System.out.println("");
            
        }
    }
}
