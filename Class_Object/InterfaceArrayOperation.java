import java.util.*;
interface ArrayOperation
{
	void performOperation(int x[]);
}

class sorting implements ArrayOperation
{
	public void performOperation(int x[])
	{
		for(int i=0; i<x.length; i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is as follows");
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]+" ");
		}
		System.out.println();
	}
}

class Insertion implements ArrayOperation
{
	private int no,ind;
	void setValue(int value, int index)
	{
		no=value;
		ind=index;
	}
	public void performOperation(int x[])
	{
		int newArray[]=new int[x.length+1];
		int j=0;
		for(int i=0; i<newArray.length; i++)
		{
			if(i==ind)
			{
				newArray[i]=no;
			}
			else
			{
				newArray[i]=x[j];
				j++;
			}
		}
		System.out.println("Array after insertion");
		for(int i=0; i<newArray.length; i++)
		{
			System.out.println(newArray[i]+" ");
		}
		System.out.println();
	}
}

class Deletion implements ArrayOperation
{
	private int ind;
	void setIndex(int index)
	{
		ind=index;
	}
	public void performOperation(int x[])
	{
		int newArray[]=new int[x.length-1];
        int j=0; 
        for (int i=0; i<x.length; i++) 
		{
            if (i!=ind) 
			{ 
                newArray[j] = x[i]; 
                j++; 
            }
        }
		System.out.println("Array after deletion");
		for(int i=0; i<newArray.length; i++)
		{
			System.out.println(newArray[i]+" ");
		}
		System.out.println();
	}
}
class Rev implements ArrayOperation
{
	public void performOperation(int x[])
	{
		 System.out.println("Reversed array is as follows:");
		  for (int i=x.length-1; i>=0; i--)
		{
            System.out.println(x[i]+" ");
        }
	}
}
public class InterfaceArrayOperation
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter values in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		 int choice;
		 do
		 {
			 System.out.println("choose an operation");
			 System.out.println("1. sort the array");
			 System.out.println("2. insert the values in the array");
			 System.out.println("3. delete the values in the array");
			 System.out.println("4. reverse the array");
			 
			 System.out.println("Enter the choice");
			 choice=sc.nextInt();
			 
			 ArrayOperation Ao=null;
			 switch(choice)
			 {
				 case 1:
				 Ao=new sorting();
				 break;
				 
				 case 2:
				 System.out.println("Enter values to insert");
				 int value=sc.nextInt();
				 System.out.println("Enter the index to insert");
				 int insertIndex=sc.nextInt();
				 
				 Insertion ins=new Insertion();
				 ins.setValue(value,insertIndex);
				 Ao=ins;
				 break;
				 
				 case 3:
				 System.out.println("Enter the index to delete");
				 int deleteIndex=sc.nextInt();
				 
				 Deletion del=new Deletion();
				 del.setIndex(deleteIndex);
				 Ao=del;
				 break;
				 
				 case 4:
				 Ao=new Rev();
				 break;
				 
				 case 5:
				 System.out.println("Exiting...Thank you!");
				 return;
				 
				 default:
				 System.out.println("invalid choice... please try again");
			 }
			 if(Ao!=null)
			 {
				 Ao.performOperation(a);
			 }
		 }while(choice!=5);
	}
}