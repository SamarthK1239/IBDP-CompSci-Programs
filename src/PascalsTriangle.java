import java.util.Scanner;

//This code is courtesy of https://www.tutorialspoint.com/Java-program-to-print-Pascal-s-triangle
public class PascalsTriangle {
    static int factorial(int n) {
        int f;

        for (f = 1; n > 1; n--) {
            f *= n;
        }
        return f;
    }

    static int ncr(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n, i, j;

        System.out.print("Enter the number of rows to be calculated: ");
        n = scanner.nextInt();

        System.out.println();

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
    }
}
