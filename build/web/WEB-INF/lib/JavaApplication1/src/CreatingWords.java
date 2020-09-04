
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
public class CreatingWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        char ar[][] = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = scan.next().charAt(0);
            }
        }

        int t = scan.nextInt();

        int x[] = {0, 0, 1, -1};
        int y[] = {1, -1, 0, 0};

        for (int j = 0; j < t; j++) {
            String s = scan.next();
            int segment = 0;
            int x1 = -1;
            int y1 = -1;
            int result=0;
            for (int i = 0; i < m; i++) {
                for (int j1 = 0; j1 < n; j1++) {
                        if(ar[i][j]==s.charAt(0)){
                              segment=1;
                              x1=i;
                              y1=j1;
                              
                              result=recursion(x,y,segment,x1,y1,s,ar,m,n);
                              if(result==1){
                                   break;
                              }
                        }
                }
            }
            
                 if(result==1){
                     System.out.println("yes");
                 }
                 else{
                     System.out.println("no");
                 }
            

        }
    }

    private static int recursion(int[] x, int[] y, int segment, int x1, int y1,String s,char ar[][],int m,int n) {
        if(segment>s.length()){
               return 1;
        }
        else{
                   for(int j=0;j<4;j++){
                        int nextx=x1+x[j];
                        int nexty=y1+y[j];
                        
                        if(isvalid(nextx,nexty,s,ar,m,n,segment)==1){
                            
                              if(recursion(x,y,segment+1,nextx,nexty,s,ar,m,n)==1){
                                  System.out.println(nextx+" "+nexty);
                                  return 1;
                              }
                        }
                   }
        }
        return 0;
    }

    private static int isvalid(int nextx, int nexty,String s,char ar[][],int m,int n,int segment) {
                  if(nextx<m&&nextx>=0&&nexty>=0&&nexty<n&&ar[nextx][nexty]==s.charAt(segment))
                  {
                        return 1;
                  }
                  else{
                      return 0;
                  }
    }
}
