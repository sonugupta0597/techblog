
import java.util.ArrayList;

import java.util.Scanner;


public class D{
    public static void main(String[] args) {
        
        
        int oneToNine[] = new int[10];
        
        oneToNine[1]=2;
        oneToNine[2]=1;
        oneToNine[3]=2;
        oneToNine[4]=2;
        oneToNine[5]=2;
        oneToNine[6]=1;
        oneToNine[7]=2;
        oneToNine[8]=2;
        oneToNine[9]=2;
        
        int oneToHundred[] = new int[101];
        
        oneToHundred[0]=0;
        oneToHundred[10]=1;
        oneToHundred[11]=3;
        oneToHundred[12]=2;
        oneToHundred[13]=3;
        oneToHundred[14]=4;
        oneToHundred[15]=3;
        oneToHundred[16]=3;
        oneToHundred[17]=4;
        oneToHundred[18]=4;
        oneToHundred[19]=4;
        
        oneToHundred[20]=1;
        oneToHundred[30]=1;
        oneToHundred[40]=1;
        oneToHundred[50]=1;
        oneToHundred[60]=1;
        oneToHundred[70]=2;
        oneToHundred[80]=2;
        oneToHundred[90]=2;
        oneToHundred[100]=2;
        
        
        for(int i=0;i<=90;i=i+10){
            if(i==10){
                  continue;
            }
            for(int j=1;j<=9;j++){
                 oneToHundred[i+j]=oneToHundred[i]+oneToNine[j];
            }
        } 
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int ar[] = new int[n];
        int sum=0;
        
        for(int i=0;i<n;i++){
              
              ar[i]=scan.nextInt();
              sum=sum+oneToHundred[ar[i]];
        }
        
        int count=0;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                  
                       if(x.contains(ar[j])&&y.contains(ar[i])){
                            continue;
                       }
                       if(ar[i]+ar[j]==sum){
                              count++;
                              x.add(ar[i]);
                              y.add(ar[j]);
                       }
                 
                 
             }
        }
        String str[] = {"zero","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen ","twenty ","twenty one ","twenty two ","twenty three ","twenty four ","twenty five ","twenty six ","twenty seven ","twenty eight ","twenty nine ","thirty ","thirty one ","thirty two ","thirty three ","thirty four ","thirty five ","thirty six ","thirty seven ","thirty eight ","thirty nine ","forty ","forty one ","forty two ","forty three ","forty four ","forty five ","forty six ","forty seven ","forty eight ","forty nine ","fifty ","fifty one ","fifty two ","fifty three ","fifty four ","fifty five ","fifty six ","fifty seven ","fifty eight ","fifty nine ","sixty ","sixty one ","sixty two ","sixty three ","sixty four ","sixty five ","sixty six ","sixty seven ","sixty eight ","sixty nine ","seventy ","seventy one ","seventy two ","seventy three ","seventy four ","seventy five ","seventy six ","seventy seven ","seventy eight ","seventy nine ","eighty ","eighty one ","eighty two ","eighty three ","eighty four ","eighty five ","eighty six ","eighty seven ","eighty eight ","eighty nine ","ninety ","ninety one ","ninety two ","ninety three ","ninety four ","ninety five ","ninety six ","ninety seven ","ninety eight ","ninety nine ","hundred "};
        
        for(int i=0;i<str.length;i++){
               str[i]=str[i].trim();
               if(str[i].contains(" ")){
                     String s[] = str[i].split(" ");
                     str[i]=s[0]+s[1];
               }
        }
        
        if(count<=100){
               System.out.println(str[count]);
        }
        else{
              System.out.println("greater 100");
        }
        
        
    }
    
   
}
