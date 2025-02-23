import java.util.*;
class ArrayOperation
{
    int a[];
    int b[];
    
    void setArray(int a[], int b[])
    {
        this.a = a;
        this.b = b;
    }
}

class Unique extends ArrayOperation
{
    public void findUnique()
    {
        for(int i=0; i<a.length; i++)
        {
            boolean isUnique = true;
            for(int j=0; j<a.length; j++)
            {
                if(i != j && a[i] == a[j])
                {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}

class MergeArray extends ArrayOperation
{
    void mergeAlternate()
    {
        int i = 0, j = b.length - 1;
        while (i < a.length && j >= 0)
        {
            System.out.print(a[i] + " " + b[j] + " ");
            i++;
            j--;
        }
        System.out.println();
    }
}

public class MayTestUniqMerge
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();
        int a[] = new int[size1];
        System.out.println("Enter values in the first array:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of the second array:");
        int size2 = sc.nextInt();
        int b[] = new int[size2];
        System.out.println("Enter values in the second array:");
        for(int i = 0; i < b.length; i++)
        {
            b[i] = sc.nextInt();
        }
        
        if(size1 != size2)
        {
            System.out.println("Error: Arrays must be of the same size for merging.");
        }
        else
        {
            Unique u = new Unique();
            u.setArray(a, b);
            System.out.println("All unique elements in the array are:");
            u.findUnique();
            
            MergeArray m = new MergeArray();
            m.setArray(a, b);
            System.out.println("Merged array:");
            m.mergeAlternate();
        }
        
        sc.close();
    }
}
