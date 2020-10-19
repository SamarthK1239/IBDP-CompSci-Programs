import java.util.Scanner;

public class passFail {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 marks. Hit enter after each one: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int average = (num1 + num2 + num3 + num4) / 4;

        if (average > 70){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
