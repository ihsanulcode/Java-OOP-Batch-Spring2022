
public class conditionalStatements {

	public static void main(String[] args) {
		//if..else
		
		double entryTime = 9.5;
		double exitTime = 11.5;
		
		if(entryTime>=10.0 || exitTime<=11.0) {
			//code block
			System.out.println("You will get full class!");
		}else {
			System.out.println("You will not get full class!");
		}
		//rest of the code will be executed 
		
		int time = 22;
		if(time < 10) {
			System.out.println("Good morning!");
		}else if(time < 20) {
			System.out.println("Good noon!");
		}else if(time < 30) {
			System.out.println("Good 22!");
		}else if(time < 40) {
			System.out.println("Good dfd!");
		}else if(time < 50) {
			System.out.println("Good ghgh!");
		}
		else {
			System.out.println("Good evening!");
		}
		
		

	}

}
