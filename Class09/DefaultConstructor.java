
public class DefaultConstructor {
	DefaultConstructor(){
		
	}
	
	DefaultConstructor(int a,int b){
		System.out.println(a+","+b);
	}
	
	DefaultConstructor(int a,int b,int c){
		System.out.println(a+","+b+","+c);
	}
}


class TestConstructor{
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
	}
}