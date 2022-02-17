
public class Circle {
	//data field
	double radius;
	String color;
	
	//constructors
	Circle(){ //no-argument constructor
		//this.radius = 1;
		//this.color = "No Color";
	}
	
	Circle(double radius,String color){ //argument constructor
		this.radius = radius;
		this.color = color;
		//radius = r;
		//color = c;
	}
	
	//method
	double getArea() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	double getPerimeter() {
		return 2.0*Math.PI*radius;
	}
	
	void print() {
		System.out.println("Radius: "+this.radius);
		System.out.println("Color: "+this.color);
	}

}
