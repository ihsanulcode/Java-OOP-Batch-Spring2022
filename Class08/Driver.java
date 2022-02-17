
public class Driver {

	public static void main(String[] args) {
		//creating objects of circle class
		//className objectName = new className();
		
		Circle c1 = new Circle(5.5,"RED");
		c1.print();
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		Circle c2 = new Circle(3,"XYZ");
		c2.print();
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		
		Circle c3 = new Circle(15.5,"WHITE");
		c3.print();
		System.out.println(c3.getArea());
		System.out.println(c3.getPerimeter());
		

	}

}
