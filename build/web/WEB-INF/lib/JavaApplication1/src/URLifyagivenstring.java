
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class URLifyagivenstring {
    public static void main (String[] args) throws IOException {
		
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
                System.out.println("");
		for(int i=0;i<t;i++){
		    String s=br.readLine().trim();
                    
		    
		    int n=Integer.parseInt(br.readLine());
		    String str[]=s.split(" ");
		    for(int j=0;j<str.length;j++){
		        System.out.print(str[j]);
		        if(j!=str.length-1){
		            System.out.print("%20");
		        }
		    }
		    System.out.println();
                    
		}
	}
}
