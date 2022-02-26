class A{
	int tka = 2;
	public void total() { //main property
		System.out.println(tka);
	}
	
}

class B extends A{
	int tkb = 2;
	
	@Override
	public void total() {
		System.out.println(tka+tkb);
	}
}

class C extends B{ //parent B child C //super class  - sub class
	int tkc = 2;
	
	@Override //annotation
	public void total() {
		System.out.println(tka+tkb+tkc);
	}
	
}
public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.total();
		B b = new B();
		b.total();
		C c = new C();
		c.total();		

	}

}
