public abstract class Vehicle {
	//attributs
	String brand;
	int kilometers;
	

	//constructeurs
	public Vehicle(String brand) {
		this.brand = brand;
		this.kilometers = 0;	
	}

	//getters setters
	public String getBrand(){
		return this.brand;	
	}
	public void setBrand(){
		this.brand = brand;
	}
	public int getKilometers(){
		return this.kilometers;
	}
	public void setKilometers(){
		this.kilometers = kilometers;		
	}

	//méthode
	public abstract String doStuff();
}
