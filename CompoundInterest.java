import java.io.*;
import java.util.Scanner;

public class CompoundInterest{
	int principal;
	int interestRate;
	int timeInYears;
	double answer;
	int numberOfTimes;
	public void compoundInterest()throws IOException {	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principal : ");
		this.principal=s.nextInt();
		System.out.println("Enter Interest Rate : ");
		this.interestRate=s.nextInt();
		System.out.println("Enter Time in years : ");
		this.timeInYears=s.nextInt();
		System.out.println("Enter Number of Times compounded in one "+timeInYears+" years : ");
		
		this.numberOfTimes=s.nextInt();
		
		answer=compoundInterestCalculation(principal, interestRate, timeInYears, numberOfTimes);
		System.out.println("Future Value for given inputs is : "+answer+"INR");
	}
	public double compoundInterestCalculation(int principal, int interestRate, int timeInYears, int numberOfTimes)
	{
		int value1=1+interestRate/numberOfTimes;
		double value2=Math.pow(value1, numberOfTimes*timeInYears);
		double answer=principal*value2;
		
		return answer;
	}

}

