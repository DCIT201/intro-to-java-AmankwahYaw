package Assignments;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Yaw's Temperature Converter!");
        System.out.println("Select an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice! Please run the program again and enter 1 or 2.");
            return;
        }
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        if (choice == 1) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Your temperature in Fahrenheit is: " + fahrenheit);
        } else {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: " + celsius);
        }


        System.out.println("Thank you for using Yaw's Temperature Converter!");

        scanner.close();
    }
}