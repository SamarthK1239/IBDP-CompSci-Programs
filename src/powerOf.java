import java.lang.Math;
import java.util.Scanner;

public class powerOf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the expression");
        double base = scanner.nextDouble();
        System.out.println("Enter the number you want to raise the base to");
        double pow = scanner.nextDouble();

        double answer = Math.pow(base, pow);

        System.out.println("The final result is: " + answer);
    }
}
