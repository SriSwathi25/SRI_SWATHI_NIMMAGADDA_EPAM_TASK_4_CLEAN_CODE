import java.io.*;
import java.util.*;
public class Console{
public static void main(String args[])throws IOException{
    ConstructionCost house=new ConstructionCost();
	house.takeInput();
    long cost=house.computeCost(house.materialChoice, house.Automated);
	System.out.println("Cost of building your house is :"+cost+" INR");
    
}
}
