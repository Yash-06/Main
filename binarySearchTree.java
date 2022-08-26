import java.net.BindException;
import java.security.Key;

public class binarySearchTree {
    

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public TreeNode searchKeyInBST(int key){
        return searchKeyInBST(root, key);
    }
    public TreeNode searchKeyInBST(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key<root.data){
            return searchKeyInBST(root.left, key);
        }
        else{
            return searchKeyInBST(root.right, key);
        }
    }

    public boolean isBST(TreeNode root, long min, long max){
        if(root==null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        boolean left = isBST(root.left, min, root.data);
        if(left){
            boolean right = isBST(root.right, root.data, max);
            return right;
        }
        return false;
    }
    
    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(3);
        bst.insert(1);
        bst.insert(5);
        bst.insert(6);
        bst.insert(7);
        bst.inOrderTraversal(bst.root);
        System.out.println(" ");
        // if(null != bst.searchKeyInBST(20)){
           
        //     System.out.println("Key Found ");
        // }else{
        //     System.out.println("Key is not in tree");
        // }       
        System.out.println(bst.isBST(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        
    }
}
