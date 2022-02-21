
public class Circle {
	//data field
	double radius = 0;
	static int counter = 0;
	
	//no-argument cons
	Circle(){
		counter++;
		
	}
	
	//argument cons
	Circle(double radius){
		this.radius = radius;
		counter++;
	}
	
	//methods
	double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

}

/*Write a Student class in java that has three data fields, name,id,cgpa. Create multiple objects of 
Student and print all of the students info and also print the number of student object you have created.
Draw the UML diagram of the Student class and upload two java file along with the UML file.*/
