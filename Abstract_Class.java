package oop;
import java.util.Scanner;
abstract class Shape {
abstract void numberOfSides();
}

class Rectangle extends Shape {
    int side;
    Rectangle(int side) {
    this.side=side;
    }
    void numberOfSides() {
    	System.out.println("Number of Sides of Rectangle = "+side);
    } 
}

class Triangle extends Shape {
    int side;
    Triangle(int side) {
    this.side=side;
    }
    void numberOfSides() {
    	System.out.println("Number of Sides of Triangle = "+side);
    } 
}

class Hexagon extends Shape {
    int side;
    Hexagon(int side) {
    this.side=side;
    }
    void numberOfSides() {
    	System.out.println("Number of Sides of Hexagon = "+side);
    } 
}

public class Abstract_Class {
	public static void main(String [] args) {
		Rectangle rectangle=new Rectangle(4);
		rectangle.numberOfSides();
		
		Triangle triangle=new Triangle(3);
		triangle.numberOfSides();
		
		Hexagon hexagon=new Hexagon(6);
		hexagon.numberOfSides();
	}
}
