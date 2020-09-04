/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author pc
 */

class Node {
     int data;
     boolean visited;

    public Node(int data) {
        this.data = data;
        this.visited =false;
    }
 
}

class Graph {
      Node node[];
      int adja[][];
      int numOfNode;
      Queue queue;
    public Graph(int size) {
        node = new Node[size]; 
        adja=new int[size][size];
        numOfNode=0;
        queue=new ArrayDeque();
    }
    
    public void fillNode(int data){
           node[numOfNode++]=new Node(data);
    }
    
    public void fillAdjaMatrix(int start , int end){
          adja[start][end]=1;
          adja[end][start]=1;
    
    }
    
    public void printNode(int index){
        System.out.println(node[index].data);
    }
    public int unVisitedNode(int node1){
        
        for(int j=0;j<node.length;j++){
               if(adja[node1][j]==1&&node[j].visited==false){
                          return j;
               }
        }
        
    return -1;
    
    }
    
    void bfs(){
         
        node[0].visited=true;
        printNode(0);
        queue.add(0);
        int node2;
        while(!queue.isEmpty()){
            
            int node1=(int)queue.poll();
            
            while((node2=unVisitedNode(node1))!=-1){
                    node[node2].visited=true;
                    printNode(node2);
                    queue.add(node2);
            }
        
        }
    
    }
    
    
      
      


}
public class BFS {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             Graph graph=new Graph(8);
             graph.fillNode(50);
             graph.fillNode(10);
             graph.fillNode(200);
             graph.fillNode(20);
             graph.fillNode(15);
             graph.fillNode(30);
             graph.fillNode(5);
             graph.fillNode(300);
             graph.fillAdjaMatrix(0,1);
             graph.fillAdjaMatrix(0,2);
             graph.fillAdjaMatrix(1,4);
             graph.fillAdjaMatrix(1,5);
             graph.fillAdjaMatrix(2,3);
             graph.fillAdjaMatrix(4,5);
             graph.fillAdjaMatrix(4,6);
             graph.fillAdjaMatrix(5,7);
             
             System.out.println("Visited Nodes:");
             graph.bfs();
             
             
             
        }
    }
}
