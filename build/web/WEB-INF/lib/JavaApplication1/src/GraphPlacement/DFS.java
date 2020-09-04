/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphPlacement;

import java.util.Arrays;

class Node {
   public  int data;
   public  boolean visited;
     
     Node(int element){
          this.data=element;
          this.visited=false;
     }
}
public class DFS {
    int size;
    int noOfNode;
    Node nodeList[];
    int adajMatrix[][];
    
    DFS(int size){
    
        this.size=size;
        nodeList=new Node[size];
        adajMatrix=new int[size][size];
    
    }
    
    void addVertice(int element){
          nodeList[noOfNode++]=new Node(element);
    }
    
    void addEdge(int start,int end){
          adajMatrix[start][end]=1;
          adajMatrix[end][start]=1;
    }
    
    int adajUnvisitedNode(int index){
    
        for(int i=0;i<noOfNode;i++){
             
            if(adajMatrix[index][i]==1&&nodeList[i].visited==false){
                     return i;
            }
            
        }
          return -1;
    }
    
    void printNode(int index){
          System.out.println(nodeList[index].data);
    }
    
    void dfs(int index){
         
         printNode(index);
         
         nodeList[index].visited=true;
         int node1 = index;
         while((node1=adajUnvisitedNode(index))!=-1){
                   dfs(node1);
         }
    }
    
    
    
    void minimumDistance(int index , int value[],boolean processed[]){
    
        for(int i=0;i<value.length;i++){
                 int u = minimumSelector(value,processed);
                 processed[u]=true;
                 if(u==-1){
                        return;
                 }
                 
                 for(int j=0;j<value.length;j++){
                       
                     if(adajMatrix[u][j]==1 && processed[j]==false && value[u]+6<value[j]){
                              
                           value[j]=value[u]+1;
                         
                     }
                     
                 }
                 
        }
        
    }
    
    public static void main(String[] args) {
        DFS g = new DFS(8);
        
        for(int i=0;i<8;i++){
             g.addVertice(i);
        }
        
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(5, 7);
        
        int value[] = new int[8];
        boolean processed[] = new boolean[8];
        
        Arrays.fill(value,Integer.MAX_VALUE);
        Arrays.fill(processed,false);
        
        value[0]=0;
        
        for(int i=0;i<value.length;i++){
                     if(i!=0){
                          if(value[i]==Integer.MAX_VALUE){
                                   System.out.println(-1);
                          }
                          else{
                                   System.out.println(value[i]);
                          }
                     }
        }
        
        
        
    }

    private int minimumSelector(int[] value, boolean [] processed) {
             
        int minimun = Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<value.length;i++){
               if(processed[i]==false && minimun>value[i]){
                       index=i;
                       minimun=value[i];
               }
        }
        
        return minimun;
    }
    
}
