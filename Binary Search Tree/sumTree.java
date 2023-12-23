import java.util.*;
public class sumTree {
    
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null; 
            this.right = null;
        }
    }
    
    public static int getSumTree(Node root){
        if(root== null){
            return 0;
        }
        int data = root.data;
        int left = getSumTree(root.left);
        int right = getSumTree(root.right);

        root.data = left + right;
        return data + left + right;

    }

    public static void getPathToLeaf(Node root, ArrayList<Integer>arr){
        arr.add(root.data);
        if(root.left==null && root.right== null){
            System.out.println("path  : " + arr);
        }
        if(root.left!=null){
            getPathToLeaf(root.left, arr);
        }
        if(root.right!=null){
            getPathToLeaf(root.right, arr);
        }
        arr.remove(arr.size()-1);
        return;
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root =  new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
    
        return root;
    }


    public static void main(String[] args) {
        int[] elements = {8,5,3,6,10,11,14};
    Node root = null;
    for(int i = 0;i<elements.length;i++){
       root =  insert(root,elements[i]);
    }

       System.out.println(root.left.left.data);
       ArrayList<Integer>arr = new ArrayList<>();
        getPathToLeaf(root, arr);
    }
}
