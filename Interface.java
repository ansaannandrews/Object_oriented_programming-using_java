package oop;
import java.util.Scanner;
interface Human {
	final int jobId=101;
	void learn(String str);
	void work();
}

interface Recruitment {
	void screening(int score);
}

class Programmer implements Human,Recruitment {
	    public void learn(String str) {
		     System.out.println("\n.....About your Placement.....");
		     System.out.println("My training area = "+str);
	}
	    public void work() {
		     System.out.println("Selected to the Role Development");
	}
	    public void screening(int score) {
			System.out.println("Test Score = "+score);
		}
}

public class Interface {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Programmer programmer = new Programmer();
		System.out.println("Ener your training area: " );
		String str = sc.next();
		System.out.println("Enter your Test Score: ");
		int score = sc.nextInt();

		programmer.learn(str);
		programmer.screening(score);
		programmer.work();
		System.out.println("My Job's ID = "+programmer.jobId);
	}
}