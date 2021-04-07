import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Converter {
static int cost;
static int amountPaid;
static ArrayList<String> currencies = new ArrayList<String>();

	public static void main(String[] args) throws IOException
	{
		getCoinValues();
		gatherInfo();
		

	}
	public static void getCoinValues() throws IOException
	{
		Scanner file = new Scanner(new File("coinValues.txt"));
		while(file.hasNext())
		{
			currencies.add(file.nextLine());
			//file.next();
		}
				
	}
	public static void gatherInfo()
	{
		System.out.println("Currency Options: ");
		int counter = 1;
		for(String s : currencies)
		{
			System.out.println(counter + ". " + s);
			counter++;
		}
		Scanner costIn = new Scanner(System.in);
		System.out.println("Cost: ");
		double cost = costIn.nextDouble();
		Scanner amountPaidIn = new Scanner(System.in);
		System.out.println("Amount Paid: ");
		double amountPaid = amountPaidIn.nextDouble();
		
	}

}
