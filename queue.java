import java.util.LinkedList;
import java.util.Queue;

import javax.management.ListenerNotFoundException;

public class queue {

    public void printArray(String arr[]){
        int n = arr.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    private ListNode front;
    private ListNode rear;
    private int length;
    private int result;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }
        else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Already empty");
        }
        else{
            int result = front.data;
            front = front.next;
            if(front==null){
                rear = null;
            }
        }
        length--;
        return result;
    }
    public void printQueue(){
        ListNode temp = front;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public String[] generateBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i=0;i<n;i++){
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        //q.printQueue();
        q.printArray(q.generateBinaryNumbers(10));
        
    }
}
