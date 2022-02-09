
public class TernaryOperator {

	public static void main(String[] args) {
		int time = 20;
		String temp = "";
		if(time<18) {
			temp = "Good morning!";
		}else {
			temp = "Good evening!";
		}
		System.out.println(temp);
		
		//Ternary approach
		String ans = (time<18)? "Good day!" : "Good evening!";
		System.out.println(ans);
		
		//problem
		int marks = 91;
		String grade = (marks>=93)? "A" : "Below A";
		System.out.println("Grade status: "+grade);

	}

}
