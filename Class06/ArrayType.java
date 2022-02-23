import java.util.Scanner;

public class ArrayType {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int size = input.nextInt();
		
		//declaring an array
		double arr[] = new double[size];
		
		//assigning data to array using loop
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++) {
			arr[i] = input.nextDouble();
		}
		
		//getting array elements using loop
		System.out.println("Array elements:");
		for(int i=0;i<size;i++) {
			System.out.println("index "+i+": "+arr[i]);
		}

	}

}
