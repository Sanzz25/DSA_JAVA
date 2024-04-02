import java.util.Scanner;
class A
{
    int max,top;
    int s[];
    A(int size)
{
    max=size;
    s=new int[max];
    top=-1;
}
void push(int v)
{
    if(!isFull())
    s[++top]=v;
    else
    System.out.println("Stack is full");
}
int pop() 
{
    if (!isEmpty()) 
    {
        int p= s[top--];
        System.out.println("Popped: " + p);
        return p;
    } else 
    {
        System.out.println("Stack is empty. Cannot pop.");
        return -1;
    }
}
boolean isFull() 
{   
        return top == max - 1;
    
}
boolean isEmpty() 
{
    return top == -1;
}
int peek() 
{
    return isEmpty() ? -1 : s[top];
}

int stackTop() 
{
    return top;
}
public static void main(String args[])
{
    
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size= ab.nextInt();
    A obj= new A(size);
    System.out.println("Enter the elements");
    for (int i=0;i<size+3;i++)
    {
        int e=ab.nextInt();
        obj.push(e);
        
    }
    obj.pop();
    System.out.println("Peek: " + obj.peek());
    System.out.println("Stack Top: " + obj.stackTop());
    }
       
}

