import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		//random class
		Random random = new Random();
		
		//getting range from user
		System.out.print("Enter lower number: ");
		int num1 = input.nextInt();
		System.out.print("Enter upper number: ");
		int num2 = input.nextInt();
		
		//generating random number using random class
		int randomNumber = random.nextInt(num2-num1+1)+num1; //(num2-num1+1)+num1
		//display
		System.out.println(randomNumber);

	}

}
