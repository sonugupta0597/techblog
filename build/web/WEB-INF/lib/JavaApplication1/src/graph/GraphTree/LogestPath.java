import java.util.*;
  import java.io.*;
  
class Main {
    
   static int size;
    int noOfNode;
    int adja[][];
    int visited[];
    int node[];
    
   static int max ;
   static int maxNode; 
    Main(int size){
        this.size=size;
        noOfNode=0;
        adja = new int[size][size];
        visited = new int[size];
        node = new int[size];
        max=0;
        maxNode=0;
    }
    
    void addNode(int element){
         node[noOfNode++]=element;
    }
    
    void addEdge( int start , int end ){
         adja[start][end]=1;
         adja[end][start]=1;
    }
    
    int  unVisited(int node){
         int result=-1;
         for(int j=0;j<noOfNode;j++){
              if(adja[node][j]!=1 && visited[j]!=1){
                     result = j ;
                     break;
              }
         }
         
         return result;
    }
    
    void dfs( int node , int distance ){
      
      if(distance>max){
            max = distance;
      }
      
      visited[node]=1;
      
      int node1=node;
      
      while((node1=unVisited(node))!=-1){
            
            dfs(node1,distance+1);
            
      }
      
    }
    
    public static void main(String args[]) throws IOException {
      
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      
      for(int i=0;i<t;i++)
      {
            int n = scan.nextInt();
            int edge = scan.nextInt();
            Main main = new Main(size);
            
            for(int j=0;j<edge;j++){
                   main.addEdge(scan.nextInt(),scan.nextInt());
            }
            
            main.dfs(0,0);
            
            max=0;
            
            Arrays.fill(main.visited,0);
            
            main.dfs(maxNode,0);
            
            System.out.println(max);
            
      }
      
      
    }
  }