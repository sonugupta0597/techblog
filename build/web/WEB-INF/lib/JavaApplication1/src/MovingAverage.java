
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mv1 = scan.nextInt();
        int mv2 = scan.nextInt();

        int n = scan.nextInt();

        double ar[] = new double[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextDouble();
        }

        double mvDay1[] = new double[n];
        
        for (int i = 0; i < mv1 - 1; i++) {
            mvDay1[i] = ar[i];
        }
        
        double mvDay2[] = new double[n];
        
        for (int i = 0; i < mv2 - 1; i++) {
            mvDay2[i] = ar[i];
        }
        
        if (ar.length >= mv1) {
             double sum = 0;
                for (int j = mv1-1; j >=0; j--) {
                    sum = sum + ar[j];
                }
                mvDay1[mv1-1] = sum ;
                
                 for (int j = mv1; j<ar.length; j++) {
                    mvDay1[j]= mvDay1[j-1]+ar[j]-ar[j-mv1];
                }
                
                  for (int j = mv1-1; j<ar.length; j++) {
                    mvDay1[j]= mvDay1[j]/mv1;
                }
            
        }

        if (ar.length >= mv2) {
            
            double sum = 0;
                for (int j = mv2-1; j >=0; j--) {
                    sum = sum + ar[j];
                }
                
                mvDay2[mv2-1] = sum ;
                
                for (int j = mv2; j<ar.length; j++) {
                    mvDay2[j]= mvDay2[j-1]+ar[j]-ar[j-mv2];
                }
                
                for (int j = mv2-1; j<ar.length; j++) {
                    mvDay2[j]= mvDay2[j]/mv2;
                }
           
        }
        
        double s1=mvDay1[Math.min(mv1, mv2)-1];
        double s2=mvDay2[Math.min(mv1, mv2)-1];
        
        int count=0;
        
        if(s1>=s2){
            
                    boolean result = true;
                    
                    for(int j=Math.min(mv1,mv2);j<ar.length;j++){
                        s1=mvDay1[j];
                        s2=mvDay2[j];
                          if((result==true&&s1>=s2) || (result==false&&s1<s2)){
                                 continue;
                          }
                          else{
                                   count++;
                                   
                                   result=!result;
                                   
                          }
                    }
        }
        else{
               
             boolean result = false;
                    
                    for(int j=Math.min(mv1,mv2);j<ar.length;j++){
                        s1=mvDay1[j];
                        s2=mvDay2[j];
                       
                          if(result==true&&s1>=s2 || result==false&&s1<=s2){
                                 continue;
                          }
                          else{
                                   count++;
                                   
                                   result=!result;
                                   
                          }
                    }
        
        }
        
        System.out.print(count-1);
       
    }

}
