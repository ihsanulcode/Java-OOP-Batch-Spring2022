
public class RandomChar {

	public static void main(String[] args) {
		//Generating random data without using Random Class
		//using Math class
		
		char ch = (char)(Math.random()*('c'-'a'+1)+'a'); 
		System.out.println(ch);
		
		//generating random string
		//write a program that will generate 4 size random code for user varify
		String code = "";
		for(int i=1;i<=4;i++) {
			code += (char)(Math.random()*('z'-'a'+1)+'a');
		}
		System.out.println(code);

	}

}
