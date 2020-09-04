/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.greedy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author pc
 */
class Heaps {

    int ar[];
    int size;
    int capacity;

    Heaps(int capacity) {
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
            }
        }
        if (rightChild <= size) {
            if (ar[smallest] > ar[rightChild]) {
                smallest = rightChild;
            }
        }
        swap(index,smallest);
        MinHeapify(ar,smallest);

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

class BecomeKing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            Heaps h = new Heaps(n + 1);
            h.ar[0]=Integer.MIN_VALUE;
            for (int j = 1; j <= n; j++) {
                int val=scan.nextInt();
                int a=j;
                h.buildMinHeapDuringInsertion(a,val);
                h.size++;
            }
            long sum=0;
            while(h.size>1){
               int minimum=extratMin(h);
               int secondMinimum=extratMin(h);
               int result=minimum+secondMinimum;
               sum=sum+result;
               h.size++;
                h.buildMinHeapDuringInsertion(h.size,result);
                
            }
            System.out.println(sum);
        }
    }

    private static int extratMin(Heaps h) {
        int min=h.ar[1];
        h.ar[1]=h.ar[h.size];
        h.size--;
        h.MinHeapify(h.ar,1);
        return min;
    }
}
