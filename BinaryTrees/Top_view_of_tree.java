package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top_view_of_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;

        }
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        //Level Order
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                   break;
                }
                else{
                q.add(null);
                }
        }
        else{
     if(!map.containsKey(curr.hd)){
      map.put(curr.hd, curr.node);  //true
    }
    if(curr.node.left!=null){
        q.add(new Info(curr.node.left,curr.hd-1));
        min=Math.min(min,curr.hd-1);
    }
    if(curr.node.right!=null){
        q.add(new Info(curr.node.right,curr.hd+1));
        max=Math.max(max,curr.hd+1);
    }

        } 


    }
    for(int i=min;i<=max;i++){
        System.out.print(map.get(i).data+" ");
    }
    System.out.println();
}
public static void Klevel(Node root,int level,int k){
    if(root==null){
        return;
    }
    if(level==k){
        System.out.print(root.data+" ");
        return;
    }
    Klevel(root.left, level+1, k);
    Klevel(root.right, level+1, k);
}

    public static void main(String[] args) {
        /*
        1
       /  \
      2     3
     / \   / \
    4   5  6  7 
        
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        topView(root);

        int k=2;
        Klevel(root, 1, k);
        
    }
}
