public class Ex1 {
	    public static void main(String[] args) { //Setting up the class
	        boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
	        int weight = 30; //Assigning weight to equal a numerical value of 30 
	        String name = "Billy Bob"; //Declared a string called name and assigned it a value of 'Billy Bob'
	        Dog goodBoy = new Dog(name, weight); //Declare a single dog called 'goodBoy' and setting it's name and weight as it's provided before
	        int x = weight - 10; //Assigning 'x' to equal weight minus 10
	        if (x < 15) goodBoy.bark(); //Conditional - if x is less than 15 the goodBoy barks
	        while (x < 3) { //creating a while loop where if x is smaller than 3
	            goodBoy.play(); // is the while loop is true then goodBoy plays
	            x++; //Add one to x
	        } //Repeat till x is smaller than 3
	        int[] numList = {1,2,3,4,5,6}; //set the numList array to be integers
	        System.out.println("How are you"); //System print 'How are you?'
	        System.out.println("My " + name + " is doing great"
	                + " how's yours");  // System print 'My (the name you have assigned for the dog. ie 'Billy Bob') is doing great''how's yours' all together
	        String num = "305";  //Declared a string and assign the 'num' a string of 305
	        int z =Integer.parseInt(num) ; //Taking the num and turning into an interger  called 'z'
	        System.out.println(num); //Print the 'num'
	        
	        double random = Math.random();
	        System.out.println(random);
	    }
}

//Tasks:
//All I want you to do is just make a comment and explain what's going on in each line
//Fix the issue -- Create a Dog...