package multipleInheritance;

public class FoodApp {
	
	String founder;
	String origin;
	double net;
	String industry;
	
	public FoodApp() {
		// TODO Auto-generated constructor stub
	}
	
	public FoodApp(String founder,String origin,double net, String industry)
	{
		this.founder = founder;
		this.origin = origin;
		this.net = net;
		this.industry = industry;
	}
	
	public void displayFoodapp()
	{
		System.out.println("Founder of Company : " + founder);
		System.out.println("Headquartes : " + origin);
		System.out.println("Industry (Food/Pharma/Engg/Mech) : " + industry);
		System.out.println("Total Revenue : " + net);	
	}
}
