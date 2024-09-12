package oop;
import java.util.Scanner;
	class Area {
		void Area(double radius) {
			double A=3.14*radius*radius;
		    System.out.println("Area of Circle = "+A);
		    System.out.println();
		}
		void Area(int length,int bredth) {
		    int A=length*bredth;
		    System.out.println("Area of Rectangle = "+A);
		System.out.println();
		}
		void Area(double base,double height) {
		    double A=0.5*base*height;
		    System.out.println("Area of Triangle = "+A);
	    }
	}
public class Method_Overloading
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		Area ab=new Area();
		System.out.println("Enter the radius of Circle: ");
		double radius=sc.nextDouble();
		ab.Area(radius);
		System.out.println("Enter the length and bredth of Rectangle: ");
		int length=sc.nextInt();
		int bredth=sc.nextInt();
		ab.Area(length,bredth);
		System.out.println("Enter the base and height of Triangle: ");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		ab.Area(base,height);
    }

}
