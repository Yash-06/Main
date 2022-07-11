import java.util.Stack;

import javax.swing.RootPaneContainer;
import javax.swing.tree.TreeNode;

public class binaryTree {

    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = third;
        first.right = second;
        third.left = fourth;
        third.right = fifth;
    }    

    public void preOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void iterativePreOrder(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }

    public void postOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        binaryTree bT = new binaryTree();
        bT.createBinaryTree();
        bT.preOrderTraversal(bT.root);
        System.out.println(" ");
        bT.iterativePreOrder();
    }
}
