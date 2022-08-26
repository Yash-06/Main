package Problems;

import java.util.Stack;

import javax.swing.RootPaneContainer;
import javax.swing.tree.TreeNode;

public class symmetricBinaryTree {

        TreeNode root;
        private class TreeNode{
            private TreeNode left;
            private TreeNode right;
            public Object value;
        }
    
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.right);
        stack.push(root.left);
        while(!stack.isEmpty()){
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();
            if(n1 == null && n2 == null){
                continue;
            }
            if(n1 == null || n2 == null || n1.value != n2. value){
                return false;
            }
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }

    public void main(String[] args) {
        symmetricBinaryTree sbt = new symmetricBinaryTree();
        sbt.isSymmetric(root);
    }
}
