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
    
    public int dfs(int index,int result,int l,int c){
        
        if(node[index].data==1&&result+1>l){
            node[index].visited=true;
              return 0;
        }
        
        if(node[index].visited==false){
            
           if(node[index].data==1){
               result++;
           }
           else{
               result=0;
           }
            int node1;
            int count=0;
            node[index].visited=true;
            while ((node1=unvisitedNode(index))!=-1) {
                  
              
                     count++;
                     int a=dfs(node1,result,l,c);
                     if(a>c)
                     c=a;
                     
            }
            
            if(count==0){
                  c=c+1;
                  return c;
            }
            
            
            
        }
        
        return c;
    }
    
        
}
class CountComponents {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
            int v=scan.nextInt();
            int l=scan.nextInt();
            Graph1 g=new Graph1(v);
            
            for(int j=0;j<v;j++){
                g.addNode(scan.nextInt());
            }
            for(int j=0;j<v-1;j++){
                g.addEdge(scan.nextInt(),scan.nextInt());
            }
            
            System.out.println(g.dfs(0,0,l,0));
        
    }
}
