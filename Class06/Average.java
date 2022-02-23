import java.util.Scanner;

//Calculate average marks of the quiz exam
public class Average {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//getting number of student from user input
		System.out.println("Enter the number of student: ");
		int n = input.nextInt();
		
		//declaring an array to store the marks of the quiz
		double arr[] = new double[n];
		
		//getting marks from user and summing up
		double sum = 0.0;
		for(int i=0;i<n;i++) {
			System.out.print("Student "+(i+1)+": ");
			arr[i] = input.nextDouble();
			sum += arr[i]; //summing up
		}
		
		//display marks
		for(int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+": "+arr[i]);
		}
		
		double average = sum/(double)n;
		System.out.println("Average marks: "+average);

	}

}
