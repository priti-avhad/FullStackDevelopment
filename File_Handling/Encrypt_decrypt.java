import java.io.*;
import java.util.*;
class product implements Serializable
{
	private int id;
	private String name;
	private int sal;
	public product(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class Encrypt_decrypt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter id :");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name :");
			String name=sc.nextLine();
			System.out.println("Enter salary :");
			int sal=sc.nextInt();
			
			product p=new product(id,name,sal);
			
			FileOutputStream fout=new FileOutputStream("D:\\java course.txt");
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			oout.writeObject(p);
			oout.close();
			fout.close();
			System.out.println("Data save successfully");
			
			FileInputStream fin=new FileInputStream("D:\\java course.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			product desearalize=(product)oin.readObject();
			oin.close();
			fin.close();
			
			System.out.println("Desearalization is : "+desearalize);	
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}

	}

}
