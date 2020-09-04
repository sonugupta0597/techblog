
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
class COVDSMPL {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            int ar[][] = new int[n + 1][n + 1];

            for (int r = 1; r <= n; r++) {
                System.out.println("1" + " " + r + " " + 1 + " " + r + " " + n + " ");
                int x = scan.nextInt();
                if (x == -1) {
                    System.exit(0);
                }
                if (x > 0) {
                    for (int c = 1; c <= n; c++) {
                        System.out.println("1" + " " + r + " " + c + " " + r + " " + c + " ");
                        x = scan.nextInt();
                        if (x == -1) {
                            System.exit(0);
                        }
                        ar[r][c] = x;
                    }
                }
            }

            System.out.println("2");

            for (int r = 1; r <= n; r++) {
                for (int c = 1; c <= n; c++) {
                    System.out.print(ar[r][c] + " ");
                }
                System.out.println("");
            }

            int x = scan.nextInt();

            if (x == -1) {
                System.exit(0);
            }

        }
    }
}
