
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
class CreatingWords1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        char ch[][] = new char[n][m];
        

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                ch[r][c] = scan.next().charAt(0);
            }
        }
        int t = scan.nextInt();
        for (int j = 0; j < t; j++) {
            String s = scan.next();
            int ch1[][] = new int[n][m];
            int x[] = {0, 0, 1, -1};
            int y[] = {1, -1, 0, 0};

            int result = 0;
            int moveCount = 0;
            int index = 0;
            l1: for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    if (ch[r][c] == s.charAt(0)) {
                        
                        ch1[r][c]=1;
                        result = recursion(r,c,n,m,x, y, ch, ch1, s, moveCount+1, index+1);
                        
                        if (result == 1) {
                            break l1;
                        }
                        
                        ch1[r][c]=0;
                    }
                }
            }
            
            if(result==1){
                  System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }

    private static int recursion(int r,int c,int n,int m,int[] x, int[] y, char[][] ch, int[][] ch1, String s, int moveCount, int index) {
             
           if(moveCount==s.length()){
                   return 1;
             }
             else{
                   for(int j=0;j<4;j++){
                       
                       int lx=r+x[j];
                       int ly=c+y[j];
                       
                       if(moveIsValid(lx,ly,n,m,ch,ch1,s,index)==1){
                             ch1[lx][ly]=1;
                             if(recursion(lx,ly,n,m,x, y, ch, ch1, s, moveCount+1, index+1)==1){
                                             return 1;
                             }
                             else{
                                   ch1[lx][ly]=0;
                             }
                       }
                       
                   }
             }
             return 0;
    }

    private static int moveIsValid(int x, int y, int n, int m, char[][] ch, int[][] ch1, String s, int index) {
            if(x<n&&x>=0&&y<m&&y>=0&&ch[x][y]==s.charAt(index)&&ch1[x][y]!=1){
                   return 1;
            }
            else
                return 0;
    }
}
