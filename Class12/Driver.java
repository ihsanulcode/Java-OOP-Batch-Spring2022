
public class Driver {

	public static void main(String[] args) {
		Faculty f1 = new Faculty("Dr. A","M",40,"201","ECE",100000,"MFU","Professor");
		Faculty f2 = new Faculty("Dr. B","M",40,"201","ECE",100000,"MFU","Professor");
		Faculty f3 = new Faculty("Dr. C","M",40,"201","ECE",100000,"MFU","Professor");
		
		Faculty[] faculty = new Faculty[3];
		faculty[0] = f1;
		faculty[1] = f2;
		faculty[2] = f3;
		
		for (int i = 0; i < faculty.length; i++) {
			System.out.println(faculty[i].toString());
		}
	}

}
