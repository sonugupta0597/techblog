/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

class Relatives{
      int to;
      int weight;

    public Relatives(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
      
}
public class AmanRelatives {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        ArrayList l[]=new ArrayList[n+1];
        for(int i=1;i<n;i++){
             l[i]=new ArrayList<Relatives>();
        }
        for(int i=1;i<=m;i++){
               int x=scan.nextInt();
               int y=scan.nextInt();
               int w=scan.nextInt();
               Relatives r1=new Relatives(y, w);
               l[x].add(r1);
               Relatives r2=new Relatives(x, w);
               l[y].add(r2);
         }
        ArrayList<Integer> mst=new ArrayList<Integer>();
        Heaps h = new Heaps(n + 1);
            h.ar[0]=Integer.MIN_VALUE;
            Arrays.fill(h.ar,Integer.MAX_VALUE);
            h.ar[1]=0;
       
        for(int j=1;j<=n;j++){
                int 
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
