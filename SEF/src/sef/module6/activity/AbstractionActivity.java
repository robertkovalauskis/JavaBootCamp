package sef.module6.activity;

public class AbstractionActivity {
	
	public static void main(String[] args) {
		
		// create objects
		Rectangle rect = new Rectangle("blue", 5.00, 6.00);
		Rectangle square = new Rectangle("yellow", 5.00, 5.00);
		
		// rectangle
		double areaRect = rect.calculateArea();
		double perimeterRect = rect.calculatePerimeter();
		
		// square
		double perimeterSquare = square.calculateArea();
		double areaSquare = square.calculatePerimeter();
	
		
		System.out.println("Area of rectangle is " + areaRect);
		System.out.println("Perimeter of rectangle is " + perimeterRect);
		System.out.println("Color of rectangle is " + rect.getColor());
		System.out.println("--------------------");
		
		System.out.println("Area of rectangle is " + areaSquare);
		System.out.println("Perimeter of rectangle is " + perimeterSquare);
		System.out.println("Color of rectangle is " + square.color);
	}

}
