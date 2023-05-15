package multipleInheritance;

public class FoodAppDriver {

	public static void main(String[] args) {

		Zomato z1 = new Zomato("Deepinder Goyal", "Gurugram", 468700000.00, "Food", "Deepinder Goyal", 4.5, true, 10000);
		
		z1.displayZomato();
		
		Swiggy s1 = new Swiggy("Sriharsha Majety", "Bangalore ", 3698574512.00, "Food", "Sriharsha Majety", 4, false, 5000);
		s1.displaySwiggy();

	}
	
}
