package multipleInheritance;

public class Swiggy extends FoodApp{
	
	String ceo;
	double rating;
	boolean interstate;
	int empno;
	
	public Swiggy() {
		// TODO Auto-generated constructor stub
	}
	
	public Swiggy(String founder,String origin,double net, String industry, String ceo, double rating, boolean interstate, int empno )
	{
		super(founder,origin,net,industry);
		this.ceo = ceo;
		this.rating = rating;
		this.interstate = interstate;
		this.empno = empno;
	}
	
	public void displaySwiggy()
	{
		displayFoodapp();
		System.out.println("CEO : " + ceo);
		System.out.println("No. of Employees : " + empno);
		System.out.println("Interstate Service : " + interstate);
		System.out.println("Rating : " + rating);
		
		System.out.println("=========================================================");
	}
}
