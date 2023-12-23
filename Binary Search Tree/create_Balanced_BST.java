public class create_Balanced_BST {
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

    public static Node InsertBalanced( int[] arr , int low, int high ){
        if(low<0 || high>=arr.length || low>high){
            return null;
        }

        int n = (low+high)/2;

        Node temp = new Node(arr[n]);
        temp.left = InsertBalanced(arr, low, n-1);
        temp.right = InsertBalanced(arr, n+1, high);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};
        Node root = InsertBalanced(arr, 0, arr.length-1);
        Inorder(root);
        System.out.println(root.data);
    }
}
