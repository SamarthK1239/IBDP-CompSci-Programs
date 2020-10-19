import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your numbers. Hit enter after each one");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.print("Number 1 is larger");
        } else if (num1 < num2) {
            System.out.println("Number 2 is larger");
        } else {
            System.out.println("Both numbers are equal");
        }

    }
}
