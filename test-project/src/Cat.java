
public class Cat { //class is general type for cat! And it can have instances of eg homecat, streetcat
					//Cat is object
	//field area
	
	private String color; //variables
	private boolean cute;
	private double price;
	
	//constructor:
	
	public Cat(String color, boolean cute, double price) { //this is also a function/method
		this.color = color;
		this.cute = cute;
		this.price = price;
			
	}
	
	//constructor 2:
	public Cat(String color, boolean cute) {
		this.color = color;
		this.cute = cute;
	}
	
	//constructor 3:
	public Cat(double price) {
		this.price = price;
	}
	
	
	//getters

	public String getColor() { // this is a method/function
		return color;
	}

	public boolean isCute() {
		return cute;
	}

	public double getPrice() {
		return price;
	}
	
	public static String getSound() {
		return "MEOW";
	}
	
	
}


