import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		//Random class
		Random rand = new Random();
		int player;
		
		do {
			System.out.print("\t\tscissor(0), Rock (1), Paper (2): ");
			int computer = rand.nextInt(3)+0; //computer choice
			player = input.nextInt(); //player choice
			
			//logic
			if(computer==0) {
				switch(player) {
				case 0:
					System.out.println("\t\t~~ Computer is scissor. You are scissor too. It's a draw!");
					break;
				case 1:
					System.out.println("\t\t~~ Computer is scissor. You are Rock too. You won!");
					break;
				case 2:
					System.out.println("\t\t~~ Computer is scissor. You are Paper too. Computer win!");
					break;
				default:
					System.out.println("\t\t~~ Wrong play!");
					break;
				}
			}else if(computer==1) {
				switch(player) {
				case 0:
					System.out.println("\t\t~~ Computer is Rock. You are scissor too. Computer win!");
					break;
				case 1:
					System.out.println("\t\t~~ Computer is Rock. You are Rock too. It's a draw!");
					break;
				case 2:
					System.out.println("\t\t~~ Computer is Rock. You are Paper too. You win!");
					break;
				default:
					System.out.println("\t\t~~ Wrong play!");
					break;
				}
			}else if(computer==2) {
				switch(player) {
				case 0:
					System.out.println("\t\t~~ Computer is Paper. You are scissor too. Player win!");
					break;
				case 1:
					System.out.println("\t\t~~ Computer is Paper. You are Rock too. Computer win!");
					break;
				case 2:
					System.out.println("\t\t~~ Computer is Paper. You are Paper too. It's a draw!");
					break;
				default:
					System.out.println("\t\t~~ Wrong play!");
					break;
				}
			}
		}while(player==0 || player==1 || player==2);

	}

}
