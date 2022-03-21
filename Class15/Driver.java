
public class Driver {

	public static void main(String[] args) {
		
		Person[] arr = new Person[2];
		Student s = new Student("Ihsanul Haque",22,"ECE",3.88);
		Faculty f = new Faculty("Dr. Rezaul Bari",45,"ECE",500000);
		arr[0] = s;
		arr[1] = f;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

}
