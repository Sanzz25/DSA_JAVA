import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}
public class D 
{
    Node head;
    public void display_1() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
     public void display() 
     {
        Node current = head;
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

     public int countNsum() 
     {
        int count = 0;
        int sum = 0;
        Node current = head;
        while (current != null) 
        {
            count++;
            sum = sum + current.data;
            current = current.next;
        }
        System.out.println("Node count: " + count);
        System.out.println("Node sum: " + sum);
        return count;
    }
    public int search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return 1;
            }
            current = current.next;
        }
        return 0;
    }
    public void insertFront(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertEnd(int data) 
    {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = newNode;
    
}
public void deleteFront() {
    if (head != null) {
        head = head.next;
    } else {
        System.out.println("List is empty. Cannot delete from an empty list.");
    }
}
public int isSorted()
 {
    if (head == null || head.next == null) 
    {
        return 1;
    }

    Node current = head;
    while (current.next != null) 
    {
        if (current.data > current.next.data) 
        {
            return 0;
        }
        current = current.next;
    }

     return 1;
}




public static void main(String args[])
{
    D obj = new D();
    Scanner ab=new Scanner(System.in);
        obj.insertEnd(5);
        obj.insertEnd(3);
        obj.insertEnd(8);
        obj.insertEnd(1);
        System.out.println("Original Linked List:");
        obj.display();
        obj.countNsum();
        System.out.println("enter element to be searched");
        int key=ab.nextInt();
       int a= obj.search(key);
       if(a==1)
       System.out.println("Present");
       else
       System.out.println("Not Present");
       System.out.println("enter element to be inserted");
       int i= ab.nextInt();
       obj.insertFront(i);
       System.out.println("Linked List after insertion:");
       obj.display_1();
       obj.deleteFront(); 
       System.out.println("Linked List after deletion:");
       obj.display_1();
       int b=obj.isSorted();
       if(b==1)
       System.out.println("Sorted"+b);
       else
       System.out.println("Not Sorted"+b);

       
    
}
}
