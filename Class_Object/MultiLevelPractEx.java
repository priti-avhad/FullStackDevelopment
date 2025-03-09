import java.util.*;
class Board
{
	String boradName;
	
	void setBoardName(String boradName)
	{
		this.boradName=boradName;
	}
}

class STD extends Board
{
	int marks[];
	String stdName,studName;
	
	void setMarks(String stdName, String studName, int marks[])
	{
		this.stdName=stdName;
		this.studName=studName;
		this.marks=marks;
	}
}

class Result extends STD
{
	void showResult()
	{
		System.out.println("board name is"+boradName);
		System.out.println("standard name is"+stdName);
		System.out.println("student name is"+studName);
		
		int per=0;
		for(int i=0; i<marks.length; i++)
		{
			per=per+marks[i];
		}
		System.out.println("percentage is"+(per/marks.length));
	}
}

public class MultiLevelPractEx
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter board name");
		String boradName=sc.nextLine();
		System.out.println("Enter Standard name");
		String stdName=sc.nextLine();
		System.out.println("Enter student name");
		String studName=sc.nextLine();
		System.out.println("Enter marks of student");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Result r = new Result();
		r.setBoardName(boradName);
		r.setMarks(stdName,studName,a);
		r.showResult();
	}
}