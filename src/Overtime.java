import java.util.Scanner;

public class Overtime {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int basePay = 0;
        int finalPay = 0;
        int overtimePay = 0;

        System.out.println("Enter the number of hours worked: ");
        int hours = scanner.nextInt();

        if (hours > 40){
            basePay = 40 * 50;
            int overtime = hours - 40;
            overtimePay = overtime * 75;

            finalPay = overtimePay + basePay;
        } else {
            finalPay = hours * 50;
        }
        System.out.println("The final payout is: " + finalPay);
    }
}
