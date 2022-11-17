package pck1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount :");
		double amount=sc.nextDouble();
		System.out.println("Enter Interest Rate :");
		double interest=sc.nextDouble();
		System.out.println("Enter Monthly Principal Pay :");
		double principalPay=sc.nextDouble();
		Loan ln=new Loan(amount,interest,principalPay);
		ln.ShowHistory();
		

	}

}
