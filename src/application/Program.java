package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Create give up button
		// TODO History of user-entered numbers
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int upperbond = 101;
		
		int randomNum = rand.nextInt(upperbond);
		
		System.out.println("Guess a number: ");
		int userNum = sc.nextInt();
		
		String enteredNum = "History of entered numbers: ";
		
		enteredNum += String.valueOf(userNum);
		
		System.out.println(enteredNum);
		
		while (userNum != randomNum) {
			enteredNum += ", ";
			
			sc.nextLine();
			
			if (userNum > 100+randomNum || userNum < randomNum-100) {
				System.out.print("In another planet! ");
			} else if (userNum > 50+randomNum || userNum < randomNum-50) {
				System.out.print("So far away! ");
			} else if (userNum > 25+randomNum || userNum < randomNum-25) {
				System.out.print("Distant! ");
			} else if (userNum > 15+randomNum || userNum < randomNum-15) {
				System.out.print("Around! ");
			} else if (userNum > 10+randomNum || userNum < randomNum-10) {
				System.out.print("Close! ");
			} else if (userNum > 5+randomNum || userNum < randomNum-5) {
				System.out.print("So close! ");
			} else if (userNum > 1+randomNum || userNum < randomNum-1) {
				System.out.print("Right here! ");
			}
			
			System.out.print("Try again: ");
			userNum = sc.nextInt();
			
			enteredNum += String.valueOf(userNum);
			System.out.println(enteredNum);
		}
		
		System.out.println("Congratulations! You right!");

	}

}
