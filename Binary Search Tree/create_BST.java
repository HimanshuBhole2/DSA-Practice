
public class create_BST {
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

public static void Inorder(Node root){
    if(root == null){
        return;
    }
    Inorder(root.left);
    System.out.print(root.data + " ");
    Inorder(root.right);
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
public static Boolean search(Node root, int val){
    if(root == null){
        return false;

    }
    if(root.data==val){
        return true;
    }
    if(root.data>val){
     return search(root.left, val);
    }
    else{
    return search(root.right,val);
    }

}

public static Node delete(Node root , int val){
    if(root.data > val){
       root.left =  delete(root.left, val);
    }
    else if(root.data<val){
       root.right =  delete(root.right, val);
    }
    else{
    // root.data== val

    //leaf Node
    if(root.left == null  && root.right == null){
        return null;
    }
    //single Node
    if(root.left ==null){
        return root.right;
    }else if(root.right == null){
        return root.left;
    }

    //last Node
    Node IS = findInorderSuccssor(root);
    root.data = IS.data;

    root.right = delete(root.right, IS.data);    
    }
    return root;
}

public static Node findInorderSuccssor(Node root){
    while (root.left!=null) {
        root = root.left;
    }
    return root;
}

   public static void main(String[] args) {
    int[] elements = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i = 0;i<elements.length;i++){
       root =  insert(root,elements[i]);
    }
    System.out.println(root.data);
    Inorder(root);
    System.out.println(' ');
    root = delete(root ,11);
    Inorder(root);

   }
   
    
}
