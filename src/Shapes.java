import java.util.Scanner;

/**
 * Software Development 1, Coursework 1.
 */

public class Shapes {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Shape-Calculator(tm)!");
		
		/*the next two lines declare the String shape as well as create a scanner 
		 to allow the shape variable to be changed due to a user input. */
		String shape = new String("");
		Scanner shapeScanner = new Scanner(System.in);
		
		
		/* The following while loop makes it so that the program only moves on
		  when it has received the valid inputs "square" or "circle" from the scanner. */
		while(!(shape.equals("circle")||shape.equals("square"))) {
			
			System.out.println("Please enter either 'square' or 'circle'!");
			shape = shapeScanner.nextLine();
			
		}
		
		/*the next two lines declare the String shape as well as create a scanner 
		 to allow the calculationType variable to be changed due to a user input. */
		String calculationType = new String("");
		Scanner calculationTypeScanner = new Scanner(System.in);
		
		
		/* The following while loop makes it so that the program only moves on
		  when it has received the valid inputs "area" or "perimeter" from the scanner. */
		while(!(calculationType.equals("area")||calculationType.equals("perimeter"))) {
			
			System.out.println("Would you like to calculate its 'area' or 'perimeter'!");
			calculationType = calculationTypeScanner.nextLine();
			
		}
		
		/*the next two lines declare the String shape as well as create a scanner 
		 to allow the calculationType variable to be changed due to a user input. */
		double numberGiven = 0;
		Scanner numberGivenScanner = new Scanner(System.in);
		
		if(shape.equals("circle"))
		{
			
			/* The following while loop makes it so that the program only moves on
			  when it has received a valid input from the scanner (greater than 0). */
			while(numberGiven <= 0.0) {
				
				System.out.println("How large is it? Enter Diameter.");
				numberGiven = numberGivenScanner.nextDouble();
				
			}
			
			
		}
		else //if !shape.equals("circle"), shape.equals("square") because of the error checker above.
		{
			
			/* The following while loop makes it so that the program only moves on
			  when it has received a valid input from the scanner (greater than 0). */
			while(numberGiven <= 0.0) {
				
				System.out.println("How large is it? Enter Diameter or side length.");
				numberGiven = numberGivenScanner.nextDouble();
				
			}
			
		}
		
		/*the following code declares the double answer as well as uses the variables 
		 gathered so far to evaluate what the value of answer should be. */
		
		double answer;
		
		if(shape.equals("square") && calculationType.equals("area"))
		{
			answer = numberGiven * numberGiven;
		}
		else if(shape.equals("square") && calculationType.equals("perimeter"))
		{
			answer = numberGiven * 4;
		}
		else if(shape.equals("circle") && calculationType.equals("area"))
		{
			answer = Math.PI * ((numberGiven/2) * (numberGiven/2));
		}
		else //(shape.equals("circle") && calculationType.equals("perimeter")) is the only combination left.
		{
			answer = 2 * Math.PI * (numberGiven/2);
		}

		//the following code prints the result of the Shape-Calculator(tm).
		System.out.println("The " + calculationType + " of a " + shape + " with a diameter of " + numberGiven + " is " + answer + ".");
		
	}

}