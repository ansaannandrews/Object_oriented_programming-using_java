package oop;
import java.util.*;
public class String_Tokenizer {
	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	int n,sum = 0;
	System.out.println("Enter the integers with 1 space gap: ");
	String s = scanner.nextLine();
	StringTokenizer st = new StringTokenizer(s," ");
	
	while(st.hasMoreTokens()) {
		String y = st.nextToken();
		n = Integer.parseInt(y);
		System.out.println(n);
		sum+=n;
	}
	
	System.out.println("Sum of Integers = +sum);
	scanner.close();
	}
}
