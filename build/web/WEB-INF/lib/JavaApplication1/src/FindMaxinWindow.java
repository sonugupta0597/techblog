
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import org.w3c.dom.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class FindMaxinWindow {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
              ar[i]=scan.nextInt();
        }
        
        Deque<Integer> dq=new LinkedList<Integer>();
        
        dq.add(0);
        
        for(int i=1;i<k;i++){
            
            while(!dq.isEmpty() && ar[dq.peekLast()]<=ar[i]){
                  dq.removeLast();
            }
            dq.addLast(i);
        }
        
        for(int i=k;i<n;i++){
            System.out.print(ar[dq.peekFirst()]+" ");
            if(Math.abs(dq.peekFirst()-i)==k){
                  dq.removeFirst();
            }
            while(!dq.isEmpty() && ar[dq.peekLast()]<=ar[i]){
                  dq.removeLast();
            }
            dq.addLast(i);
        }
            System.out.println(ar[dq.removeFirst()]+" ");
            Node node=null;
            
    if(node==null){
      return;
    }
    Queue<Node> q=new ArrayDeque<Node>();
    
    q.add(node);
    
    while(!q.isEmpty()){
            Node ne=q.remove();
            
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
		    
		    int result=-1;
		    Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		    for(int j=0;i<n;i++){
		        int a=scan.nextInt();
		        if(m.containsKey(ne)){
		            m.put(a,(int)m.get(a));
		        }
		        else{
		            m.put(a,1);
		        }
		        if(m.get(a)>n/2){
		            result=a;
		        }
		    }
		    System.out.println(result+" ");
                    int t1=scan.nextInt();
		for(int i1=0;i<t;i++){
		    String s=scan.nextLine().trim();
		    
		    int n1=scan.nextInt();
		    String str[]=s.split(" ");
		    for(int j=0;j<str.length;j++){
		        System.out.print(str[j]);
		        if(j!=str.length-1){
		            System.out.print("%20");
		        }
		    }
		    System.out.println();
		}
		}
    }
    }
}
