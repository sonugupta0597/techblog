
import java.util.ArrayList;
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
class TWOSTRS {

    static void printSubSeqRec(String str, int n,
            int index, String curr,ArrayList<String> l) {
        // base case  
        if (index == n) {
            return;
        }
        l.add(curr);
        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            printSubSeqRec(str, n, i, curr,l);

            // backtracking  
            curr = curr.substring(0, curr.length() - 1);
        }
    }
 
    static void printSubSeq(String str,ArrayList<String> l) {
        int index = -1;
        String curr = "";

        printSubSeqRec(str, str.length(), index, curr,l);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            String a = scan.next();
            String b = scan.next();

            String ss1 = a + b;
            ArrayList<String> cocat = new ArrayList<String>();

            
            printSubSeq(ss1,cocat);

            int n = scan.nextInt();

            String ss[] = new String[n];

            int c[] = new int[n];

            for (int j = 0; j < n; j++) {
                ss[j] = scan.next();
                c[j] = scan.nextInt();
            }
            
            
            long totalResult=0;
            for (int j = 0; j < cocat.size(); j++) {
                String s = cocat.get(j);
               
                long totalValue=0;
                for(int k=0;k<n;k++){
                    int count=0;
                    for(int m=0;m<=s.length()-ss[k].length();m++)
                    {
                            if(s.substring(m,m+ss[k].length()).equals(ss[k])){
                                 count++;
                            }
                    }
                      
                      totalValue=totalValue+count*c[k];
                }
                
                if(totalResult<totalValue){
                      totalResult=totalValue;
                }

            }
               System.out.println(totalResult);

          
        }
    }
}
