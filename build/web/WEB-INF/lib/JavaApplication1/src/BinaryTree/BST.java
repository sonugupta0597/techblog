/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

public class BST {

    Node root;

    BST() {
        root = null;
    }

    Node addNode(Node node, int element) {
        if (node == null) {

            Node newNode = new Node(element);
            return newNode;
        } else if (node.data > element) {

            node.left = addNode(node.left, element);
        } else {
            node.right = addNode(node.right, element);
        }

        return node;
    }

    Node searchNode(Node node, int key) {
        if (node == null || node.data == key) {
            return node;
        } else {
            if (node.data > key) {
                return searchNode(node.left, key);
            } else {
                return searchNode(node.right, key);
            }
        }
    }

    Node minimumNode(Node node) {
        if (node.left == null) {
            return node;
        } else {
            return minimumNode(node.left);
        }
    }

    Node maximunNode(Node node) {
        if (node.right == null) {
            return node;
        } else {
            return minimumNode(node.right);
        }
    }

    void Inorder(Node node) {
        if (node == null) {
            return;
        }

        Inorder(node.left);
        System.out.println(node.data);
        Inorder(node.right);

    }

    void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        Inorder(node.left);
        Inorder(node.right);

    }

    void postorder(Node node) {
        if (node == null) {
            return;
        }

        Inorder(node.left);
        Inorder(node.right);
        System.out.println(node.data);

    }

    int heightOfTree(Node node) {

        if (node == null) {
            return 0;
        }

        int left = heightOfTree(node.left);
        int right = heightOfTree(node.right);

        return Math.max(left, right) + 1;

    }

    int sizeOfATree(Node node) {
        if (node == null) {
            return 0;
        }

       
        int left = sizeOfATree(node.right);

        int right = sizeOfATree(node.left);

        return left + right + 1;
        
    }

    void levelOrderTraversal(Node node) {

        if (node == null) {
            
            return;
            
        } 
        else {
            
            Queue<Node> q = new ArrayDeque<Node>();

            q.add(node);

            while (!q.isEmpty()) {
                
                Node localNode = q.remove();
                
                System.out.println(localNode.data);

                if (localNode.left != null) {
                    q.add(localNode.left);
                }

                if (localNode.right != null) {
                    q.add(localNode.right);
                }

            }
        }

    }

    int countOfNoLevels(Node node) {

        int count = 0;
        if (node == null) {
            return 0;
        } else {
            Queue<Node> q1 = new ArrayDeque<Node>();

            q1.add(node);

            while (!q1.isEmpty()) {
                
                count++;

                Queue<Node> q2 = new ArrayDeque<Node>();
                
                q2.addAll(q1);

                q1.removeAll(q1);

                while (!q2.isEmpty()) {

                    Node localNode = q2.remove();

                    System.out.println(localNode.data);

                    if (localNode.left != null) {
                        q1.add(localNode.left);
                    }

                    if (localNode.right != null) {
                        q1.add(localNode.right);
                    }
                }

            }
        }

        return count;
    }

    int distanceOfAnyNodeFromRoot(Node node, int element) {

        if (node == null) {
            return Integer.MIN_VALUE;
        } else if (node.data == element) {
            return 0;
        }

        if (node.data > element) {
            return distanceOfAnyNodeFromRoot(node.left, element) + 1;
        } else {
            return distanceOfAnyNodeFromRoot(node.right, element) + 1;
        }
    }

    Node ancestorOfTwoNodes(Node node, int first, int second) {

        if (node == null) {
            return node;
        } else if (node.data > first && node.data > second) {
            return ancestorOfTwoNodes(node.left, first, second);
        } else if (node.data < first && node.data < second) {
            return ancestorOfTwoNodes(node.right, first, second);
        } else {
            return node;
        }

    }

    boolean checkTreeIsABSTOrNot(Node node, int min, int max) {

        boolean left = true;

        boolean right = true;

        if (node == null) {
            return true;
        } else if ((!(node.data > min)) || (!(node.data < max))) {
            return false;
        }

        left = checkTreeIsABSTOrNot(node.left, min, node.data);
        right = checkTreeIsABSTOrNot(node.right, node.data, max);

        return left && right;

    }

    int convertToSumTree(Node node) {
        if (node == null) {
            return 0;
        } else {
            int d = node.data;
            node.data = convertToSumTree(node.left) + convertToSumTree(node.right);
            return d + node.data;
        }
    }

    boolean checkSumTree(Node node) {

        if (node == null) {
            return true;
        }
        boolean l = checkSumTree(node.left);
        boolean r = checkSumTree(node.right);

        boolean current = false;

        long lsum = checksum(node.left);
        long rsum = checksum(node.right);

        if (node.data == lsum + rsum || (node.left == null && node.right == null)) {
            current = true;
        } else {
            current = false;
        }

        return ((l & r) & current);
    }

    long checksum(Node node) {

        if (node == null) {
            return 0;
        }

        long sum = 0;

        Queue<Node> q = new ArrayDeque<Node>();

        q.add(node);

        while (!q.isEmpty()) {
            Node no = q.remove();
            sum = sum + no.data;

            if (no.left != null) {
                q.add(no.left);
            }
            if (no.right != null) {
                q.add(no.right);
            }

        }
        return sum;
    }

    boolean checkMirrorTree(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else {
            boolean f = false;
            if (node1.data == node2.data) {
                f = true;
            }
            boolean left = checkMirrorTree(node1.left, node2.right);
            boolean right = checkMirrorTree(node1.right, node2.left);

            return (f && left && right);
        }
    }

   static void coundtructBSTFromPostOrder(int ar[] , ArrayList<Integer> l,int start,int end){
    
       
       System.out.println(start+" "+end);
       l.add(ar[end]);
        
        if(start==end){
              return;
        }
        
        
       
        
        int left=-1;
        
        for(int i=end-1;i>=start;i--){
               if(ar[i]<ar[end]){
                     
                      left=i;
                     break;
               }
               
        }
        
        int right=-1;
        
         for(int i=end-1;i>=start;i--){
               if(ar[i]>ar[end]){
                    
                     right=i;
                     break;
               }
        }
         
         if(left!=-1){
             if(right==-1){
                  left=start+1;
             }
         coundtructBSTFromPostOrder(ar ,l,start,left);
         
         }
         
         
         if(right!=-1){
             if(left==-1){
                  left=start+1;
             }
         coundtructBSTFromPostOrder(ar ,l,left+1,right);
         }
    
    }
    
    public static void main(String[] args) {
        BST bst = new BST();

        bst.root = bst.addNode(bst.root, 10);
        bst.addNode(bst.root, 9);
        bst.addNode(bst.root, 11);
        bst.addNode(bst.root, 5);
        bst.addNode(bst.root, 12);
        bst.addNode(bst.root, 7);
        bst.addNode(bst.root, 15);

        System.out.println("inorder....................");
        bst.Inorder(bst.root);

        System.out.println("preorder....................");
        bst.preorder(bst.root);

        System.out.println("postorder....................");
        bst.postorder(bst.root);

        System.out.println("Height Of Tree ................." + "=" + bst.heightOfTree(bst.root));

        System.out.print("Search of any Element in a Tree ..................");

        Node node = bst.searchNode(bst.root, 12);

        if (node == null) {
            System.out.println("Node not Found.......");
        } else {
            System.out.println("Node is Found.......");
        }

        System.out.println("Size of a Tree................" + "=" + bst.sizeOfATree(bst.root));

        System.out.println("LevelOrderTraverSal.................");

        bst.levelOrderTraversal(bst.root);

        System.out.println("Count of no of Levels.............." + "=" + bst.countOfNoLevels(bst.root));

        System.out.println("Distance of Node from root" + "=" + bst.distanceOfAnyNodeFromRoot(bst.root, 15));

        System.out.println("Distance of Node from root" + "=" + bst.distanceOfAnyNodeFromRoot(bst.root, 9));

        System.out.print("Ancestor of two nodes ..................... " + "=");

        Node ancestor = bst.ancestorOfTwoNodes(bst.root, 5, 15);

        if (ancestor == null) {
            System.out.println("No ancestor Found ");
        } else {
            System.out.println(ancestor.data + " ancestor Found ");
        }

        System.out.print("Distance Betwwen Two nodes ............... " + "=");

        Node ancestorOfTwoNodes = bst.ancestorOfTwoNodes(bst.root, 9, 7);
        
        
        if (ancestor == null) {
            System.out.println("either of two are not in a tree that why distance is =" + 0);
        } else {
            
            
            int left = bst.distanceOfAnyNodeFromRoot(ancestorOfTwoNodes, 9);

            int right = bst.distanceOfAnyNodeFromRoot(ancestorOfTwoNodes, 7);
            
            System.out.println(left + right);
        }

        System.out.println("check tree is BST or not ..................... " + "=" + bst.checkTreeIsABSTOrNot(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println("convert BST to sum of there childrens...............");

        bst.convertToSumTree(bst.root);

        bst.levelOrderTraversal(bst.root);

        System.out.println("check for sumTree........................." + "=" + bst.checkSumTree(bst.root));

        ArrayList<Integer> l = new ArrayList<Integer>();
        
        int br[] ={1 ,7, 5, 50, 40, 10};
        coundtructBSTFromPostOrder(br, l,0,br.length-1);
        
        BST bst1 = new BST();
        
        System.out.println(l);
        
        bst1.root = bst1.addNode(bst1.root,l.get(0));
        for(int i=1;i<l.size();i++){
              bst1.addNode(bst1.root,l.get(i));
        }
        
        bst1.Inorder(bst1.root);
        
    }
      
}
