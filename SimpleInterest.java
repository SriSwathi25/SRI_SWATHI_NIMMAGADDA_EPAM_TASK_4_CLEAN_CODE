import java.io.*;
import java.util.Scanner;

public class SimpleInterest {
	int principal;
	int interestRate;
	int timeInYears;
	long answer;	
	public void simpleInterest()throws IOException {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("\nEnter Principal : ");
		this.principal=s.nextInt();
		System.out.println("\nEnter Interest Rate : ");
		this.interestRate=s.nextInt();
		System.out.println("\nEnter Time in years : ");
		this.timeInYears=s.nextInt();
		answer=simpleInterestCalculation(principal, interestRate, timeInYears);
		System.out.println("\nSimple interest for given inputs is : "+answer+"INR");
		
	}
	public long simpleInterestCalculation(int principal, int interestRate, int timeInYears)
	{
		long ans=principal*interestRate*timeInYears;
		return ans;
	}

}
