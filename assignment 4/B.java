import java.util.Scanner;
class Node
{
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class B 
    {
        private Node top;
        public B() 
        {
            this.top = null;
        }
    
        public void push(int value) 
        {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            System.out.println("Pushed: " + value);
        }
    
        public int pop() 
        {
            if (!isEmpty()) 
            {
                int poppedValue = top.data;
                top = top.next;
                System.out.println("Popped: " + poppedValue);
                return poppedValue;
            } 
            else 
            {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
        }
    
        public boolean isFull()
        {
            return false;
        }
    
        public boolean isEmpty() 
        {
            return top == null;
        }
    
        public int peek() 
        {
            if (!isEmpty()) {
                return top.data;
            } else {
                System.out.println("Stack is empty. Cannot peek.");
                return -1;
            }
        }
    
        public static void main(String[] args) 
        {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size= ab.nextInt();
    B stack = new B();
    System.out.println("Enter the elements");
    for (int i=0;i<size;i++)
    {
        int e=ab.nextInt();
        stack.push(e);
        
    }
    
            System.out.println("Peek: " + stack.peek());
    
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
       }     
    }