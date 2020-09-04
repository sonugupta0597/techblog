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
class CHANDF {
    static long result=0;
    static long z=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            long x=scan.nextLong();
            long y=scan.nextLong();
            long l=scan.nextLong();
            long r=scan.nextLong();
            z=x|y;
            
            if(x==0||y==0){
                 z=0;
            }
            if(z<=r){
            System.out.println(z);
            continue;
            }
            else{
                
                String ss=Long.toBinaryString(r);
                char ch1[]=ss.toCharArray();
                int index=-1;
                for(int j=0;j<ch1.length;j++){
                    
                      if(ch1[j]=='1')
                      {
                          index=j;
                          break;
                          
                      }
                      
                }
                String s=Long.toBinaryString(z);
                char ch[]=s.toCharArray();
                ArrayList<Integer> l1=new ArrayList<Integer>();
                int count1=0;
                int length=s.length();
                for(int j=0;j<ch.length;j++){
                    
                      if(ch[j]=='1' && j>=index)
                      {
                          count1++;
                          l1.add(j);
                          
                      }
                      
                }
                
                result=0;
                Arrays.fill(ch,'0');
                recursion(ch,count1-1,l1,l,r,length,x,y);
                
                 System.out.println(z);
            }
        }
    }

    private static void recursion(char[] ch, int count, ArrayList<Integer> l1, long l, long r,int length,long x,long y) {
        
        String s=new String(ch);
        long v=Long.parseLong(s,2);
        
        if(r<v||v<l){
             return;
        }
        
        if(count<0||length<=0)
        {
            
                long value=(x&v)*(y&v);
                
                if(result<value){
                    result=value;
                    z=v;
                }
                
            
            return;
        }
        else
        {   
             
            
                long value=(x&v)*(y&v);
                
                if(result<value){
                    result=value;
                    z=v;
                }
                
            
            
            ch[l1.get(count)]='1';
            recursion(ch,count-1,l1,l,r,length-1,x,y);
            ch[l1.get(count)]='0';
            recursion(ch,count-1,l1,l,r,length-1,x,y);
            
        }
        
    }
}
