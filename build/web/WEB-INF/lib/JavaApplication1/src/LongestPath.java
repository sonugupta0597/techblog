/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Node3{
     int data;
     boolean visited;

    public Node3(int data) {
        this.data=data;
        visited=false;
    }
     
}

class Graph3{
        Node1 node[];
        int adja[][];
        int noOfNode;
        
    public Graph3(int size) {
        node=new Node1[size];
        adja=new int[size][size];
        noOfNode=0;
    }
    
    public void addNode(int data){
          node[noOfNode++]=new Node1(data);
    }    
    public void addEdge(int start,int end){
          adja[start][end]=1;
          adja[end][start]=1;
    }
    public void printNode(int index){
          System.out.println(node[index].data);
    }
    
    
    
}
class Main {
    public static void main(String[] args) {
        
         System.out.println("a".compareTo("ab"));
        Scanner scan=new Scanner(System.in);
        
        int t=scan.nextInt();
        
        for(int i=0;i<t;i++){
            
            boolean b
        }
    }
}
