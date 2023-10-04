package CodSoft;

import java.util.Scanner;

public class Grade_Calculator{

	public static void main(String args[]){
		int marks[] = new int[5];
		int i;
		int total=0;
		int average;
		Scanner sc = new Scanner(System.in);
 
		System.out.print("Enter Marks for 5 Subjects : ");
		for(i=0; i < 5; i++){ 
			marks[i] = sc.nextInt(); 
			total = total + marks[i]; 
		} 
 
		average = total/5; 
		System.out.print("Student's Grade is "); 
		if(average >= 90){
			System.out.print("A");
		}else if(average > 70 && average<90){ 
			System.out.print("B"); }
		else if(average > 50 && average <70){
			System.out.print("C");
		} else{
			System.out.print("D");
		}
		
	}
}
