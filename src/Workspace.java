import java.util.Scanner;
public class Workspace {
	public static void main(String[] args) {
	System.out.println("Hello Class!");
	//This is my development branch kylie1033
	// Outline for addition problem.
	// Round 1
	// Generate Random numbers
	int number1 = (int)(Math.random() *10);
	System.out.println("Number1 is : " + number1 );
	int number2 = (int)(Math.random() *10);
	System.out.println("Number2 is : " + number2 );
	int correctAnswer = number1 + number2;
	// Ask the user to add these two numbers together
	System.out.println("What is " + number1 + " + " + number2 + "?");
	
	// Read in their response
	Scanner input = new Scanner(System.in);
	int userAnswer = input.nextInt();
	
	// Check if the answer was correct
	// IF Correct
	if (userAnswer == correctAnswer){
		System.out.println("Answer is correct. You recieve points.");
	}else{  
		System.out.println("Answer is incorrect. You dont get any points");
	}
	//  Tell them it was correct 
	//	Give them points
	//  Make the next question harder
	// IF not correct
	//  Tell them it was wrong
	//  Tell them the correct answer 
	//  Do not give them points
	//  Make next question easier
	
	// Round 2
	// Generate Random numbers
	// Ask the user to add these two numbers together
	// Read in their response
	// Check if the answer was correct
	// IF Correct
	//  Tell them it was correct 
	//	Give them points
	//  Make the next question harder
	// IF not correct
	//  Tell them it was wrong
	//  Tell them the correct answer 
	//  Do not give them points
	//  Make next question easier
	
	// Round 3
	// Generate Random numbers
	// Ask the user to add these two numbers together
	// Read in their response
	// Check if the answer was correct
	// IF Correct
	//  Tell them it was correct 
	//	Give them points
	//  Make the next question harder
	// IF not correct
	//  Tell them it was wrong
	//  Tell them the correct answer 
	//  Do not give them points
	//  Make next question easier
	
	// Round 4
	// Generate Random numbers
	// Ask the user to add these two numbers together
	// Read in their response
	// Check if the answer was correct
	// IF Correct
	//  Tell them it was correct 
	//	Give them points
	//  Make the next question harder
	// IF not correct
	//  Tell them it was wrong
	//  Tell them the correct answer 
	//  Do not give them points
	//  Make next question easier	
	}
}