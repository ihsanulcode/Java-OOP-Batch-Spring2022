
public class Driver {

	public static void main(String[] args) {
		Student s1 = new Student("A",201,3.5);
		Student s2 = new Student("B",202,3.6);
		Student s3 = new Student("C",203,3.8);
		
		Student[] s = new Student[3];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		
		double sum = 0.0;
		for(int i=0;i<3;i++) {
			sum += s[i].getGPA();
		}
		double avg = sum/(double)s.length;
		System.out.println("Average cgpa: "+avg);
		
		

	}

}
