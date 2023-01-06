// 12. Write a program to generate reverse number of given 4 digit number. 

import java.util.Scanner;

public class reverse {
    public static void main(String Args[]) {
        int reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four digit number : ");
        int num = sc.nextInt();
        while (num != 0) {
            int d = num % 10;
            reversed = reversed * 10 + d;
            num = num / 10;
        }
        System.out.println("Reversed number:" + reversed);
        sc.close();
    }

}
