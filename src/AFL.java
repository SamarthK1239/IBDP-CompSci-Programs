/*
Java program to calculate data related to scores. Averages, minimum, maximum, numbers of each of these.
Author: Samarth Kulkarni
 */
import java.util.Scanner;

public class AFL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[30];
        int[] test1 = new int[30];
        int[] test2 = new int[30];
        int[] test3 = new int[30];
        int[] totalScore = new int[30];
        int max = 0;
        int maxIndex = 0;
        int min = 0;
        int minIndex = 0;
        int[] sameMaxScores = new int[30];
        int[] sameMinScores = new int[30];
        int numberOfMax = 0;
        int numberOfMin = 0;
        int test1Sum = 0;
        int test2Sum = 0;
        int test3Sum = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Enter the name of student number: " + (i + 1));
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("Enter the test 1 score: ");
            test1[i] = scanner.nextInt();

            if (test1[i] > 20 || test1[i] < 0) {
                while (test1[i] > 20 || test1[i] < 0) {
                    System.out.println("Error, please enter the test 1 score: ");
                    test1[i] = scanner.nextInt();
                }
            }

            System.out.println("Enter the test 2 score: ");
            test2[i] = scanner.nextInt();

            if (test2[i] > 230 || test2[i] < 0) {
                while (test2[i] > 230 || test2[i] < 0) {
                    System.out.println("Error, please enter the test 2 score: ");
                    test2[i] = scanner.nextInt();
                }
            }

            System.out.println("Enter the test 3 score: ");
            test3[i] = scanner.nextInt();

            if (test3[i] > 330 || test3[i] < 0) {
                while (test3[i] > 330 || test3[i] < 0) {
                    System.out.println("Error, please enter the test 3 score: ");
                    test3[i] = scanner.nextInt();
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            totalScore[i] = test1[i] + test2[i] + test3[i];

            if (totalScore[i] > max) {
                max = totalScore[i];
                maxIndex = i;
            } else if (totalScore[i] < totalScore[0]) {
                min = totalScore[i];
                minIndex = i;
            } else {

            }
        }
        for (int i = 0; i < 30; i++) {

            int j = 0;
            int k = 0;

            if (totalScore[i] == max) {
                sameMaxScores[j] = i;
                j++;
                numberOfMax = numberOfMax + 1;
            } else if (totalScore[i] == min) {
                sameMinScores[k] = i;
                k++;
                numberOfMin = numberOfMin + 1;
            }
        }

        for (int i = 0; i < numberOfMax; i++) {
            System.out.println("The max score was obtained by: " + names[sameMaxScores[i]] + " with a total score of: " + max);
        }
        for (int i = 0; i < numberOfMin; i++) {
            System.out.println("The min score was obtained by: " + names[sameMinScores[i]] + " with a total score of: " + min);
        }

        for (int i = 0; i < 30; i++) {
            test1Sum = test1Sum + test1[i];
            test2Sum = test2Sum + test2[i];
            test3Sum = test3Sum + test3[i];
        }

        System.out.println("The average for test 1 was: " + (test1Sum / 30));
        System.out.println("The average for test 2 was: " + (test2Sum / 30));
        System.out.println("The average for test 3 was: " + (test3Sum / 30));

        for (int i = 0; i < 30; i++) {
            System.out.println(names[i] + " obtained " + test1[i] + ", " + test2[i] + ", and " + test3[i] + " for tests 1, 2 and 3 respectively.");
        }
    }
}
