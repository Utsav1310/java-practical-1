// 4. Write a java program to print following pattern using while loops only. 
// 1
// 2 4
// 3 6 9
// 4 8 12 16
// 5 10 15 20 25

public class Patern1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 5) {
            while (j <= i) {
                System.out.print(" " + i * j);
                j++;
            }
            j = 1;
            System.out.println();
            i++;
        }
    }
}
