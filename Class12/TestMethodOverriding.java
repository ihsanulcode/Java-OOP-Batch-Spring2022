class A{
	protected void test() {
		System.out.println("A");
	}
}

class B extends A{
	@Override
	public void test() {
		System.out.println("B");
	}
}
public class TestMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Theory: You can enlarge the privacy in child class while overriding
//private > protected > default > public