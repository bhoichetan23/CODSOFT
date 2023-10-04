
package CodSoft;
import java.util.Scanner;
import java.lang.Math;

public class Guessing_Game {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int k=5;
		Scanner userInput=new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100. Tou have 5 chances to guess the correct number");
		
		while(k>0) {
			System.out.println("Enter your guess:");
			int guess=userInput.nextInt();
			if(guess==answer) {
			System.out.println("Congrats your guess is correct!");
			break;
				
			}
			else if(guess>answer) {
				System.out.println("Sorry!, your guess is too high. \nYou have"+" " +(k-1)+" "+ "attempt left");
				k--;
			}
			else {
				System.out.println("Sorry!, your guess is too low. \nYou have" +" "+(k-1)+" "+ "attempt left");
			    k--;
			}
			
			
		
		}
		if(k<=0) {
			System.out.println("Your chances are over");
			
		}
	}

}
