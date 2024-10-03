package oop;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Choose an Operation:");
            System.out.println("1. ARITHMETIC OPERATION");
            System.out.println("2. ARRAY ACCESS");
            int casenumber = scanner.nextInt();

            switch (casenumber) {
                case 1:
                    try {
                        System.out.print("Enter the numerator: ");
                        int numerator = scanner.nextInt();
                        System.out.print("Enter the denominator: ");
                        int denominator = scanner.nextInt();
                        int result = numerator / denominator;
                        System.out.println("Result = " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Caught an exception: " + e.getMessage());
                    }
                    break;

                case 2:
                    int[] A = {10, 20, 30};
                    try {
                        System.out.print("Enter the index number to display the content: ");
                        int index = scanner.nextInt();
                        System.out.println("Element at index " + index + " = " + A[index]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Caught an exception: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println("If you want to continue enter 'y' or 'Y' else enter 'n' or 'N':");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
	

