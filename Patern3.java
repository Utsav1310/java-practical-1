// 8. Write a java program to print following pattern. 
//         1    
//       2 3 2
//     3 4 5 4 3
//   4 5 6 7 6 5 4
// 5 6 7 8 9 8 7 6 5

class Patern3 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j < 2 * i - 1; j++) {
                System.out.print(j+" ");
            }
            for (int j = 2 * i - 1; j > i - 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}