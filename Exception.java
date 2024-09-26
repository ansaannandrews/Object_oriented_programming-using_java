package oop;
import java.util.Scanner;
public class Exception {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose an Operation:");
		int casenumber = scanner.nextInt();
		System.out.println("1. ARITHEMATIC OPERATION");
		System.out.println("2. ARRAY ACCESS");
		String string ;
		
		do {
			
		switch(casenumber) {
		case 1:
			try {
				System.out.print("Enter the numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Enter the denominator: ");
				int denominator = scanner.nextInt();
				int result = numerator/denominator;
				System.out.println();
				System.out.println("Result = "+result);
		   } catch(ArithmeticException e) {
			   System.out.println("Caught an exception = "+e.getMessage());
		     }
		   break;
		   
		case 2:
			int A[] = {10,20,30};
			try {
			   System.out.print("Enter the index number to display the content: ");
			   int index = scanner.nextInt();
			   System.out.println("Element at index"+index+" = "+A[index]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught an exception = "+e.getMessage());
				break;
			}
				default:
					System.out.println("Invalid Choice");
			    break;
		}
		System.out.println("If you want to continue enter YES else enter NO:");
		string = scanner.nextLine();
		}while(string == "YES" || string =="yes");
	}
}