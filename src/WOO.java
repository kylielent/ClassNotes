import java.util.Scanner;
public class WOO {
	private static final String Correctanswer = null;
	public static void main(String[] args) {
	System.out.println("Hello Kylie! Lets play a game!");
	//This is my development branch kylie1033
	// Outline for addition problem.
	
	
	int score = 5;
	int hardnessOfquestion = 1000;
	// Round 3
	
		// Generate Random numbers
		int num1 = (int)(Math.random() * hardnessOfquestion);
		System.out.println("Number1 is : " + num1 );
		int num2 = (int)(Math.random() * hardnessOfquestion);
		System.out.println("Number2 is : " + num2 );
		int CorrectAnswer = num1 + num2;
		
		// Ask the user to add these two numbers together
		System.out.println("What is " + num1 + " + " + num2 + "?");
		
		// Read in their response
		Scanner input = new Scanner(System.in);
		int StudentAnswer = input.nextInt();
		
		// Check if the answer was correct
		// IF Correct
		if (StudentAnswer == CorrectAnswer){
		//  Tell them it was correct 
		//	Give them points
		System.out.println("Answer is correct.");
		//  Make the next question harder
		System.out.println("Hardness is: " +  hardnessOfquestion);
		System.out.println("Score = " + score * score);
		}else{
		// IF not correct
		//  Tell them it was wrong
		//  Tell them the correct answer 
		System.out.println("Answer is incorrect. You receive zero points.");
		System.out.println("The correct answer is: " + CorrectAnswer );}}}
		//  Do not give them points
		//  Make next question easier

	