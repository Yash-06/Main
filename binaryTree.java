import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binaryTree{

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

    public void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void iterativeInOrderTraversal(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void postOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void interativePostOrderTraversal(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }
            else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.println(temp.data + " ");
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp = stack.pop();
                        System.out.println(temp.data + " ");
                    }
                }
                else{
                    current = temp;
                }
                }
            }
        }
    
        public void levelOrderTraversal(){
            if(root==null){
                return;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                TreeNode temp = queue.poll();
                System.out.println(temp.data + " ");
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }
    public static void main(String[] args) {
        binaryTree bT = new binaryTree();
        // bT.createBinaryTree();
        // bT.preOrderTraversal(bT.root);
        // // System.out.println(" ");
        // // bT.iterativePreOrder();
        // System.out.println(" ");
        bT.inOrderTraversal(bT.root);
        System.out.println(" ");
        //bT.postOrderTraversal(bT.root);
        bT.levelOrderTraversal();
    }
}


