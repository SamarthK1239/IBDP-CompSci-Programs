/*
 Work started on 12/09/2020
 Work ended on 13/09/2020
 Java program to calculate price of different quantities of different materials, calculate number of special packs, and calculate normal and special prices.
 Author: Samarth Kulkarni
 */

import java.util.Scanner;

public class ProgrammingTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many sacks will you purchase?");
        int numberOfSacks = scanner.nextInt();

        double price = finalPrice(numberOfSacks);


    }

    //validateEntries is the solution to task 1. It is called in the main method and requires two inputs: A string (inputString) and a double (weight)
    public static String validateEntries(String inputString, double weight) {
        String material = inputString.toLowerCase().substring(0, 1);
        String result = "Accepted. The contents are as follows. Material: " + inputString + ". Weight: " + weight + "kg";

        if (!material.equals("c") && !material.equals("g") && !material.equals("s")) {
            result = "Incorrect material. Only Cement, Gravel and Sand are accepted.";
        } else {

            if ((material.equals("g") || material.equals("s")) && (weight < 49.0 || weight > 50.1)) {
                result = "Incorrect weight. Allowed weights for gravel/sand are between 49.0kg and 50.1kg";
            } else if (material.equals("c") && (weight < 24.9 || weight > 25.1)) {
                result = "Incorrect weight. Allowed weights for cement are between 24.9kg and 25.1 kg";
            }

        }


        return result;
    }

    //MultipleInputs is the solution to task 2. It needs a single integer input (numberOfSacks). Called in main function and calls validateEntries
    public static double[] multipleInputs(int numberOfSacks) {
        Scanner scanner = new Scanner(System.in);
        double[] returned = new double[5];
        int rejected = 0;
        double totalWeight = 0;
        int c = 0;
        int s = 0;
        int g = 0;

        //runs the input and validation sequence for the number of times specified by the user
        for (int i = 0; i < numberOfSacks; i++) {
            System.out.println("Run number: " + (i + 1));
            System.out.println("Enter the contents and weight of the sack");
            String inputString = scanner.next();
            double weight = scanner.nextDouble();
            String material = inputString.toLowerCase().substring(0, 1);

            //Check to see if the given input is valid
            String validated = validateEntries(inputString, weight);

            //Change the rejected or totalWeight variable dependent on what validateEntries returns
            if (validated.contains("Incorrect")) {
                rejected++;

                System.out.println(validated);
            } else {
                System.out.println(validated);
                totalWeight = totalWeight + weight;

                switch (material) {
                    case "c":
                        c = c + 1;
                        break;
                    case "g":
                        g = g + 1;
                        break;
                    case "s":
                        s = s + 1;
                        break;
                }
            }
        }

        returned[0] = rejected;
        returned[1] = totalWeight;
        returned[2] = c;
        returned[3] = g;
        returned[4] = s;

        System.out.println("Number of entries rejected: " + returned[0]);
        System.out.println("Total weight: " + returned[1]);

        return returned;
    }

    //finalPrice is the answer to task 3. It needs a single integer input (numberOfSacks)
    public static double finalPrice(int numberOfSacks) {
        //double price = 0;
        int specials = 0;
        double[] returned = multipleInputs(numberOfSacks);

        double cementPrice = returned[2] * 3;
        double gravelPrice = returned[3] * 2;
        double sandPrice = returned[4] * 2;

        double basePrice = cementPrice + gravelPrice + sandPrice;

        while ((returned[2] - 1) >= 0 && (returned[3] - 2) >= 0 && (returned[4] - 2) >= 0) {
            if ((returned[2] - 1) >= 0 && (returned[3] - 2) >= 0 && (returned[4] - 2) >= 0) {
                specials = specials + 1;
                returned[2] = returned[2] - 1;
                returned[3] = returned[3] - 2;
                returned[4] = returned[4] - 2;
            }
        }

        double specialPrice = (specials * 10) + (returned[2] * 3) + (returned[3] * 2) + (returned[4] * 2);
        System.out.println("The total number of specials is: " + specials);
        System.out.println("The regular price is: " + basePrice);
        System.out.println("The special price is: " + specialPrice);

        return specialPrice;
    }
}
