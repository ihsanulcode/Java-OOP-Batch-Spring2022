import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//getting user input
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		//display data
		//System.out.println(name);
		
		//getting age from user
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		//display data
		//System.out.println(age);
		
		//display info
		System.out.println("Your Name: "+name);
		System.out.println("Your age: "+age);
		
		input.close();

	}

}
