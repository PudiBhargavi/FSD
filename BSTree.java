import java.util.*;
class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}    
class Binary{
    Node root;
    Node insert( Node root, int m){
        if(root == null){
            return new Node(m);
        }
        if(m < root.val){
            root.left = insert(root.left, m);
        }else{
            root.right = insert(root.right, m);
        }
        return root;
    }
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
public class BSTree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Binary obj = new Binary();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter elements in the BST:");
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            obj.root = obj.insert(obj.root,m);
        }
        System.out.println("BST:");
        obj.inorder(obj.root);
    }
}