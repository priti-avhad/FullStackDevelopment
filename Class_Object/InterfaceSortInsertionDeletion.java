import java.util.*;

interface ArrayOperation {
    void performOperation(int x[]);
}

class Sorting implements ArrayOperation {
    public void performOperation(int x[]) {
        for (int i=0; i<x.length; i++) {
            for (int j=i+1; j<x.length; j++) {
                if (x[i] > x[j]) {
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int i=0; i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}

class Insertion implements ArrayOperation {
    private int no, ind;

    void setValue(int value, int index) {
        no=value;
        ind=index;
    }

    public void performOperation(int x[]) {
        int newArr[]=new int[x.length + 1];
        int j=0;
        for (int i=0; i<newArr.length; i++) {
            if (i==ind) {
                newArr[i]=no;
            } else {
                newArr[i]=x[j];
                j++;
            }
        }
        System.out.println("Array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}

class Deletion implements ArrayOperation {
    private int ind;

    void setIndex(int index) {
        ind = index;
    }

    public void performOperation(int x[]) {
        if (ind < 0 || ind >= x.length) {
            System.out.println("Invalid index for deletion.");
            return;
        }
        int newArray[] = new int[x.length - 1];
        int j = 0;
        for (int i = 0; i < x.length; i++) {
            if (i != ind) {
                newArray[j] = x[i];
                j++;
            }
        }
        System.out.println("Array after deletion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}

class Rev implements ArrayOperation {
    public void performOperation(int x[]) {
        System.out.println("Reversed array is:");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}

public class InterfaceSortInsertionDeletion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter values in the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Sort the array");
            System.out.println("2. Insert a value into the array");
            System.out.println("3. Delete a value from the array");
            System.out.println("4. Reverse the array");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            ArrayOperation ao = null;
            switch (choice) {
                case 1:
                    ao = new Sorting();
                    break;

                case 2:
                    System.out.println("Enter value to insert:");
                    int value = sc.nextInt();
                    System.out.println("Enter index to insert:");
                    int insertIndex = sc.nextInt();

                    Insertion ins = new Insertion();
                    ins.setValue(value, insertIndex);
                    ao = ins;
                    break;

                case 3:
                    System.out.println("Enter index to delete:");
                    int deleteIndex = sc.nextInt();

                    Deletion del = new Deletion();
                    del.setIndex(deleteIndex);
                    ao = del;
                    break;

                case 4:
                    ao = new Rev();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (ao != null) {
                ao.performOperation(a);
            }
        } while (choice != 5);

        sc.close();
    }
}
