import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int reversed = 0;
        System.out.println("Please enter your number");
        String input = scanner.nextLine().trim();
        StringBuilder builder = new StringBuilder(input);

        StringBuilder reverseStr = builder.reverse();
        try {
            reversed = Integer.parseInt(reverseStr.toString());
            System.out.println("The reversed string is: " + reversed);
        } catch (Exception e){
            System.out.println("Looks like you have given us an input that is non numerical");
        }



    }
}
