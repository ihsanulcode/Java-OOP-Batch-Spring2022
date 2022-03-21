abstract class A{
	public abstract void f1();
	public abstract void f2();
	public abstract void f3();
}
abstract class B extends A{

	@Override
	public void f1() {
		System.out.println("A");
		
	}

	@Override
	public void f2() {
		System.out.println("B");
		
	}
	
}
class C extends B{
	@Override
	public void f3() {
		System.out.println("C");
		
	}
}


public class Test {

	public static void main(String[] args) {
		A obj = new C();
		obj.f3();
		obj.f2();
		obj.f1();

	}

}
