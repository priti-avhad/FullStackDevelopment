import java.util.*;

class per
{
	String name,address,year;
	int id;
	void calPer(int s[])
	{
		int total=0;
		for(int i=0; i<s.length; i++)
		{
			total=total+s[i];
		}
		float percentage=(float)total/s.length;
		System.out.println("percentage is :"+percentage+"%");
	}
}

class CSE extends per
{
	private String name;
	private int id;
	private String address;
	private String year;
	
	public CSE(String name, int id, String address, String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showCSEPer(int s[])
	{
		 System.out.println("\nCSE Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Address: " + address);
        System.out.println("Year: " + year);
		calPer(s);
	}
	
}

class ETC extends per
{
	ETC(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	
	void showETCPer(int s[])
	{
		 System.out.println("\nETC Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Address: " + address);
        System.out.println("Year: " + year);
        calPer(s);
	}
}
public class EnggResultPercentCal
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Name: ");
		String cseName = scn.nextLine();
        System.out.print("Enter the Id: ");
        int cseId = scn.nextInt();
        scn.nextLine();
        System.out.print("Enter the Address: ");
        String cseAddress = scn.nextLine();
        System.out.print("Enter the Year: ");
        String cseYear = scn.nextLine();
        System.out.print("Enter the number of subjects: ");
        int cseSubjects = scn.nextInt();
		
		int cseScores[]=new int[cseSubjects];
		
		System.out.println("Enter the marks");
		for (int i=0; i<cseSubjects; i++) 
		{
            cseScores[i]=scn.nextInt();
        }

        CSE cseStudent = new CSE(cseName, cseId, cseAddress, cseYear);
        cseStudent.showCsePer(cseScores);
		
        System.out.println("\nEnter the ETC Student Details:");
        scn.nextLine();
        System.out.print("Enter the Name: ");
        String etcName = scn.nextLine();
        System.out.print("Enter the Id: ");
        int etcId = scn.nextInt();
        scn.nextLine();
        System.out.print("Enter the Address: ");
        String etcAddress = scn.nextLine();
        System.out.print("Enter the Year: ");
        String etcYear = scn.nextLine();
        System.out.print("Enter the number of subjects: ");
        int etcSubjects = scn.nextInt();
		
        int etcScores[] = new int[etcSubjects];
        System.out.println("Enter the marks:");
        for (int i=0; i<etcSubjects; i++) 
		{
            etcScores[i]=scn.nextInt();
        }
		
        ETC etcStudent = new ETC(etcName, etcId, etcAddress, etcYear);
        etcStudent.showETCPer(etcScores);
	}
}