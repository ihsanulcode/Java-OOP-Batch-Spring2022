
public class Faculty extends Person{
	private String dept;
	private double salary;
	
	Faculty(){
		
	}
	
	Faculty(String name,int age,String dept,double salary){
		super(name,age);
		this.dept = dept;
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int NSUId() {
		return (int)(Math.random()*(20-10+1)+10);
	}

	@Override
	public String toString() {
		return "Faculty [dept=" + dept + ", salary=" + salary + ", NSUId="+this.NSUId()+"]";
	}
	
	

}
