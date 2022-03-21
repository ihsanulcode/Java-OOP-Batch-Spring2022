
public abstract class Person {
	private String name;
	private int age;
	
	Person(){
		
	}
	
	Person(String name,int age){
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract int NSUId();
	
}
