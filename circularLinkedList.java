import javax.management.ListenerNotFoundException;

public class circularLinkedList{

    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public circularLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        last = fifth;
    }

    public void display(){
        if(last==null){
            return;
        }
        ListNode temp = last.next;
        while(temp!=last){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertAtBegining(int value){
        ListNode newNode = new ListNode(value);
        if(last == null){
            last = newNode;
        }
        else{
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(last == null){
            last = newNode;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
        }
        last = newNode;
        length++;
    }

    public void removeFirst(){
        if(last==null){
            return;
        }
        ListNode temp = last;
        temp.next = temp.next.next;
    }

    public void removeLast(){
        if(last==null){
            return ;
        }
        ListNode temp = last.next;
        while(temp.next.data!=last.data){
            temp = temp.next;
        }
        temp.next = last.next;
        
    }
    
public static void main(String[] args) {
    circularLinkedList cll = new circularLinkedList();
    cll.createCircularLinkedList();
    // cll.display();
    // cll.insertAtBegining(111);
    // cll.display();
  
    cll.display();
    cll.removeLast();
    cll.display();
    }
}