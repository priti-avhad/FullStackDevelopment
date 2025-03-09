public class FindLengthApp
{
	public static void main(String x[])
	{
		String s="good";
		s=s+"\0";
		int index=0;
		while(s.charAt(index)!='\0')
		{
			index++;
		}
		System.out.printf("length of the string is"+index);
	}
}