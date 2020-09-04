/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree.Heap;

import java.util.*;

/**
 *
 * @author pc
 */
class Heapsss {

    int ar[];
    int size;
    int capacity;

    Heapsss(int capacity) {
        ar = new int[capacity];
        size = 0;
    }

    public void MinHeap() {
        
    }

    public void buildMinHeapDuringInsertion(int index,int element,int p) {
          if(index<1){
             return;
          }
          else{
                ar[index]=element;
                    
                int parent=(index)/2;
                if(index==1){
                  return;
                }
                if(Math.abs(ar[parent]-p)>Math.abs(element-p)){
                    
                    swap(index,parent);
                    buildMinHeapDuringInsertion(parent,element,p);
                }
          }
    }

    public void MinHeapify(int ar[], int index,int p) {
        if (index > size / 2) {
            return;
        }
        int leftChild = index * 2;
        int rightChild = index * 2 + 1;
        if (rightChild <= size) {
            if (Math.abs(ar[index]-p) <= Math.abs(ar[rightChild]-p) && Math.abs(ar[index]-p) <= Math.abs(ar[leftChild]-p)) {
                return;
            }
        } else {
            if (Math.abs(ar[index]-p) <= Math.abs(ar[leftChild]-p)) {
                return;
            }
        }
        int smallest = index;
        if (leftChild <= size) {
            if (Math.abs(ar[smallest]-p) > Math.abs(ar[leftChild]-p)) {
                smallest = leftChild;
            }
        }
        if (rightChild <= size) {
            if (Math.abs(ar[smallest]-p) > Math.abs(ar[rightChild]-p)) {
                smallest = rightChild;
            }
        }
        swap(index,smallest);
        MinHeapify(ar,smallest,p);

    }

    public void printHeap() {
        for (int j = 1; j <= size; j++) {
            System.out.print(ar[j] + " ");
        }
        System.out.println("");
    }

    public void swap(int index, int i) {
        int temp = ar[index];
        ar[index] = ar[i];
        ar[i] = temp;
    }

}

class MinimumDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int p=scan.nextInt();
            int q=scan.nextInt();
            Heapsss h = new Heapsss(n + 1);
            h.ar[0]=Integer.MIN_VALUE;
            for (int j = 1; j <= n; j++) {
                int val=scan.nextInt();
                int a=j;
                h.buildMinHeapDuringInsertion(a,val,p);
                h.size++;
            }
            
            int ar[]=new int[q];
            for(int j=0;j<q;j++){
                ar[j]=extratMin(h,p);
            }
            for(int j=q-1;j>=0;j--){
                System.out.print(ar[j]+" ");
            }
            System.out.println("");
        }
    }

    private static int extratMin(Heapsss h,int p) {
        int minDistance=h.ar[1];
        h.ar[1]=h.ar[h.size];
        
        h.size--;
        h.MinHeapify(h.ar,1,p);
        return minDistance;
    }
}
