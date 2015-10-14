import java.util.Scanner;


public class Workspace2 {

	public static void main(String[] args) {
		//System.out.println("Hello Class");
		//This is my development branch kylie1033
		// Outline for addition problem.
		
		int score = 5;
		int HardnessofQuestion = 10;
		// Round 1
		// Generate Random numbers
		int number1 = (int)(Math.random() * HardnessofQuestion);
		//System.out.println("Number1 is : " + number1 );
		int number2 = (int)(Math.random() * HardnessofQuestion);
		//System.out.println("Number1 is : " + number1 );
		int CorrectAnswer = number1 + number2;
		
		// Ask the user to add these two numbers together
		System.out.println("What integer is " + number1 + " + " + number2 + "?");
		
		// Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		
		// Check if the answer was correct
		// IF Correct
		if (studentAnswer == CorrectAnswer){
			//Tell them it was correct and give them points
			System.out.println("Answer is correct.");
			//Make next question harder
			System.out.println("Hardness is: " +  HardnessofQuestion);
			System.out.println("Score = " + score);
			}else{  
			// IF not correct
			//  Tell them it was wrong and do not give points
			//  Tell them the correct answer 
			System.out.println("Answer is incorrect.");
			System.out.println("The correct answer is: " + CorrectAnswer);
			//Make next question easier
			if(HardnessofQuestion>10) {
				HardnessofQuestion = HardnessofQuestion / 10;
				
			}
			}
		//end of round 1 
		System.out.println("End of round 1");
	

		
//Round 2
score = 5;
HardnessofQuestion = 100;
// Round 1
// Generate Random numbers
number1 = (int)(Math.random() * HardnessofQuestion);
//System.out.println("Number1 is : " + number1 );
number2 = (int)(Math.random() * HardnessofQuestion);
//System.out.println("Number1 is : " + number1 );
CorrectAnswer = number1 + number2;

// Ask the user to add these two numbers together
System.out.println("What integer is " + number1 + " + " + number2 + "?");

// Read in their response
//Scanner input = new Scanner(System.in);
studentAnswer = input.nextInt();

// Check if the answer was correct
// IF Correct
if (studentAnswer == CorrectAnswer){
	//Tell them it was correct and give them points
	System.out.println("Answer is correct.");
	//Make next question harder
	System.out.println("Hardness is: " +  HardnessofQuestion);
	System.out.println("Score = " + score * 2);
	}else{  
	// IF not correct
	//  Tell them it was wrong and do not give points
	//  Tell them the correct answer 
	System.out.println("Answer is incorrect.");
	System.out.println("The correct answer is: " + CorrectAnswer);
	//Make next question easier
	if(HardnessofQuestion>10) {
		HardnessofQuestion = HardnessofQuestion / 10;
		
	}
	}
//end of round 2 
System.out.println("End of round 2");


score = 25;
HardnessofQuestion = 1000;
// Round 3
// Generate Random numbers
number1 = (int)(Math.random() * HardnessofQuestion);
//System.out.println("Number1 is : " + number1 );
number2 = (int)(Math.random() * HardnessofQuestion);
//System.out.println("Number1 is : " + number1 );
CorrectAnswer = number1 + number2;

// Ask the user to add these two numbers together
System.out.println("What integer is " + number1 + " + " + number2 + "?");

// Read in their response
//Scanner input = new Scanner(System.in);
studentAnswer = input.nextInt();

// Check if the answer was correct
// IF Correct
if (studentAnswer == CorrectAnswer){
	//Tell them it was correct and give them points
	System.out.println("Answer is correct.");
	//Make next question harder
	System.out.println("Hardness is: " +  HardnessofQuestion);
	System.out.println("Score = " + score * 3);
	}else{  
	// IF not correct
	//  Tell them it was wrong and do not give points
	//  Tell them the correct answer 
	System.out.println("Answer is incorrect.");
	System.out.println("The correct answer is: " + CorrectAnswer);
	//Make next question easier
	if(HardnessofQuestion>10) {
		HardnessofQuestion = HardnessofQuestion / 10;
		
	}
	}
//end of round 3
System.out.println("End of round 3");

//Round 4


score = 5;
HardnessofQuestion = 10000;
// Round 1
// Generate Random numbers
number1 = (int)(Math.random() * HardnessofQuestion);
//System.out.println("Number1 is : " + number1 );
number2 = (int)(Math.random() * HardnessofQuestion);
//System.out.println("Number1 is : " + number1 );
CorrectAnswer = number1 + number2;

// Ask the user to add these two numbers together
System.out.println("What integer is " + number1 + " + " + number2 + "?");

// Read in their response
//Scanner input = new Scanner(System.in);
studentAnswer = input.nextInt();

// Check if the answer was correct
// IF Correct
if (studentAnswer == CorrectAnswer){
	//Tell them it was correct and give them points
	System.out.println("Answer is correct.");
	//Make next question harder
	System.out.println("Hardness is: " +  HardnessofQuestion);
	System.out.println("Score = " + score * 4);
	}else{  
	// IF not correct
	//  Tell them it was wrong and do not give points
	//  Tell them the correct answer 
	System.out.println("Answer is incorrect.");
	System.out.println("The correct answer is: " + CorrectAnswer);
	//Make next question easier
	if(HardnessofQuestion>10) {
		HardnessofQuestion = HardnessofQuestion / 10;
		
	}
	}
//end of round 4 
System.out.println("End of round 4 and end of the game");
}

}

