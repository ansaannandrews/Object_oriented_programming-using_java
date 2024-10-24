package oop;
import java.util.Scanner;
class Table {
	void printTable(int n) {
		synchronized(this) {
			for(int i = 1;i<=10;i++) {
				System.out.println(+n+" * "+i+" = "+(n*i));
				try
				{
				      Thread.sleep(400);
				} catch(Exception e) {
				     System.out.println(e);
				}
			}
			 System.out.println();
		}
	}
}

class Mythread1 extends Thread {
     Table t;
     int n;
     Mythread1(Table t) {
        this.t=t;
     }
     public void run() {
         t.printTable(n);
     }
}

class Mythread2 extends Thread {
	Table t;
    int n;
    Mythread2(Table t) {
       this.t=t;
    }
    public void run() {
        t.printTable(n);
    }
}

public class Thread_Synchronization {
	public static void main(String args[]) {
	    Table t = new Table();
	    Scanner scanner = new Scanner(System.in);
	    Mythread1 t1 = new Mythread1(t);
	    Mythread2 t2 = new Mythread2(t);
	    System.out.println("Enter the table you want to run by Thread1: ");
	    t1.n=scanner.nextInt();
	    System.out.println("Enter the table you want to run by Thread2: ");

	t2.n=scanner.nextInt();
	t1.start();
	t2.start();
	scanner.close();
  }
}
