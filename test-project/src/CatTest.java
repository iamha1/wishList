
public class CatTest {

	public static void main(String[] args) {
		
		//instantiate 3 cat objects for class Cat

		Cat homeCat = new Cat("blue", true, 75.0); // relates to contructor1
		Cat streetCat = new Cat("red", false, 0.0);
		Cat noPriceCat = new Cat("yellow", true);// relates to constructor2
		Cat onlyPriceCat = new Cat(90.0); //relates to constructor 3
		Cat.getSound();
		noPriceCat.getColor();
		System.out.println(homeCat.getColor()); // get the color of homecat - blue
		System.out.println(streetCat.getColor()); //get color of streetcat - red
		
	}

}
