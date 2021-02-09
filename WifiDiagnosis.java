/*
 * Class: CMSC203 
 * Instructor: Professor Tarek
 * Description: This is a way for a user to self troubleshoot their Wifi. This program provides
 * a series of Yes or No questions that have to be typed correctly or else the 
 * question is asked once again. This continues for about 4 steps until reaching
 * the point where ISP needs to be contacted. 
 * Due: 2/06/2021
 * Platform/compiler: Eclipse.
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: __Kevin Toralez________
*/


import java.util.Scanner;

public class WifiDiagnosis {
/* This block of code goes through a process of calling each consecutive method and setting their returned values to the variable result.
 * Then result is set to either -1, if the user said no, or 0 if the user entered an invalid value and thereafter entered no. On the other hand,
 * If the user enters yes, the program terminates and no other questions are asked, therefore no result is needed to be returned. Lastly, the 
 * program is also terminated if all questions are asked and then the user is told to contact ISP and then program terminates. 
 */
	public static void main(String[] args) {
		int result;
		System.out.println("If you have a problem with internet "
				+ "connectivity, this WiFi Diagnosis might work.");
		result = Question1();
		
		if(result==0 || result==-1)
		{
			result=Question2();
		}
		
		if(result==0 || result==-1)
		{
			result=Question3();
		}
		
		if(result==0 || result==-1)
		{
			result=Question4();
		}
		
		if(result==0 || result==-1)
		{
			System.out.println("Please contact your ISP (Internet Service Provider).");
			System.out.println("Program Terminated.");
			System.exit(0);
		}
		
		
		
	}
	/* This method is meant to ask the first question for the user's potential fix of their internet issue. It first asks the user to peform a 
	 * task, being rebooting their computer, and then asks them to either enter yes or no if that procedure led to the fixing of the problem. 
	 * Invalid responses causes recursion to occur and the question to be asked again until either yes or no occurs. Consequently, 0 is returned if
	 * invalid answers are typed in, -1 if no, and nothing, program terminates, if yes is typed in and notifies the user the program ends. 
	 */
	public static int Question1()
	{
		int result=0;
		Scanner kb = new Scanner(System.in);
		String question1Answer;
		System.out.println("First step: Try rebooting your Computer.");
		System.out.println("If this worked, type \"Yes\". Otherwise, type \"No\".");
		question1Answer = kb.nextLine();
		if(question1Answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("Rebooting your computer seemed to fix your"
					+ " problem.");
			System.out.println("Program Terminated.");
			System.exit(0);
		}
		
		else if (question1Answer.equalsIgnoreCase("No"))
		{
			System.out.println("Sorry to hear that. Preceeding to the next step.\n");
			result=-1;
		}
		
		else 
		{
			System.out.println("Invalid input. Please try again.");
			Question1();
		}
		return result;
}
	/* This method is meant to ask the second question for the user's potential fix of their internet issue. It first asks the user to peform a 
	 * task, being rebooting their router, and then asks them to either enter yes or no if that procedure led to the fixing of the problem. 
	 * Invalid responses causes recursion to occur and the question to be asked again until either yes or no occurs. Consequently, 0 is returned if
	 * invalid answers are typed in, -1 if no, and nothing, program terminates, if yes is typed in and notifies the user the program ends. 
	 */
	public static int Question2()
	{
		int result=0;
		Scanner kb = new Scanner(System.in);
		String question2Answer;
		System.out.println("Second step: Try rebooting your router.");
		System.out.println("If this worked, type \"Yes\". Otherwise, type \"No\".");
		question2Answer = kb.nextLine();
		if(question2Answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("Rebooting your router seemed to fix your"
					+ " problem.");
			System.out.println("Program Terminated.");
			System.exit(0);
		}
		
		else if (question2Answer.equalsIgnoreCase("No"))
		{
			System.out.println("Sorry to hear that. Preceeding to the next step.\n");
			result=-1;
		}
		
		else 
		{
			System.out.println("Invalid input. Please try again.");
			Question2();
		}
		return result;
	}
	/* This method is meant to ask the third question for the user's potential fix of their internet issue. It first asks the user to peform a 
	 * task, being checking whether wires and power are adequately connected to the router, and then asks them to either enter yes or no if that procedure led to the fixing of the problem. 
	 * Invalid responses causes recursion to occur and the question to be asked again until either yes or no occurs. Consequently, 0 is returned if
	 * invalid answers are typed in, -1 if no, and nothing, program terminates, if yes is typed in and notifies the user the program ends. 
	 */
	public static int Question3()
	{
		
		int result=0;
		Scanner kb = new Scanner(System.in);
		String question3Answer;
		System.out.println("Third step: Make sure the wires that are connected to"
				+ " the router are firmly in place and power is going to the router.");
		System.out.println("If this worked, type \"Yes\". Otherwise, type \"No\".");
		question3Answer = kb.nextLine();
		if(question3Answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("Checking your wires and power status seemed to fix your"
					+ " problem.");
			System.out.println("Program Terminated.");
			System.exit(0);
		}
		
		else if (question3Answer.equalsIgnoreCase("No"))
		{
			System.out.println("Sorry to hear that. Preceeding to the next step.\n");
			result=-1;
		}
		
		else 
		{
			System.out.println("Invalid input. Please try again.");
			Question3();
		}
		return result;
	}
	/* This method is meant to ask the fourth and last question for the user's potential fix of their internet issue. It first asks the user to peform a 
	 * task, being move the computer closer to the router, and then asks them to either enter yes or no if that procedure led to the fixing of the problem. 
	 * Invalid responses causes recursion to occur and the question to be asked again until either yes or no occurs. Consequently, 0 is returned if
	 * invalid answers are typed in, -1 if no, and nothing, program terminates, if yes is typed in and notifies the user the program ends. 
	 */
	public static int Question4()
	{
		int result=0;
		Scanner kb = new Scanner(System.in);
		String question4Answer;
		System.out.println("Fourth step: Move the computer closer to the router and try again");
		System.out.println("If this worked, type \"Yes\". Otherwise, type \"No\".");
		question4Answer = kb.nextLine();
		if(question4Answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("Moving the computer closer to the router seemed to fix your"
					+ " problem.");
			System.out.println("Program Terminated.");
			System.exit(0);
		}
		
		else if (question4Answer.equalsIgnoreCase("No"))
		{
			System.out.println("Sorry to hear that. Preceeding to the last step.\n");
			result=-1;
		}
		
		else 
		{
			System.out.println("Invalid input. Please try again.");
			Question4();
		}
		return result;
	}
	
}
