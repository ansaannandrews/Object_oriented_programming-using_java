package oop;
import java.util.Scanner;
class Employee{
	String name;
	int age;
	long phoneNumber;
	String address;
	float salary;
	Employee(String name,int age,long phoneNumber,String address,float salary){
	    this.name=name;
	    this.age=age;
	    this.phoneNumber=phoneNumber;
	    this.address=address;
	    this.salary=salary;
	}
	void printEmployee() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Phone number = "+phoneNumber);
		System.out.println("Address = "+address);
	}
	void printSalary() {
		System.out.println("Salary = "+salary);
	}
}
class Officer extends Employee {
	String specialization;
	Officer(String name,int age, long phoneNumber, String address, float salary,String specialization){
	super(name,age,phoneNumber,address,salary);
		this.specialization = specialization;
	}
	void printSpecialization() {
		System.out.println("Specialization = "+specialization);
	}
}
class Manager extends Employee {
	String department;
	Manager(String name,int age, long phoneNumber, String address, float salary,String department){
		super(name,age,phoneNumber,address,salary);
		this.department=department;
		}
	void printDepartment() {
		System.out.println("Department = "+department);
	}
}
public class Inheritance {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String name,name1;
		int age,age1;
		long phoneNumber,phoneNumber1;
		String address,address1;
		float salary,salary1;
		String specialization;
		String department;
		System.out.println("Enter the details of Officer:");
		System.out.println("Enter your Name: ");
		name=sc.next();
		System.out.println("Enter your Age: ");
		age=sc.nextInt();
		System.out.println("Enter your Phone number: ");
		phoneNumber=sc.nextLong();
		System.out.println("Enter your Address: ");
		address=sc.next();
		System.out.println("Enter your Salary: ");
		salary=sc.nextFloat();
		System.out.println("Enter your Specialization: ");
		specialization=sc.next();
		System.out.println();
		System.out.println("Enter the details of Manager: ");
		System.out.println("Enter your Name: ");
		name1=sc.next();
		System.out.println("Enter your Age: ");
		age1=sc.nextInt();
		System.out.println("Enter your Phone number: ");
		phoneNumber1=sc.nextLong();
		System.out.println("Enter your Address: ");
		address1=sc.next();
		System.out.println("Enter your Salary: ");
		salary1=sc.nextFloat();
		System.out.println("Enter your Department: ");
		department=sc.next();
		System.out.println();
		System.out.println();
		
		Officer officer=new Officer(name,age,phoneNumber,address,salary,specialization);
		System.out.println("DETAILS OF OFFICER =");
		officer.printEmployee();
		officer.printSpecialization();
		
		Manager manager=new Manager(name,age,phoneNumber,address,salary,department);
		System.out.println();
		System.out.println("DETAILS OF MANAGER =");
		manager.printEmployee();
		manager.printDepartment();
	}
}
