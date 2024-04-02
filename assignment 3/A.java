import java.util.Scanner;
class A
{
    int len(String a)
    {
        int i=1;
        while (a.charAt(i) != '\0') {
            i=i+1;
        }
        return i;
        }
        void lower(String a)
        {
            String t="";
            int l=a.length();
            for (int i=0;i<l;i++)
            {
                char ch=a.charAt(i);
                if(ch>=65 && ch<=90)
                {
                    int s=ch+32;
                    t=t+(char)s;
                }
                else
                {
                 t=t+ch;
                }
                
            }
            System.out.println("New String is: "+t);
        }
        void count(String a)
        {
            
            int l=a.length();
            int b=0,c=1;
            for (int i=0;i<l;i++)
            {
                char ch=a.charAt(i);
                if(ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'||ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
                {
                    b++;
                }
                else if(ch==' ')
                {
                  c++;
                }
                
            }
            System.out.println("Number of Vowels: "+b);
            System.out.println("Number of Words: "+c);
        }
        void valid(String a)
        {
            int l=a.length();
            String t="";
            for (int i=0;i<l;i++)
            {
                char ch=a.charAt(i);
                if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')||ch==' ')
                {
                    t="VALID";
                }
                else 
                {
                    t="NOT VALID";
                }
                
            } 
            System.out.println("String is: "+t);
        }
        void rev(String a)
        {
            String t="";
            String y="";
            int l=a.length();    
            for (int i=0;i<l;i++)
            {
                
                char ch=a.charAt(i);
                 if(ch!=' ')
                {
                    t=ch+t;
                }
                else 
                {
                    y = y + t +" ";
                    t=" ";
                     
                }             
            } 
            y=y+t;
           System.out.println("Reversed String is: "+y);
        }
        void pallin(String a)
        {
            String t="";
            String y="";
            int l=a.length();    
            for (int i=0;i<l;i++)
            {
                
                char ch=a.charAt(i);
                 if(ch!=' ')
                {
                    t=ch+t;
                }
                else 
                {
                    y = y + t +" ";
                    t=" ";
                     
                }             
            } 
            y=y+t;
           if(t.compareTo(a)==0)
           System.out.println("Pallindrome String is: "+y);
           else
           System.out.println("Not Pallindrome String is: "+y);
        }
    public static void main(String[] args) {
         A obj=new A();
        Scanner ab=new Scanner (System.in);
        System.out.println("Enter The String: ");
        String a=ab.nextLine();
        // int c=obj.len(a);
        // System.out.println("Length of String is: "+(c+1));
        obj.lower(a);
        obj.count(a);
        obj.valid(a);
        obj.rev(a);
        obj.pallin(a);
    }
}




Q2: Factorial Calculation Recursively
java
Copy code
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        int f = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + f);
    }

    static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}




Q3: Combination (nCr) using Recursion
java
Copy code
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        System.out.print("Enter r: ");
        int r = s.nextInt();

        int result = calculateCombination(n, r);
        System.out.println("Combination of " + n + "C" + r + " is: " + result);
    }

    static int calculateCombination(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return calculateCombination(n - 1, r - 1) + calculateCombination(n - 1, r);
        }
    }
}




Q5: Tower of Hanoi using Recursion
java
Copy code
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int d = s.nextInt();

        System.out.println("Steps to solve Tower of Hanoi with " + d + " disks:");
        solveTowerOfHanoi(d, 'A', 'B', 'C');
    }

    static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }
}




Q6: Fibonacci Series using Recursion
java
Copy code
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int t = s.nextInt();

        System.out.println("Fibonacci series:");
        for (int i = 0; i < t; i++) {
            System.out.print(calculateFibonacci(i) + " ");
        }
    }

    static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}