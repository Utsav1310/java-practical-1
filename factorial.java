// 6. Display factorial of given number using do…while loop in java program.

import java.util.Scanner;

public class factorial {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        long factorial=1;
        int i=1;

        do
        {
            factorial=factorial*i;
            i++;
        }while(i<=number);

        System.out.println("Factorial of "+number+" is:"+factorial);
        sc.close();
    }
    
}
