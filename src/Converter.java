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
	public static int getFileLines() throws IOException
	{
		int lineCount = 0;
		Scanner f = new Scanner(new File("coinValues.txt"));
		while(f.hasNext())
		{
			lineCount++;
		}
		return lineCount;
	}
	public static void getCoinValues() throws IOException
	{
		int counter = 0;
		
		int[][] coinValues = new int[8][getFileLines() / 2];
		Scanner file = new Scanner(new File("coinValues.txt"));
		while(file.hasNext())
		{
			currencies.add(file.nextLine());
			String[] temp = file.nextLine().split(" ");
			for(int j = 0; j < temp.length; j++)
				coinValues[counter][j] = Integer.parseInt(temp[counter]);
			counter++;
		}
		//System.out.println(coinValues);
				
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
