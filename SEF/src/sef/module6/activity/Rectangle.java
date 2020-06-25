package sef.module6.activity;

public class Rectangle extends Shape{

	double lenght;
	double breadth;
				
	// Complete the code and Add abstract method calculateArea() 
	// and calculatePerimeter() with return type as double
			
	// default constructor
		public Rectangle()
		{
			this.color = "blue";
			this.lenght = 5.00;
			this.breadth = 6.00;
		}
		
	// parameterized constructor
	public Rectangle(String color, double lenght, double breadth) {
		
		this.color = color;
		this.lenght = lenght;
		this.breadth = breadth;
	}

	// setter
	public void setParameters(double x, double y)
	{
		this.lenght = x;
		this.breadth = y;
	}
	
	// getters
	public double getLenght()
	{
		return lenght;
	}
	
	public double getBreadth()
	{
		return breadth;
	}
	
	
	// implementing methods from Shape.class
	public double calculateArea() 
	{
		return lenght * breadth;
	}

	public double calculatePerimeter() 
	{
			return 2*(lenght + breadth);
	}
	
	// color getter/setter
	public void setColor(String c) {
		color = c; 
	}
	public String getColor() {
		return color;
	}
	
}