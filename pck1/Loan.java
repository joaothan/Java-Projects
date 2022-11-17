package pck1;

public class Loan extends Schedule {

	public Loan(double Principal, double InterestRate, double PrincipalPaid)
	{
		super(Principal, InterestRate, PrincipalPaid);
	}
	public void ShowHistory()
	{
		super.Transaction();

	}

}
