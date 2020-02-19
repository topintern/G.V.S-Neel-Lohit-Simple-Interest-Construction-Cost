package CostEstimate.CostEstimate;
import java.util.*;
public class User {
	//Input class variables input material standard,area of house, fully automate option 
	public static int user_material_standard;
	public static double area;
	public static boolean automate;
	
	public static String estimate() { 
	
	//Initialising  the scanner
	Scanner sc=new Scanner(System.in);
	
	//taking input
	user_material_standard=sc.nextInt();
	area=sc.nextDouble();
	automate=sc.nextBoolean();
	
	//closing scanner
	sc.close();
	
	new Construction();
	return "Construction Estimate is INR "+Construction.cost();
	}
	
}
