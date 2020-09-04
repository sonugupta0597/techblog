
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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

class A1 implements Comparable<A1>
{

    int a;
    @Override
    public int compareTo(A1 o) {
       if(this.a<o.a){
              return -1;
       }
       else if(this.a<o.a){
                 return 1;
       }
       else{
                 return 0;
       }
    }

      
}
public class K {
    public static void main(String[] args) throws IOException {
     
        ArrayList<A1> l =new ArrayList<A1>();
        
        A1 a= new A1();
        a.a=1;
        
        
        A1 a1= new A1();
        a1.a=4;
        
        
        A1 a2= new A1();
        a2.a=2;
        
        l.add(a1);
        l.add(a2);
        l.add(a);
        
        Collections.sort(l);
        
        for(int i=0;i<l.size();i++){
               
            System.out.println(l.get(i).a);
        }
        
                
    }
}
