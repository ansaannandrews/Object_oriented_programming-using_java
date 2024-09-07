package over;
import java.util.Scanner;
	class Employee {
	double salary,DA,HRA,salary1;
	Employee(double salary,double DA, double HRA)
	{
	   this.salary=salary;
	   this.DA=DA;
	   this.HRA=HRA;
	}
	void display() {
	System.out.println(".....Employee.....");
	}
	void calcSalary() {
	salary1=salary+salary*(DA/100)+salary*(HRA/100);
	System.out.println("Gross salary="+ salary1);
	}
}

class Engineer extends Employee {
	Engineer(double salary,double DA,double HRA) {
		super(salary,DA,HRA);
	}
	void display() {
		super.display();
		super.calcSalary();
	    System.out.println(".....Engineer.....");
	}
	void calcSalary() {
		System.out.println("Salary of Engineer = "+2*salary1);
	}	
}

public class Method_Overriding {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		double salary,DA,HRA;
		System.out.println("Enter the salary of Employee: ");
		salary=sc.nextDouble();
		System.out.println("Enter the DA of Employee: ");
		DA=sc.nextDouble();
		System.out.println("Enter the HRA of Employee: ");
		HRA=sc.nextDouble();
		
		Engineer engineer=new Engineer(salary,DA,HRA);
		engineer.display();
		engineer.calcSalary();
	}
}
