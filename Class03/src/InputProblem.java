import java.util.Scanner;

public class InputProblem {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = input.nextLine();
		System.out.println("Enter semester: ");
		int sem = input.nextInt();
		input.nextLine();
		System.out.println("Enter cgpa: ");
		double cgpa = input.nextDouble();
		input.nextLine();
		System.out.println("Enter dept: ");
		String dept = input.nextLine();
		
		
		System.out.println("Name: "+name);
		System.out.println("Semester: "+sem);
		System.out.println("CGPA: "+cgpa);
		System.out.println("Dept: "+dept);

	}

}
