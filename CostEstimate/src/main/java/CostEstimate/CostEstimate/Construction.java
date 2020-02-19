package CostEstimate.CostEstimate;

//class Construction is a subclass of User
public class Construction extends User {
	//array containing price per square feet for all standards
	private static int construction_cost_persqft[]={1200,1500,1800,2500};
	// method to calculate and return the total cost
	public static double cost(){
		return (automate?(construction_cost_persqft[user_material_standard]+700):construction_cost_persqft[user_material_standard])*area;
	}
}
