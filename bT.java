import java.util.Queue;
import java.util.LinkedList;

public class bT {

    TreeNode root;
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
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }    
    public void preOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void levelOrderTraversal(){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }

    public int maxValueInBinaryTree(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = maxValueInBinaryTree(root.left);
        int right = maxValueInBinaryTree(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return result;
    }
    public static void main(String[] args) {
        bT b = new bT();
        b.createBinaryTree();
        // b.preOrderTraversal(b.root);
        // System.out.println(" ");
        // b.levelOrderTraversal();
        System.out.println(b.maxValueInBinaryTree(b.root));
        
    }
}
