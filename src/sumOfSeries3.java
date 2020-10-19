import java.util.Scanner;

public class sumOfSeries3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter the final number that you want to sum up: ");
        int number = scanner.nextInt();

        for (double i = 0; i <= number; i++){
            sum = sum + 1/factorial(i);
        }
        System.out.println(sum);
    }

    static double factorial(double n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
