import java.util.Scanner;
public class Workspace {
	private static final String Correctanswer = null;
	public static void main(String[] args) {
	System.out.println("Hello Kylie! Lets play a game!");
	//This is my development branch kylie1033
	// Outline for addition problem.
	
	int score = 5;
	int HardnessofQuestion = 10;
	// Round 1
	// Generate Random numbers
	int number1 = (int)(Math.random() * HardnessofQuestion);
	System.out.println("Number1 is : " + number1 );
	int number2 = (int)(Math.random() * HardnessofQuestion);
	System.out.println("Number2 is : " + number2 );
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
	
	int hardnessofquestion = 100;
	// Round 2
		// Generate Random numbers
		int Number1 = (int)(Math.random() * hardnessofquestion);
		System.out.println("Number1 is : " + Number1 );
		int Number2 = (int)(Math.random() * hardnessofquestion);
		System.out.println("Number2 is : " + Number2 );
		int Correctanswer = Number1 + Number2;
		
		// Ask the user to add these two numbers together
		System.out.println("What is " + Number1 + " + " + Number2 + "?");
		
		// Read in their response
		int studentanswer = input.nextInt();
		
		// Check if the answer was correct
		// IF Correct
		if (studentanswer == Correctanswer){
		//  Tell them it was correct 
		//	Give them points
		System.out.println("Answer is correct.");
		//  Make the next question harder
		System.out.println("Hardness is: " +  hardnessofquestion);
		System.out.println("Score = " + score * score);
		}else{
		// IF not correct
		//  Tell them it was wrong
		//  Tell them the correct answer 
		System.out.println("Answer is incorrect. You receive zero points.");
		System.out.println("The correct answer is: " + Correctanswer );
		//  Do not give them points
		//  Make next question easier

	int hardnessOfquestion = 1000;
	int Score = 25;
	// Round 3
	
		// Generate Random numbers
		int num1 = (int)(Math.random() * hardnessOfquestion);
		System.out.println("Number1 is : " + num1);
		int num2 = (int)(Math.random() * hardnessOfquestion);
		System.out.println("Number2 is : " + num2);
		int Correctaanswer = num1 + num2;
		
		// Ask the user to add these two numbers together
		System.out.println("What is " + num1 + " + " + num2 + "?");
		
		// Read in their response
		int StudentAnswer = input.nextInt();{
		
		// Check if the answer was correct
		// IF Correct
		if (StudentAnswer == Correctaanswer){
		//  Tell them it was correct 
		//	Give them points
		System.out.println("Answer is correct.");
		//  Make the next question harder
		System.out.println("Hardness is: " +  hardnessOfquestion);
		System.out.println("Score = " + score * Score);
		}else{
		// IF not correct
		//  Tell them it was wrong
		//  Tell them the correct answer 
		System.out.println("Answer is incorrect. You receive zero points.");
		System.out.println("The correct answer is: " + Correctaanswer );}}
		//  Do not give them points
		//  Make next question easier

	
	
int hardnessofQuestion = 10000;
// Round 4
	// Generate Random numbers
	int numberone = (int)(Math.random() * hardnessofQuestion);
	System.out.println("Number1 is : " + numberone );
	int numbertwo = (int)(Math.random() * hardnessofQuestion);
	System.out.println("Number2 is : " + numbertwo );
	int Correct_answer = numberone + numbertwo;
	
	// Ask the user to add these two numbers together
	System.out.println("What is " + numberone + " + " + numbertwo + "?");
	
	// Read in their response
	int Student_answer = input.nextInt();{
	
	// Check if the answer was correct
	// IF Correct
	if (Student_answer == Correct_answer){
	//  Tell them it was correct 
	//	Give them points
	System.out.println("Answer is correct.");
	//  Make the next question harder
	System.out.println("Hardness is: " +  hardnessofQuestion);
	System.out.println("Score = " + score * score);
	}else{
	// IF not correct
	//  Tell them it was wrong
	//  Tell them the correct answer 
	System.out.println("Answer is incorrect. You receive zero points.");
	System.out.println("The correct answer is: " + Correct_answer );}}}
	//  Do not give them points
	//  Make next question easier
	

	}}
