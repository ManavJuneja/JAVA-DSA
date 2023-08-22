package BinaryTrees;

public class Subtree {
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
    public static boolean isIdentitcal(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }
        else if(node==null || subRoot==null || node.data != subRoot.data){
            return false;

        }
        if(!isIdentitcal(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentitcal(node.right, subRoot.right)){
            return false;
        }
        return true;

    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentitcal(root,subRoot)){
                return true;
            }   
        }
       return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(7);
        root.left.right=new Node(5);
        root.right.left=new Node(6);


        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);
        System.out.println(isSubtree(root, subRoot));
        
    }
}
