import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int originalNumber= (int) (Math.random()*100);
		Thread.sleep(1000);
		System.out.println("*********WELCOME TO THE GUESS THE NUMBER GAME**************");
		Thread.sleep(2000);
		System.out.println("--------------------------Rules-----------------------------");
		Thread.sleep(1000);
		System.out.println("You have to guess number between [1-100]");
		Thread.sleep(1000);
		System.out.println("If you guess the right number you won");
		Thread.sleep(1000);
		System.out.println("If not then try again");
		Thread.sleep(1000);
		System.out.println("Want to exit just press any negitive number");
		
		int userGuessNumber=0;
		do {
		System.out.println("Guess Your Number Between [1-100]");
		 userGuessNumber=sc.nextInt();
		 if(userGuessNumber==originalNumber)
		 {
			 System.out.println("Wooohoo Your Guess is Right Won the Game...");
			 System.exit(0);
		 }
		 else if(userGuessNumber>originalNumber)
			 System.out.println("Number is too large guess small number");
		 else if(userGuessNumber<originalNumber && userGuessNumber>0)
			 System.out.println("Number is too small guess large number");
		}while(userGuessNumber>0);
		
	}

}
