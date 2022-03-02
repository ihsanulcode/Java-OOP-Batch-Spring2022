
public class Employee extends Person{
	private String id;
	private String department;
	private double salary;
	
	Employee(){
		
	}

	Employee(String id,String department,double salary){
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	
	Employee(String name,String gender,int age,String id,String department,double salary){
		super(name,gender,age);
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
