public class Cat {
	
	//Objects consists of two items
	//Variables, otherwise known as instance variables
	//An instance is a new but slightly different version
	
	//What would a cat have?
	//whiskers, tail, paws, colour
	
	int age;
	int noOfPaws; //default to zero
	boolean hasTail;
	int noOfWiskers;
	String colour;
	
	//The method is how the class is able to do things - its functionality
	//A method should only do one thing
	//Void here refers to the return type
	public void meow() {
		if (age < 7) {
			System.out.println("meeooow");
		} else if (age >= 7 && age < 12) {
			System.out.println("mid aged meow");
		} else {
			System.out.println("old meow");
		}
	}
	public void scratch() {
		System.out.println("Scratch");
	}
}
