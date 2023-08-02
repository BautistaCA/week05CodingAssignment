package loggerInterface;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Used '\n' a lot to make what printed to the console looked cleaner
//-----------AsteriskLogger----------
		AsteriskLogger test = new AsteriskLogger();
		test.word = "Hello";
			System.out.println("---Log---" + '\n');
		test.log();
			System.out.println('\n' + "---Error---");
		test.error();
			System.out.println('\n');
//------------SpacedLogger----------		
			SpacedLogger test2 = new SpacedLogger();
		test2.word = "Hello";
			System.out.println("---Log---" + '\n');
		test2.log();
			System.out.println('\n' + "---Error---");
		test2.error();
			System.out.println('\n');
//---------ScannerTest-------------
//This was a personal test since I originally wanted to use 'Scanner' but didn't understand it enough at first
			Scanner userInput = null;
		try {// first time using a try block
		userInput = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String input = userInput.nextLine();
		AsteriskLogger inputTest = new AsteriskLogger();
		SpacedLogger spaceTest = new SpacedLogger();
		spaceTest.word = input;
		inputTest.word = input;
		inputTest.log();
		inputTest.error();
		spaceTest.log();
		spaceTest.error();
		}
		finally {
			if(userInput != null)
				userInput.close();
		}
	}

}
