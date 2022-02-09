
public class TypeCasting {

	public static void main(String[] args) {
		
		int n = 10;
		double d = 3.5;
		
		//widening casting
		double cd = n;
		System.out.println(cd);
		
		//Narrowing casting
		double test = 9.5;
		int castTest = (int)test;
		System.out.println(castTest);
		
		//double > float
		float f = (float)test;
		System.out.println(f);
		

	}

}
