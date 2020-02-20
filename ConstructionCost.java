import java.io.*;
import java.util.*;
public class ConstructionCost{
    long area;
    int materialChoice;
    boolean Automated;
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	Scanner s=new Scanner(System.in);
	public void takeInput()throws IOException{
	System.out.print("Enter your choice number !!\n");
	System.out.print("Want Automated home ? : \n1. YES\n2. NO\n");
	int n=s.nextInt();
	this.Automated = n==1 ? true : false;
	if(!this.Automated){
	System.out.print("Choice 1 : Standard Materials\n");
	System.out.print("Choice 2 : Above Standard Materials\n");
	System.out.print("Choice 3 : High Standard Materials\n");
	int x=s.nextInt();
	this.materialChoice=x;
	}
	System.out.print("Enter area in meter square units :\n");
	this.area=s.nextLong();
	
	}
    public long computeCost(int materialChoice, boolean Automated)
    {
        long cost=0;
        if(Automated){
            cost=2500*this.area;
        }
        else{
            switch(materialChoice){
                case 1 : cost=1200*this.area;
                         break;
                case 2 : cost=1500*this.area;
                         break;
                case 3 : cost=1800*this.area;
                         break;
            }
		}
        return cost;
    }
}


