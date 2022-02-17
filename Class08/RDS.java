
public class RDS {
	//data field
	int id;
	String name;
	double cgpa;
	
	//no-argument constructor
	RDS(){
		this.id = 0;
		this.name = null;
		this.cgpa = 0.0;
	}

	//argument constructor
	RDS(int id,String name,double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	//methods
	void showStudentInfo(int id) {
		if(this.id == id) {
			System.out.println("ID: "+this.id);
			System.out.println("Name: "+this.name);
			System.out.println("Cgpa: "+this.cgpa);
		}else {
			System.out.println("Student not found!");
		}
	}
}
