// 3. Write a java program to display result according to given marks by using if…else if
// statement.
// If marks > 70 display ‘Distinction’
// If marks > 60 display ‘First class’
// If marks > 50 display ‘Second class’
// If marks > 35 display ‘pass class’
// Otherwise display ‘Fail’

import java.util.Scanner;

public class Grades {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks out of 100 : ");
		int marks = sc.nextInt();
		if (marks > 70 && marks <= 100) {
			System.out.println("Distinction");
		}
		else if (marks > 60 && marks <=70) {
			System.out.println("First Class");
		}
		else if (marks > 50 && marks <=60) {
			System.out.println("Second Class");
		}
		else if (marks > 35 && marks <=50) {
			System.out.println("Pass Class");
		}
		else if (marks >= 0 && marks <= 35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Please enter valid marks...!");
		}
		sc.close();
	}
}