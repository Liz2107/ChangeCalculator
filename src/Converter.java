import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Converter {
static int cost;
static int amountPaid;
static String currencyChoice;
static int currencyVal;
static int[][]coinValues;
static ArrayList<String> currencies = new ArrayList<String>();

	public static void main(String[] args) throws IOException
	{
		getCoinValues();
		gatherInfo();
		calculateChange();

	}
	
	public static void calculateChange()
	{
		int[] numCoinsReq = {0, 0, 0, 0, 0, 0, 0, 0};
		for(int i = 7; i >= 0; i--)
		{
			while(!(amountPaid + coinValues[currencyVal - 1][i] <= cost))
			{
				if(amountPaid + coinValues[currencyVal - 1][i] <= cost)
				{
					amountPaid += coinValues[currencyVal - 1][i];
					numCoinsReq[i] ++;
				}
			}
		}
		for(int j = 0; j < numCoinsReq.length; j++)
			System.out.println((j + 1) + ": " + numCoinsReq[j]);
		
		
	}
	public static int getFileLines() throws IOException
	{
		int lineCount = 0;
		Scanner f = new Scanner(new File("coinValues.txt"));
		while(f.hasNext())
		{
			lineCount++;
			f.nextLine();
		}
		return lineCount;
		
	}
	public static void getCoinValues() throws IOException
	{
		int counter = 0;
		
		coinValues = new int[(getFileLines() / 2)][8];
		Scanner file = new Scanner(new File("coinValues.txt"));
		while(file.hasNext())
		{
			currencies.add(file.nextLine());
			String[] temp = file.nextLine().split(" ");
			for(int j = 0; j < temp.length; j++)
				coinValues[counter][j] = Integer.parseInt(temp[counter]);
			counter++;
		}
		
				
	}
	public static void gatherInfo()
	{
		Scanner currencyIn = new Scanner(System.in);
		System.out.println("Currency Options: ");
		int counter = 1;
		for(String s : currencies)
		{
			System.out.println(counter + ". " + s);
			counter++;
		}
		currencyVal = currencyIn.nextInt();
		currencyChoice = currencies.get(currencyVal - 1);
		Scanner costIn = new Scanner(System.in);
		System.out.println("Cost: ");
		int cost = costIn.nextInt();
		Scanner amountPaidIn = new Scanner(System.in);
		System.out.println("Amount Paid: ");
		int amountPaid = amountPaidIn.nextInt();
		
	}

}
