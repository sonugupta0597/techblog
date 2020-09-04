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
class Heap {

    int ar[];
    int size;
    int capacity;

    Heap(int capacity) {
        ar = new int[capacity];
        size = 0;
    }

    public void MinHeap() {
        for (int j = size / 2; j >= 1; j--) {
            MinHeapify(this.ar, j);
        }
    }

    public void buildMinHeapDuringInsertion(int index,int element) {
          if(index<1){
             return;
          }
          else{
                ar[index]=element;
                    
                int parent=(index)/2;
                
                if(ar[parent]>element){
                    
                    swap(index,parent);
                    buildMinHeapDuringInsertion(parent,element);
                }
          }
    }

    public void MinHeapify(int ar[], int index) {
        if (index > size / 2) {
            return;
        }
        int leftChild = index * 2;
        int rightChild = index * 2 + 1;
        if (rightChild <= size) {
            if (ar[index] <= ar[rightChild] && ar[index] <= ar[leftChild]) {
                return;
            }
        } else {
            if (ar[index] <= ar[leftChild]) {
                return;
            }
        }
        int smallest = index;
        if (leftChild <= size) {
            if (ar[smallest] > ar[leftChild]) {
                smallest = leftChild;

                swap(index, smallest);
                MinHeapify(ar, smallest);
            }
        }
        if (rightChild <= size) {
            if (ar[index] > ar[rightChild]) {
                smallest = rightChild;

                swap(index, smallest);
                MinHeapify(ar, smallest);
            }
        }

    }

    public void printHeap() {
        for (int j = 1; j <= size; j++) {
            System.out.print(ar[j] + " ");
        }
        System.out.println("");
    }

    private void swap(int index, int i) {
        int temp = ar[index];
        ar[index] = ar[i];
        ar[i] = temp;
    }

}

class MinHeap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            Heap h = new Heap(n + 1);
            h.ar[0]=Integer.MIN_VALUE;
            for (int j = 1; j <= n; j++) {
                int val=scan.nextInt();
                int a=j;
                h.buildMinHeapDuringInsertion(a,val);
                h.size++;
            }
           
            h.printHeap();
        }
    }
}
