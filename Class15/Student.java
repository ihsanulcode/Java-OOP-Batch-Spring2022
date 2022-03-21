
public class Student extends Person{
	private String dept;
	private double cgpa;
	
	Student(){
		
	}
	
	Student(String name,int age,String dept,double cgpa){
		super(name,age);
		this.cgpa = cgpa;
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public int NSUId() {
		return (int)(Math.random()*(10-1+1)+1);
	}

	@Override
	public String toString() {
		return "Student [dept=" + dept + ", cgpa=" + cgpa + ", NSUId="+this.NSUId()+"]";
	}

	
	
}
