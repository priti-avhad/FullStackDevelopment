/*Q2. WAP to create abstract class name as Pattern with one abstract method 
abstract void  display(): this  is the abstract method and used for displaying the patterns.
We have to create two child classes name as First and need to override display() method
 in it and show the  following pattern
 1
 2 # 2
 3 # 3 # 3
 4 # 4 # 4 # 4
 5 # 5 # 5 # 5 # 5
Create one more class name as Second and override display() method in it and print the following pattern
a
A B
a b c 
A B C D
a b c d e*/

import java.util.*;
abstract class Pattern
{
	public abstract void display();
}

class First extends Pattern
{
	public void display()
	{
		System.out.println("First pattern");
		for(int i=1; i<5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i+"#");
				}
			}
			System.out.println();
		}
	}
}

class Second extends Pattern
{
	public void display()
	{
		char letters='a';
		char capitalLetters='A';
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print(capitalLetters+" ");
				}
			else
				{
					System.out.print(letters+" ");
				}
			letters++;
			capitalLetters++;
			}
			System.out.println();
			letters='a';
			capitalLetters='A';
		}
	}
		
}


public class AbstPatternPrint
{
	public static void main(String x[])
	{
		First fp=new First();
		fp.display();
		
		Second se=new Second();
		se.display();
	}
}