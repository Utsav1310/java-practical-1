// 10. Write a java program to print Pascal's triangle as shown below. 
//          1 
//         1 1
//        1 2 1 
//       1 3 3 1
//      1 4 6 4 1 
//    1 5 10 10 5 1
//   1 6 15 20 15 6 1 
//  1 7 21 35 35 21 7 1

public class Pascal {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = (num * (i-j))/(j + 1);
            }
            System.out.println();
        }
    }
}