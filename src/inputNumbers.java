import java.util.Scanner;

public class inputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int outside = 0;
        for (int i = 0; i < 5000; i++) {
            System.out.println("Enter your number: ");
            String input = scanner.next();
            int length = input.length();
            if (length == 1) {
                one = one + 1;
            } else if (length == 2) {
                two = two + 1;
            } else if (length == 3) {
                three = three + 1;
            } else if (length == 4) {
                four = four + 1;
            } else {
                outside = outside + 1;
            }
        }
        float percentage = (outside / 5000) * 100;
        System.out.println("The number of numbers with 1 digit(s) was: " + one);
        System.out.println("The number of numbers with 2 digit(s) was: " + two);
        System.out.println("The number of numbers with 3 digit(s) was: " + three);
        System.out.println("The number of numbers with 4 digit(s) was: " + four);
        System.out.println("The percentage of numbers outside the range was: " +
                percentage);
    }
}