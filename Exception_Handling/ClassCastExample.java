public class ClassCastExample {
    public static void main(String[] args) 
	{
		try
		{
			Object obj = "Hello"; 
			Integer num = (Integer) obj; 
			System.out.println(num);
		}
		catch(ClassCastException ex)
		{
			System.out.println("Eror is :"+ex);
		}
    }
}
