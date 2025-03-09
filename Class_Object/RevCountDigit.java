/*Q. Write a Program to create abstract class name as Num with two methods void setNum(int no): this is the non 
abstract method which accept number as parameter abstract int getResult(): this is the abstract method can use
for perform different operation on number You have to create two child classes name as RevNumber and override the 
getResult() method and reverse the number and return it and you have to create class name as CountDigit   
and override getResult() method in it and count the number of digit and return its count.*/

import java.util.*;
abstract class Num
{
	private int no;
	public void setNum(int no)
	{
		this.no=no;
	}
	public int getNum()
	{
		return no;
	}
	public abstract int getResult();
}

class revNumber extends Num
{
	public int getResult()
	{
		int num=getNum();
		int reverse=0;
		while(num!=0)
		{
			reverse=reverse*10+(num%10);
			num=num/10;
		}
		return reverse;
	}
}

class countDigit extends Num
{
	public int getResult()
	{
		int num=getNum();
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
}

public class RevCountDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		
		//object of revNumber
		revNumber rev= new revNumber();
		rev.setNum(number);
		int revresult=rev.getResult();
		System.out.println("reverse number is"+revresult);
		
		//object of countDigit
		countDigit cd=new countDigit();
		cd.setNum(number);
		int digitCount=cd.getResult();
		System.out.println("count of digit is"+digitCount);
	}
}