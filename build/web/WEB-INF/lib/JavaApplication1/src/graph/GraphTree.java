/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */

class Node2{
       int data;
       boolean visited;

    public Node2(int data){
        this.data=data;
        this.visited=false;
    }
       
}

class Graph2{
       Node2 node[];
       int adja[][];
       int noOfNodes;
       
       
    public Graph2(int size) {
        node=new Node2[size];
        adja=new int[size][size];
        noOfNodes=0;
    }
    
    public void addNode(int data){
        node[noOfNodes++]=new Node2(data);
    }
    
    public void addedge(int start , int end ){
        adja[start][end]=1;
        adja[end][start]=1;
    }
    
    public void printNode(int index){
           System.out.println(node[index]);
    }
    
    public int isVisitedCheck(int index,int parent){
         
        for(int j=0;j<noOfNodes;j++){
             if(adja[index][j]==1&&node[j].visited==false){
                  return j;
             }
             
        }
        
        return -1;
        
    }
    
    public void dfs(int index ,ArrayList<Integer> l)
    {
         if(node[index].visited==false){
            
             int node1;
             
             l.add(index);
             
             node[index].visited=true;
             
             int j=0;
             while((node1=isVisited(index,-1))!=-1){
                  
                 
                    dfs(node1,l);
                 
                 
                 
                 
                 
             }
             
         }
         
      
         
    }
    
    public boolean dfs(int index ,int parent ,ArrayList<Integer> l)
    {
         if(node[index].visited==false){
            
             int node1;
             
             l.add(index);
             
             node[index].visited=true;
             
             int j=0;
             while((node1=isVisited(index,parent,j))!=-1){
                  
                 if(node1==noOfNodes+1){
                      
                      return true;
                 }
                 
                 return dfs(node1,index,l);
                 
                 
                 
                 
                 
             }
             
         }
         
         return false;
         
    }
      
       
}
public class GraphTree {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               int v=scan.nextInt();
               int e=scan.nextInt();
               Graph2 g=new Graph2(v);
               
               
               for(int j=0;j<v;j++){
                     g.addNode(0);
               }
               
               for(int j=0;j<e;j++){
                     g.addedge(scan.nextInt(),scan.nextInt());
               }
               
               ArrayList<Integer> l =new ArrayList<Integer>();
               
               boolean iscycle=false;
               for(int j=0;j<g.noOfNodes;j++){
                   
                     boolean b=g.dfs(j,-1,l);
                     
               }
               
               System.out.println(b);
               if(g.cyc==true){
                    System.out.println("No");
               }
               else{
                    if(l.size()==g.noOfNodes){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
               }
        }
    }
}
