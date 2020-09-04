
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = 1;
        int r = n;
        char ch1 = 'E';
        char ch2 = 'E';
        char ch3 = 'E';
        int mid2 = (l + r) / 2;
        int mid1 = (l + mid2) / 2;
        int mid3 = (mid2 + r) / 2;
        System.out.println(mid1);
        ch1 = scan.next().charAt(0);
        if (ch1 == 'E') {
            System.exit(0);
        } else {

            System.out.println(mid2);
            ch2 = scan.next().charAt(0);
            if (ch2 == 'E') {
                System.exit(0);
            } else {
                if (ch1 == 'L' && ch2 == 'L') {
                    recursion(l, mid2 - 1);
                } else if (ch1 == 'G' && ch2 == 'G') {
                    recursion(mid1 + 1, r);
                } else {

                    System.out.println(mid3);
                    ch3 = scan.next().charAt(0);
                    if (ch3 == 'E') {
                        System.exit(0);
                    } else {
                        if (ch2 == 'L' && ch3 == 'L') {
                            recursion(l, mid3 - 1);
                        } else if (ch2 == 'G' && ch3 == 'G') {
                            recursion(mid2 + 1, r);
                        } else {

                            if (ch1 == 'L' && ch2 == 'G' && ch3 == 'L') {
                                recursion(mid2 + 1, mid3 - 1);
                                recursion(mid3 + 1, r);
                                recursion(l, mid1 - 1);
                            } else if (ch1 == 'G' && ch2 == 'L' && ch3 == 'G') {
                                recursion(mid1 + 1, mid2 - 1);
                                recursion(l, mid1 - 1);
                                recursion(mid3 + 1, r);
                            }

                        }

                    }

                }
            }

        }

    }

    private static void recursion(int l, int r) {
        Scanner scan = new Scanner(System.in);

        while (l <= r) {
            char ch1 = 'E';
            char ch2 = 'E';
            char ch3 = 'E';
            int mid2 = (l + r) / 2;
            int mid1 = (l + mid2) / 2;
            int mid3 = (mid2 + r) / 2;
            System.out.println(mid1);
            ch1 = scan.next().charAt(0);
            if (ch1 == 'E') {
                System.exit(0);
            } else {

                System.out.println(mid2);
                ch2 = scan.next().charAt(0);
                if (ch2 == 'E') {
                    System.exit(0);
                } else {
                    if (ch1 == 'L' && ch2 == 'L') {
                        recursion(l, mid2 - 1);
                    } else if (ch1 == 'G' && ch2 == 'G') {
                        recursion(mid1 + 1, r);
                    } else {

                        System.out.println(mid3);
                        ch3 = scan.next().charAt(0);
                        if (ch3 == 'E') {
                            System.exit(0);
                        } else {
                            if (ch2 == 'L' && ch3 == 'L') {
                                recursion(l, mid3 - 1);
                            } else if (ch2 == 'G' && ch3 == 'G') {
                                recursion(mid2 + 1, r);
                            } else {

                                if (ch1 == 'L' && ch2 == 'G' && ch3 == 'L') {
                                    recursion(mid2 + 1, mid3 - 1);
                                    recursion(mid3 + 1, r);
                                    recursion(l, mid1 - 1);
                                } else if (ch1 == 'G' && ch2 == 'L' && ch3 == 'G') {
                                    recursion(mid1 + 1, mid2 - 1);
                                    recursion(l, mid1 - 1);
                                    recursion(mid3 + 1, r);
                                }

                            }

                        }

                    }
                }

            }

        }

    }
}
