import java.util.EmptyStackException;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.RunElement;

public class stack {

    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public stack(){
        top = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        char[] c = str.toCharArray();
        for(char a:c){
            s.push(a);
        }
        for(int i=0;i<str.length();i++){
            c[i] = s.pop();
        }
        return new String(c);
    }

    public void nextGreaterElement(int[] arr){
        int[] op = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length;i>=0;i--){

        }
    }

    public boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if((top=='(' && c==')') || (top=='{' && c=='}') || (top=='[' && c==']')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // System.out.println(s.peek());
        // s.pop();
        // System.out.println(s.peek());

        // String str = "ABCD";
        // System.out.println("Before reverse : " + str);
        // System.out.println("After reverse : " + reverseString(str));
      
        System.out.println(s.validParenthesis("({()})"));
       
    }
}
