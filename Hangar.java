import java.util.ArrayList;
public class Hangar {
	public static void main (String[]args){
		
		Car josephine = new Car ("Josephine"); 
		System.out.println("Je suis "+ josephine.getBrand() + josephine.doStuff());
		Boat nicolas = new Boat ("Nicolas");
		System.out.println("Je suis " + nicolas.getBrand() + nicolas.doStuff());
		Boat josephine1 = new Boat ("encore Joséphine");
		System.out.println("Je suis " + josephine1.getBrand() + josephine1.doStuff());

	
	}
}
