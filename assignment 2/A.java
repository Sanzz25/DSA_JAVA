import java.util.Scanner;
class A
{
    Scanner ab= new Scanner(System.in);
    void display(int b[], int l)
    {
        for(int i=0;i<l;i++)
        {
            System.out.println(b[i]);
        }
        
    }
    void add(int b[], int l)
    {
        System.out.println("Enter the element to be added");
        int e=ab.nextInt();
        int b1[]=new int[l+1];
        for(int i=0;i<l;i++)
        {
            b1[i]=b[i];
        }
        b1[l]=e;
        for(int i=0;i<l+1;i++)
        {
                System.out.println(b1[i]);
        }

    }
     void insert(int b[], int l)
    {
        System.out.println("Enter the element to be added");
        int e=ab.nextInt();
        int j=0;
        System.out.println("Enter the location for the element to be added");
        int loc=ab.nextInt();
        int b1[]=new int[l+1];
        for(int i=0;i<=l;i++)
        {
            if(i==loc)
           { b1[i]=e;}
            else
            {b1[i]=b[j];
            j++;}
        }
        for(int i=0;i<=l;i++)
        {
                System.out.println(b1[i]);
        }

    }
    void delete(int b[], int l)
    {
        System.out.println("Enter the element to be deleted");
        int e=ab.nextInt();
        int j=0;
        for(int i=0;i<l;i++)
        {
            if(b[i]!=e)
            {
                System.out.println(b[j]);
            j++;
            }
        }
          }
     void linear(int b[], int l)
    {
        System.out.println("Enter the element to be searched");
        int e=ab.nextInt();
        int j=0;
        for(int i=0;i<l;i++)
        {
            if(b[i]==e)
            {
                System.out.println("Element found at index "+i);
            }
            else
            {
             j=-1;
            }
        }
        if (j==-1)
        {
            System.out.println("Element not found in the array ");
        }
          }
        void get(int b[], int l)
    {
        System.out.println("Enter the location for the element to be added");
        int loc=ab.nextInt();
        if(loc<l)
        System.out.println("Element present at location is "+b[loc]);
        else
        System.out.println("Location doesnot exist as length is "+l);
      }
        void set(int b[], int l)
    {
        System.out.println("Enter the element to be added");
        int e=ab.nextInt();
        System.out.println("Enter the location for the element to be added");
        int loc=ab.nextInt();
        int b1[]=new int[l];
        for(int i=0;i<l;i++)
        {
            if(i==loc)
           {
             b1[i]=e;
            }
            else
            {
                b1[i]=b[i];
            }
        }
        for(int i=0;i<l;i++)
        {
                System.out.println(b1[i]);
        }

    }
    void max(int b[], int l)
    {
        int a=0;
        for(int i=0;i<l;i++)
        {
           if(a <= b[i])
           {
            a=b[i];
           }

        }
        System.out.println("Maximum no. is "+a);

    }
    void min(int b[], int l)
    {
        int a=0,m=0;
        for(int i=0;i<l;i++)
        {
           if(a <= b[i])
           {
            a=b[i];
           }
           else
           {
            m =b[i];
           }

        }
        System.out.println("Minimum no. is "+m);

    }
    void reverse(int b[], int l)
    {
        for(int i=(l-1);i>=0;i--)
        {
             System.out.println(b[i]);
        }

    }
    void shift(int b[], int l)
    {
        System.out.println("Enter the no. by which array is to be shifted");
        int e=ab.nextInt();
        int j=0;
        int b1[]=new int[l];
        for(int i=0;i<e;i++)
        {
            b1[i]=0;
            
        }
         for(int i=e;i<l;i++)
        {
            b1[i]=b[j];
            j++;
        }

        for(int i=0;i<l;i++)
        {
                System.out.println(b1[i]);
        }

    }
    void rotate(int b[], int l)
    {
        System.out.println("Enter the no. by which array is to be rotated");
        int e=ab.nextInt();
        int j=e;
        int j1=0;
        int b1[]=new int[l];
        for(int i=j;i<l;i++)
        {
            b1[i]=b[j1];
            j1++;
            
        }
         for(int i=0;i<e;i++)
        {
            b1[i]=b[j1];
            j1++;
        }

        for(int i=0;i<l;i++)
        {
                System.out.println(b1[i]);
        }

    }
    
    public static void main(String args[])
    {
        A obj= new A();
        Scanner ab= new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int l=ab.nextInt();
        int b[]=new int[l];
        for(int i=0;i<l;i++)
        {
            b[i]=ab.nextInt();
        }
        obj.display(b,l);
        obj.add(b,l);
        obj.insert(b,l);
        obj.delete(b,l);
        obj.linear(b,l);
        obj.get(b,l);
        obj.set(b,l);
        obj.max(b,l);
        obj.min(b,l);
        obj.reverse(b,l);
        obj.shift(b,l);
        obj.rotate(b,l);
    }
}