
public class StringHandle {

	public static void main(String[] args) {
		String s1 = "Hello ";
		String s2 = "Java";
		
		System.out.println(s1+s2);
		
		int pen = 10;
		int book = 20;
		int bag = 50;
		int penQ = 2;
		int bookQ = 3;
		int bagQ = 1;
		
		System.out.println("Price of a pen: "+pen+"; Quantity: "+penQ);
		System.out.println("Price of a book: "+book+"; Quantity: "+bookQ);
		System.out.println("Price of a bag: "+bag+"; Quantity: "+bagQ);
		
		String str1 = "CSE115";
		String str2 = "CSE215";
		
		char firstChar = str1.charAt(0);
		System.out.println("First char: "+firstChar);
		
		String NSUID = "01680464635";
		char c1 = NSUID.charAt(0);
		char c2 = NSUID.charAt(1);
		char c3 = NSUID.charAt(2);
		
		System.out.println(c1+""+c2+""+c3);
		
		String co1 = "  CSE332 - CSE Course   ";
		String co2 = "CSE331";
		
		int index = co1.indexOf('S');
		System.out.println(index);
		
		System.out.println(co1.trim());
		System.out.println(co2.length());
		System.out.println(co2.toLowerCase());
		
		
		

	}

}
