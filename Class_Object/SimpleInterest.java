import java.util.*;
class Interest
{
	private int pamt,irate,dur;
	
	public Interest(int pamt,int irate,int dur)
	{
		this.pamt=pamt;
		this.irate=irate;
		this.dur=dur;
	}
	public int getPrincipal() 
	{
        return pamt;
    }

    public int getRate() 
	{
        return irate;
    }

    public int getDuration() 
	{
        return dur;
    }
}

class CalculateInterest extends Interest
{
	public CalculateInterest(int pamt,int irate,int dur)
	{
		super(pamt,irate,dur);
	}
	void callInterest()
	{
		int principal = getPrincipal();
        int rate = getRate();
        int duration = getDuration();
        double simpleInterest = (principal * rate * duration) / 100.0;
        System.out.println("Simple Interest: " + simpleInterest);
	}
}
public class SimpleInterest
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter interest rate: ");
        int rate = sc.nextInt();

        System.out.print("Enter duration (in years): ");
        int duration = sc.nextInt();

        CalculateInterest calc = new CalculateInterest(principal, rate, duration);
        calc.callInterest();

	}
}