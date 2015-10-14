import java.util.Scanner;

public class WO {
	public static void main(String[] args) {
		// Round 3
		int hardnessofquestion = 100;
		int score = 25;
		// Generate Random numbers
		int Number1 = (int)(Math.random() * hardnessofquestion * 10);
		System.out.println("Number1 is : " + Number1 );
		int Number2 = (int)(Math.random() * hardnessofquestion * 10);
		System.out.println("Number2 is : " + Number2 );
		int correct_answer = Number1 + Number2;
		
		// Ask the user to add these two numbers together
		System.out.println("What is " + Number1 + " + " + Number2 + "?");
		
		
		// Read in their response
		Scanner input = new Scanner(System.in);
		int student_answer = input.nextInt();
		
		// Check if the answer was correct
		// IF Correct
		if (student_answer == correct_answer){
		}
		//  Tell them it was correct 
		//	Give them points
		System.out.println("Answer is correct.");
		//  Make the next question harder
		System.out.println("Hardness is: " +  hardnessofquestion *10);
		System.out.println("Score = " +  score * score );
	}{
		// IF not correct
		//  Tell them it was wrong
		System.out.println("Answer is incorrect.");
		String correct_answer;
		System.out.println("The correct answer is: " + correct_answer );
		//  Tell them the correct answer 
		//  Do not give them points
		//  Make next question easier

	}

}
