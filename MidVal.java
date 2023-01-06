// 2. Find and display middle value from given three numbers by using if…else statements. 

import java.util.Scanner;

public class MidVal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("Middle Value is : " + a);
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println("Middle value is : " + b);
        } else {
            System.out.println("Middle value is : " + c);
        }
        sc.close();
    }
}