import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String weekday, vacay;
        System.out.println("Are you on a weekday or a vacation? Weekday first, vacation second. True or false only.");
        weekday = scanner.nextLine().trim().toLowerCase();
        vacay = scanner.nextLine().trim().toLowerCase();

        boolean bool = Main.sleepIn(weekday, vacay);

        System.out.println(bool);
    }

    public static boolean sleepIn(String weekday, String vacay){
        boolean sleepIn = false;
        Scanner scanner = new Scanner(System.in);



        if (weekday.equals("false") || vacay.equals("true")){
            sleepIn = true;
        } else{

        }
        return sleepIn;
    }
}
