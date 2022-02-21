public class TestCircle{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 5.5;
		Circle c2 = new Circle();
		c2.radius = 6.5;
		
		System.out.println(c1.radius);
		System.out.println(c2.radius);
		System.out.println(Circle.counter);
		
	}
}
