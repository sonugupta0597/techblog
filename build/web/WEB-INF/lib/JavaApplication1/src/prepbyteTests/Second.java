/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyteTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int t=Integer.parseInt(s.trim());
        for(int i=0;i<t;i++){
            String ss=br.readLine();
            long n=Long.parseLong(ss.trim());
            System.out.println((n/2)*3);
        }
    }
}
