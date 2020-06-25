package sef.module6.activity;

public class Rectangle extends Shape{

	static double lenght;
	static double breadth;
	static double area;
	
	// default constructor
		public void rectangle()
		{
			this.lenght = 10.10;
			this.breadth = 15.15;
		}
		
	// parameterized constructor
	public Rectangle(double lenght, double breadth) {
		
		this.lenght = lenght;
		this.breadth = breadth;
	}

	public double calculateArea() {
	
		return area = lenght * breadth;
	}

	
	public double calculatePerimeter() {
		
		return 2*(lenght * breadth);
	}
		
	
}