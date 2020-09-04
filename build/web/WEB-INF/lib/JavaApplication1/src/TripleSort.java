
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
class TripleSort {

    public static void main(String[] args) throws IOException {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(b.readLine().trim());

        for (int i1 = 0; i1 < t; i1++) {
            String s=b.readLine();
            
            String ss[]=s.split(" ");
            int n = Integer.parseInt(ss[0]);
            int k = Integer.parseInt(ss[1]);
            int ar[] = new int[n];
            int operations = 0;
            int br[] =new int[n];
           
            ArrayList<Integer> l = new ArrayList<Integer>();

            
            s=b.readLine();
            ss=s.split(" ");
            for (int j = 0; j <n; j++) {
                ar[j] = Integer.parseInt(ss[j]);
                br[ar[j]-1]=j;
            }

           

            for (int i = 0; i < n; i++) {

                if (i+1 != ar[i]) {

                    int j=br[i];
                    if (ar[j]==i+1 && ar[i]!=j+1) {
                        
                        
                        int r=ar[i]-1;
                        
                        
                        
                        l.add(i+1);
                        l.add(r+1);
                        l.add(j+1);

                        br[ar[r]-1]=j;
                        br[i]=i;
                        br[r]=r;
                        
                        int temp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = ar[r];
                        ar[r] = temp;

                        operations++;
                        

                    }
                  
                }

            }

            ArrayList<Integer> l2=new ArrayList<>();
            
            int count1=0;
            
            for (int i = 0; i <n; i++) {

                          int j=br[i];
                          
                    if (i+1==ar[j]&& ar[i]==j+1 && ar[i]!=0 && ar[i]!=i+1) {

                         l2.add(i+1);
                         l2.add(j+1);
                         ar[j]=0;
                         count1++;
                    }

                }
            

            

            if (count1 % 2 != 0) {
                System.out.println(-1);
            } else {
                if (operations + count1 > k) {
                    System.out.println(-1);
                } else {
                    System.out.println(operations + count1);
                    int m = 0;
                    while (m < l.size()) {
                        System.out.print(l.get(m) + " "+l.get(m+1)+" "+l.get(m+2));
                        m=m+3;
                        System.out.println("");
                    }

                    m = 0;
                    while (m < l2.size()) {
                        System.out.println(l2.get(m) + " " + l2.get(m + 3) + " " + l2.get(m + 1));
                        System.out.println(l2.get(m + 3) + " " + l2.get(m + 1) + " " + l2.get(m + 2));
                        m = m + 4;
                    }
                }
            }
        }
    }
}
