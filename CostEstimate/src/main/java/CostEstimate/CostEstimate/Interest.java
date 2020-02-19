package CostEstimate.CostEstimate;

//class to calculate Simple,Compound Interest
public class Interest {
	//class variables amount,rate of interest,time in years
	int amount;
	double rate,timeinyears;
	//constructor 
Interest(int amount,double rate,double timeinyears )
{
	this.amount=amount;
	this.rate=rate;
	this.timeinyears=timeinyears;
}
//method to return calculated simple interest
public String SimpleInterest() {
	return "Simple Interest is "+(amount*rate*timeinyears)/100;
}
//method to return calculated compound interest
public String CompundInterest() {
	return "Compound Interest is "+(amount)*Math.pow(1+rate/100, timeinyears);
}
}
