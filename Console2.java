import java.io.*;
import java.util.Scanner;
public class Console{
	public void calculate()throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1. Simple Interest 2. Compound Interest\n");
		int n=s.nextInt();		
		switch(n) {
		case 1 : SimpleInterest value1=new SimpleInterest();
					value1.simpleInterest();
					break;
		case 2 : CompoundInterest value2=new CompoundInterest();
					value2.compoundInterest();
					break;
					
		default : System.out.println("Enter valid number !!");
		}

	}
	public static void main(String[] args)throws IOException
	{	
		Console obj=new Console();
		obj.calculate();
	}

}
