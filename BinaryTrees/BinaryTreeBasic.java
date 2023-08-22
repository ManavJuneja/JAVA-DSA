package BinaryTrees;

import java.util.*;

public class BinaryTreeBasic {
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
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root){ //O(n)
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
      
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
    }

    public static int diameter(Node root){ //TC O(n*n)
        if(root==null){
            return 0;
        }
        int leftDiam=diameter(root.left);
        int leftHt=height(root.left);
        int rightDiam=diameter(root.left);
        int rightHt=height(root.right);

        int selfDiam=leftHt+rightHt+1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));

    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter2(Node root){  //TC O(n)
        Info leftInfo=diameter2(root.left);
        Info rightInfo=diameter2(root.right);

        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }

  


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println();
        System.out.println(diameter(root));




    }
}
