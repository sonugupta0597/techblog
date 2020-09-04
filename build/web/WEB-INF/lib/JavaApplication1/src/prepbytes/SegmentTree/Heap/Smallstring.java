/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree.Heap;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class Heapa {

    int ar[];
    int size;
    int capacity;

    Heapa(int capacity) {
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

class Smallstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String s=scan.next();
            int n=scan.nextInt();
            Heapa h=new Heapa(n+1);
            h.ar[0]=Integer.MIN_VALUE;
            int j=0;
            for(j=0;j<n;j++){
                int a=s.charAt(j);
                h.buildMinHeapDuringInsertion(j+1,a);
                h.size++;
            }
            String str="";
            while(h.size>0){
                         str=str+(char)extratMin(h);
                         if(j<s.length()){
                             h.buildMinHeapDuringInsertion(++h.size,s.charAt(j));
                             j++;
                         }
            }
            System.out.println(str);
        }
        
    }
    private static int extratMin(Heapa h) {
        int minDistance=h.ar[1];
        h.ar[1]=h.ar[h.size];
        
        h.size--;
        h.MinHeapify(h.ar,1);
        return minDistance;
    }
}
