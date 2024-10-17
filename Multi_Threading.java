package oop;
import java.util.*;
class EvenNum implements Runnable {
	public int a;
	public EvenNum(int a) {
		this.a = a;
	}
	public void run() {
		System.out.println("Thread "+a+" is Even and Square of  "+a+"  is "+a*a);
	}
}

class OddNum implements Runnable {
	public int a;
	public OddNum(int a) {
		this.a = a;
	}
	public void run() {
		System.out.println("Thread "+a+" is Odd and Cube of  "+a+"  is "+a*a);
	}
}

class RandomNumGenerator extends Thread {
	public void run() {
		int n = 0;
		Random random = new Random();
		try {
			for(int i=0;i<10;i++) {
				n = random.nextInt(20);
				System.out.println("Generated number = "+n);
				if(n%2 == 0) {
					Thread thread1 = new Thread(new EvenNum(n));
					thread1.start();
				}
				else {
					Thread thread2 = new Thread(new OddNum(n));
					thread2.start();
				}
				Thread.sleep(1000);
				System.out.println("___________");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
	
		
	
public class Multi_Threading {
	public static void main(String [] args) {
		RandomNumGenerator randomnumgenerator = new RandomNumGenerator();
		randomnumgenerator.start();
	}
}
