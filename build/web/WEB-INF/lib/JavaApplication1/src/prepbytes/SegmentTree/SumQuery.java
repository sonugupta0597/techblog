/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class SumQuery {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              int n=scan.nextInt();
              int ar[]=new int[n+1];
              for(int j=1;j<=n;j++){
                      ar[j]=scan.nextInt();
              }
              int size=(int)Math.ceil(Math.log(n)/Math.log(2));
              int segmentTree[]=new int[2*(int)(Math.pow(2,size))];
              constructSegmenttree(segmentTree,ar,1,n,1);
              
              int q=scan.nextInt();
              for(int j=0;j<q;j++){
                   int l=scan.nextInt();
                   int r=scan.nextInt();
                   int result=findSum(segmentTree,l,r,1,n,1);
                   System.out.println(result);
              }
              
        }
    }
    private static void constructSegmenttree(int[] segmentTree, int[] ar, int low, int high, int position) {
        if(low==high){
           segmentTree[position]=ar[low];
           return;
        }
        int mid=(low+high)/2;
        
        constructSegmenttree(segmentTree,ar,low,mid,2*position);
        constructSegmenttree(segmentTree,ar,mid+1,high,2*position+1);
        segmentTree[position]=segmentTree[2*position]+segmentTree[2*position+1];
    }

    private static int findSum(int[] segmentTree, int qlow, int qhigh, int low, int high ,int position) {
        if(qlow<=low&&qhigh>=high){
             return segmentTree[position];
        }
        if(qlow>high||qhigh<low){
               return 0;
        }
        int mid=(low+high)/2;
       
        int left=findSum(segmentTree,qlow,qhigh,low,mid ,2*position);
        int right=findSum(segmentTree,qlow,qhigh,mid+1,high,2*position+1);
        
        return left+right;
        
    }
}
