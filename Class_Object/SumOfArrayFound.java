 /*Q1. WAP to Create class name as ArrayParent with method void setArray(in voidt a[]): this method is used for accept the array as parameter or accept integer array as parameter 
We have two child classes name as 
SubArray with method void setIndexes(int start,int end) you have to travel the array between two index and create sub new sub array and we have one method name as int [] getSubArray() 
This method can return sub array which is between two index which we pass in setIndexes() methods 
We have one more class name as FindSumSubArray with two method
void setValue(int value): this method can accept one integer parameter and we have one method name as void findSubArrayWithSum()
This method help us the sub array whose element sum is equal with value pass in setValue() function  and one method name as int [] getSubArray() this  method can return values of sub array which is equal with value pass in setvalue() and if sum is not equal with value pass in setValue() then return null
*/

import java.util.*;
class ArrayParent
{
	int a[];
	void setArray(int a[])
	{
		this.a=a;
	}
}

class subArray extends ArrayParent
{
	int start;
	int end;
	void setIndexes(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	int[] getSubArray()
	{
			if(start>=0 && end<a.length)
		{
			int length=end-start+1;
			int[]newarr=new int[length];
				int j=0;
				for(int i=start; i<end; i++)
				{
					newarr[j++]=a[i];
				}
				return newarr;
		}
			else
			{
				System.out.println("invalid index range");
				return null;
			}
			
	}
}

class FindSumSubArray extends ArrayParent
{
	int value;
	int array[];
	void setValue(int value)
	{
		this.value=value;
	}
	void findSubArrayWithSum()
	{
		System.out.println("sub array with sum"+value+"is");
		boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			int sum=a[i];
			for(int j=i+1; j<a.length; j++)
			{
				sum=sum+a[j];
				if(value==sum)
				{
					flag=true;
					for(int k=i; k<=j; k++)
					{
						System.out.println(a[k]+" ");
					}
				}
			}
		}
		if(!flag)
		{
			System.out.println("no subarray with given sum was found");
		}
	}
}

public class SumOfArrayFound
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the starting index");
		int start=sc.nextInt();
		System.out.println("Enter ending index of array");
		int end=sc.nextInt();
		
		subArray s=new subArray();
		s.setArray(a);
		s.setIndexes(start,end);
		int result[]=s.getSubArray();
		System.out.println("new subarry is");
		if(result!=null)
		{
			for(int i=0; i<result.length; i++)
			{
				System.out.println(result[i]+" ");
			}
		}
		else
		{
			System.out.println("Array is null");
		}
		
		System.out.println("enter a sum to find subarray");
		int n=sc.nextInt();
		FindSumSubArray fs=new FindSumSubArray();
		fs.setArray(a);
		fs.setValue(n);
		fs.findSubArrayWithSum();
	}
}