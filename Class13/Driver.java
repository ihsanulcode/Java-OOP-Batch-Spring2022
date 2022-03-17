
public class Driver {
	public static Plant[] plants = new Plant[5];
	public static int plantCount = -1;
	
	public static void main(String[] args) {
		add(new Plant("Almont","Brown"));
		add(new Herb("Tulsi","Green",true,"All"));
		add(new Flower("Rose","Red",true,true));
		display();
		
		remove("Tulsi");
		System.out.println("After deleting:");
		display();
		
		System.out.println("Search result:");
		Plant temp = search("Rose");
		System.out.println(temp.toString());

	}
	
	public static void add(Plant p) {
		plantCount++;
		plants[plantCount] = p;
	}
	
	public static void remove(String name) {
		int index = -1;
		for (int i = 0; i <= plantCount; i++) {
			if(plants[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		
		for (int i = index; i < plantCount; i++) {
			plants[i] = plants[i+1];
		}
		plantCount--;
	}
	
	public static Plant search(String name) {
		int index = -1;
		for (int i = 0; i <= plantCount; i++) {
			if(plants[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		
		if(index == -1)
			return new Plant();
		
		return plants[index];
	}
	
	public static void display() {
		for (int i = 0; i <= plantCount; i++) {
			System.out.println(plants[i].toString());
		}
	}

}
