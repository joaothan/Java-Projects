package pck1;

public class Schedule 
{
	private double Principal;	
	private double InterestPaid;
	private double PrincipalPaid;
	private double InterestRate;
	private double Payment;
	public Schedule(double Principal, double InterestRate,double PrincipalPaid)
	{
		this.Principal=Principal;
		this.InterestRate=InterestRate;
		this.PrincipalPaid=PrincipalPaid;
		
	}
	public void Transaction()
	{
		System.out.println("Principal  \tInterest Paid  \t  Principal Paid \t Payment\n");
		while(Principal>=0)
		{	
			InterestPaid=Principal*((InterestRate/100)/12);
			PrincipalPaid=this.PrincipalPaid;
			Payment=PrincipalPaid+InterestPaid;
			System.out.format("%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n",Principal,InterestPaid,PrincipalPaid,Payment);
			Principal=Principal-PrincipalPaid;	
		}
	}
}