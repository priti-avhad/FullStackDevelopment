import java.util.*;
class Interest
{
	 int pamt;
	 int irate; 
	 int dur;
	
	void setPRD(int pamt, int irate, int dur)
	{
		this.pamt=pamt;
		this.irate=irate;
		this.dur=dur;
	}
}

class CalculateInterest extends Interest
{
	void CallInterest()
	{
		 int Interest=(pamt*irate*dur)/100;
		 System.out.println("interest is"+Interest);
	}
}

public class InterestCalculation
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details");
		System.out.println("Enter principal amount");
		int pamt=sc.nextInt();
		System.out.println("Enter interest rate");
		int irate=sc.nextInt();
		System.out.println("Enter duration");
		int dur=sc.nextInt();
		
		CalculateInterest cal=new CalculateInterest();
		cal.setPRD(pamt,irate,dur);
		cal.CallInterest();
		
	}
}