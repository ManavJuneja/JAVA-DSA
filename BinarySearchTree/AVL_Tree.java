// package BinarySearchTree;

// public class AVL_Tree {
//     static class Node {
//         int data,height;
//         Node left,right;
//         Node(int data){
//             this.data=data;
//             height=1;
//         }
//     }
//     public static int height(Node root){
//         if (root == null){
//             return 0;
//         }
//             return root.height;
        
//     }


//     public static Node leftRotate(Node x){
//         Node y = x.right;
//         Node 
//     }

//     public static int getBalace(Node root){
//         if(root ==null){
//             return 0;
//         }
//         return height(root.left) - height(root.right);
//     }
//     public static Node insert(Node root, int key) {
//         if (root == null){
//             return new Node(key);
//         }

//         if(key < root.data){
//             root.left = insert(root.left,key);
//         }
//         else if(key < root.data){
//             root.left = insert(root, key);
//         }
//         else{
//             return root;
//          } //duplicate key not allowed

//             //Upadate root height
//             root.height = 1 + Math.max(height(root.left) , height(root.right));
         
//             //Get root's balace factor
//             int bf= getBalace(root);


//             //Left left case
//             if(bf > && key< root.left.data){
//                 return rightRotate(root);
//             }

//             //Right right  case
//             if(bf < -1 && key > root.right.data){
//                 return leftRotate(root);
//             }
            
//             // Left Right case
//             if(bf > 1 && key > root.left.data){
//                 root.left= leftRotate(root.left);
//                 return rightRotate(root);
//             }

//             // Right Left Case
//             if(bf < -1 && key < root.right.data){
//                 root.right = rightRotate(root.right);
//             }

//             return root;
//     }
//     public static void main(String[] args) {
        
//     }

