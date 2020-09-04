package prepbytes.SegmentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class MaximumDiviso {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int ar[] = new int[n + 1];
            for (int j = 1; j <= n; j++) {
                ar[j] = scan.nextInt();
            }
            int size = (int) Math.ceil(Math.log(n) / Math.log(2));
            ArrayList <Integer>segmentTree[] = new ArrayList[2 * (int) (Math.pow(2, size))];
            constructSegmenttree(segmentTree, ar, 1, n, 1);

            int q = scan.nextInt();
            for (int j = 0; j < q; j++) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                ArrayList<Integer> result = find(segmentTree, l, r, 1, n, 1);
                Collections.sort(result);
                int flag=0;
                for(int k=0;k<result.size()-1;k++){
                   if(Math.abs(result.get(k)-result.get(k+1))!=1){
                      flag=1;
                   }
                }
                if(flag==0){
                    System.out.println("Yes");
                }
                else
                   System.out.println("No");
            }

        }
    }

    private static void constructSegmenttree(ArrayList <Integer>[] segmentTree, int[] ar, int low, int high, int position) {
        if (low == high) {
            ArrayList<Integer> a=new ArrayList<Integer>();
            a.add(ar[low]);
            segmentTree[position]=a ;
            return;
        }
        int mid = (low + high) / 2;

        constructSegmenttree(segmentTree, ar, low, mid, 2 * position);
        constructSegmenttree(segmentTree, ar, mid + 1, high, 2 * position + 1);
        ArrayList l=new ArrayList();
        l.addAll(segmentTree[2 * position]);
        l.addAll(segmentTree[2 * position+1]);
        
        segmentTree[position]=l;
    }

    

    private static ArrayList<Integer>find(ArrayList<Integer>[] segmentTree, int qlow, int qhigh, int low, int high, int position) {
        if (qlow <= low && qhigh >= high) {
            return segmentTree[position];
        }
        if (qlow > high || qhigh < low) {
            return null;
        }
        int mid = (low + high) / 2;

        ArrayList<Integer> left = find(segmentTree, qlow, qhigh, low, mid, 2 * position);
        ArrayList<Integer> right = find(segmentTree, qlow, qhigh, mid + 1, high, 2 * position + 1);
        if(left==null && right==null){
           return null;
          
        }
        else if(left==null){
             return right;
        }
        else if(right==null){
             return left;
        }
        else{
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.addAll(left);
        l.addAll(right);
        return l;
        }

    }
}