import java.util.List;
import java.util.function.LongToIntFunction;
import java.util.spi.CurrencyNameProvider;

public class singlyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        public int value;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int count(){
        int count = 0;
        if(head==null){
            return 0;
        }
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
     }

     public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
     }

     public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
     }

     public void insertAtPosition(int position, int value){
        ListNode newNode = new ListNode(value);
        if(position==1){
            newNode.next = head;
            head = newNode;
        }
        else{
        ListNode current = head;
        int count = 1;
        while(count<position-1){
            current = current.next;
            count++;
        } 
        ListNode temp = current.next;
        current.next = newNode;
        newNode.next = temp;
     }

    }
     public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
     }

     public ListNode deleteLast(){
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return temp;

     }

     public ListNode deleteAtPosition(int position){
        if(position==1){
            head = head.next;
        }
        else{
        ListNode current = head;
        int count = 1;
        while(count<position-1){
            current = current.next;
            count++;
        }
        ListNode temp = current.next;
        current.next = temp.next;
        return current;
     }
        return head;
     }

     public boolean search(int key){
        if(head==null){
            return false;
        }
        else{
        ListNode current = head;
        while(current!=null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        System.out.println("Search key not found");
        return false;
      }
     }

     public ListNode reverseLinkedList(ListNode head){
        if(head==null){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
     }

     public ListNode middleNode(){
        if(head==null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;

     }

     public ListNode NthNodeFromEnd(int fromEnd){
        if(head==null){
            return null;
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count=0;
        while(count<fromEnd){
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
     }

     public void removeDuplicateFromSorted(){
        if(head==null){
            return;
        }
        ListNode current = head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current = current.next;
            }
        }
     }

     public ListNode insertNodeInSortedList(int value){

        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        if(head == null){
            return newNode;
        }
        // if(newNode.data==head.data || newNode.data<head.data){
        //     newNode.next=head;   
        //     head = newNode;
        // } 
        while(current!=null && current.data<=newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
     }

     public void removeKeyNode(int key){
        if(head.data==key){
            head = head.next;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current!=null && current.data!=key){
            temp = current;
            current = current.next;
        }
        if(current==null){
            return;
        }
        temp.next = current.next;
     }

    public boolean isLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }


    public ListNode startOfLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr==fastPtr){
                return findStartOfLoop(slowPtr);
            }
        }
        return null;
    }
    public ListNode findStartOfLoop(ListNode slowPtr){
        ListNode temp = head;
        while(temp!=slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }
    public ListNode removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr==fastPtr){
                remove_Loop(slowPtr);
            }
        }
        return head;
    }
    public void remove_Loop(ListNode slowPtr){
        ListNode temp = head;
        while(slowPtr.next!=temp.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public static ListNode mergeTwoSinglyLinkedList(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a!=null && b!=null){
            if(a.data<b.data){
                tail.next = a;
                a = a.next;
             }
              else {
                    tail.next = b;
                    b = b.next;
                }
                tail = tail.next;
            }
            if(a==null){
                tail.next = b;
            }
            else{
                tail.next = a;
            }
            return dummy.next;
        }
    
        public static ListNode addTwoSinglyLinkedList(ListNode a, ListNode b){
            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;
            int carry = 0;
            while(a!=null || b!=null){
                int x = (a!=null) ? a.value : 0;
                int y = (b!=null) ? b.value : 0; 
                int sum = carry + x + y;
                carry = sum/10;
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
                if(a!=null) a=a.next;
                if(b!=null) b=b.next;
            }
            if(carry>0){
                tail.next = new ListNode(carry);
            }
            return dummy.next;
        }

        
    public static void main(String[] args) {

        singlyLinkedList sll = new singlyLinkedList();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode second2 = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode third3 = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        sll.head.next = second;
        second.next = second2;
        second2.next = third;
        third.next = third3;
        third3.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        singlyLinkedList sll1 = new singlyLinkedList();
        sll1.insertLast(1);
        sll1.insertLast(3);
      
        
        singlyLinkedList sll2 = new singlyLinkedList();
        sll2.insertLast(4);
        sll2.insertLast(9);


        
        
        // sll.insertFirst(100);
        //sll.insertLast(99);
        // sll.insertAtPosition(6,234);
        // sll.display(sll.head);
        // System.out.println(" ");
        // sll.deleteFirst();
        // sll.deleteLast();
        //sll.deleteAtPosition(3);
        //System.out.println(sll.search(31));
        // ListNode reverse = sll.reverseLinkedList(sll.head);
        // sll.display(reverse);
        // ListNode middle = sll.middleNode();
        // System.out.println(middle.data);

        // ListNode nthEnd = sll.NthNodeFromEnd(2);
        // System.out.println(nthEnd.data);
        // sll.removeDuplicateFromSorted();
        // sll.display(sll.head);
        
        // sll.insertNodeInSortedList(0);
        // sll.display(sll.head);
        // sll.removeKeyNode(1);
        // sll.display(sll.head);
      
        //System.out.println(sll.isLoop());
        // System.out.println(sll.startOfLoop().data);
        //sll.display();
        //sll.display();
        // sll.removeLoop();
        // sll.display();

        // singlyLinkedList result = new singlyLinkedList();
        // result.head = mergeTwoSinglyLinkedList(sll1.head, sll2.head);
        // result.display();
        
        
        // System.out.println(" ");
        // System.out.print("Length : "+ sll.count());
    }

}



