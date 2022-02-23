
public class Student {
	//data field
	private String name;
	private int id;
	private double cgpa;
	
	Student(){ //no-argument constructor
		this.cgpa = 0.0;
	}
	
	Student(String name,int id,double cgpa){ //argument constructor
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}
	
	//methods
	public void info(int id) {
		if(this.id == id) {
			System.out.println("Name: "+name);
			System.out.println("Id: "+id);
			System.out.println("Cgpa: "+cgpa);
		}else {
			System.out.println("Not Found!");
		}
	}

	//getters/setters
	//accessor/mutator
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.id;
	}
	
	public double getGPA() {
		return this.cgpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setCGPA(double cgpa) {
		this.cgpa = cgpa;
	}
}
