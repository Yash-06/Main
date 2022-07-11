import java.util.List;
import java.util.NoSuchElementException;

public class doublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public void DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0; //head == null
    }

    public int length(){
        return length;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void displayForward(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head==tail){
            tail = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }
    
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head==tail){
            head = null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.next = null;
        return tail;
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);
        dll.insertFirst(1);
        dll.insertFirst(0);
       
        // dll.displayForward();
        // dll.deleteFirst();
        // dll.displayForward();
        // dll.displayBackward();
        // dll.displayForward();
        // dll.deleteLast();
       
        // dll.deleteLast();
        // dll.deleteFirst();
        dll.displayForward();
        
    }
}
