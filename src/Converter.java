import java.util.Scanner;
import java.util.ArrayList;
public class Converter {
static int cost;
static int amountPaid;
static ArrayList<Double> coins = new ArrayList<Double>();
	public static void main(String[] args) {
		//read in values
		gatherInfo();

	}
	public static void getCoinValues()
	{
		//Scanner file = new Scanner(coinValues.txt);
		
				
	}
	public static void gatherInfo()
	{
		System.out.println("Double check that all values are recorded in subunits. Enter values in 'units.subunits'");
		System.out.println("For example, if the item costs $4.31, enter 4.31.");
		Scanner costIn = new Scanner(System.in);
		System.out.println("Cost: ");
		double cost = costIn.nextDouble();
		Scanner amountPaidIn = new Scanner(System.in);
		System.out.println("Amount Paid: ");
		double amountPaid = amountPaidIn.nextDouble();
		
	}

}
