package graph.newpackage;

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
class Node1{
     int data;
     boolean visited;

    public Node1(int data) {
        this.data=data;
        visited=false;
    }
     
}


class Graph1{
        Node1 node[];
        int adja[][];
        int noOfNode;
         
    public Graph1(int size) {
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
    public int unvisitedNode(int node2){
        
     
        for(int j=0;j<noOfNode;j++){
            
                 if(adja[node2][j]==1&& node[j].visited==false){
                        return j;
                 }
                 
                 
        }
        
           return -1;
    }
    
    public void dfs(int index,ArrayList<Integer> l){
        
        
        
        if(node[index].visited==false){
            
           l.add(index);
            int node1;
            
            node[index].visited=true;
            while ((node1=unvisitedNode(index))!=-1) {
                    
                dfs(node1,l);
                     
            }
            
        }
        
        
    }
    
        
}
class MaximumEdges {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int v=scan.nextInt();
            int e=scan.nextInt();
            Graph1 g=new Graph1(v);
            
            for(int j=0;j<v;j++){
                g.addNode(0);
            }
            for(int j=0;j<e;j++){
                g.addEdge(scan.nextInt(),scan.nextInt());
            }
            
            int result=0;
            for(int j=0;j<g.noOfNode;j++){
                 if(g.node[j].visited==false){
                        
                        ArrayList<Integer> l=new ArrayList<Integer>();
                        g.dfs(j,l);
                        int count=0;
                        for(int j1=0;j1<l.size();j1++){
                               for(int k=0;k<g.noOfNode;k++){
                                      if(g.adja[l.get(j1)][k]==1){
                                          count++;
                                      }
                               }
                        }
                        
                        if(count/2>result){
                             result=count/2;
                        }
                        
                 }
            }
            
            System.out.println(result);
        }
    }
}
