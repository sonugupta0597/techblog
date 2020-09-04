
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
public class CollisionCourse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c=scan.nextInt();
        
        int x[]=new int[c];
        int y[]=new int[c];
        int s[]=new int[c];
        
        for(int j=0;j<c;j++){
        
            x[j]=scan.nextInt();
            y[j]=scan.nextInt();
            s[j]=scan.nextInt();
        
        }
        
        ArrayList<Double> l = new ArrayList<Double>();
        
        for(int j=0;j<c;j++){
        
            long xx= x[j];
            long yy=y[j];
            long ss=s[j];
            
            double result= Math.sqrt(Math.pow(xx,2)+Math.pow(yy, 2))/ss;
            
            l.add(result);
        
        }
        
        Collections.sort(l);
        
        int count=1;
        long result=0;
        double value=l.get(0);
        
        for(int j=1;j<l.size();j++){
             if(value==l.get(j)){
                 count++;
             }
             else{
                   result=result+((count*(count-1))/2);
                   System.out.println(count+" "+j+" "+result);
                   value=l.get(j);
                   count=1;
             }
        }
        if(count>1){
            System.out.println(count+" "+result);
            result=result+((count*(count-1))/2);
            System.out.println(count+" "+result);
        }
        
        System.out.println(result);
    }

    
}
