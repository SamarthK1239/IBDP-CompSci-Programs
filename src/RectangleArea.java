import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length and breadth of your rectangle. Hit enter after each number");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        int area = length * breadth;

        System.out.println("The area of your rectangle is: " + area);
    }
}
