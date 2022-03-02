
public class Faculty extends Employee {
	private String initial;
	private String rank;

	Faculty() {

	}

	Faculty(String initial, String rank) {
		this.initial = initial;
		this.rank = rank;
	}

	Faculty(String name, String gender, int age, String id, String department, double salary, String initial,
			String rank) {
		super(name, gender, age, id, department, salary);
		this.initial = initial;
		this.rank = rank;
	}

	public String getInitial() {
		return initial;
	}

	public String getRank() {
		return rank;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nGender: " + this.getGender() + "\nAge: " + this.getAge() + "\nId: "
				+ this.getId() + "\n" + "Department: " + this.getDepartment() + "\nSalary: " + this.getSalary()
				+ "\nInitial: " + this.getInitial() + "\nRank: " + this.getRank() + "\n";
	}

}
