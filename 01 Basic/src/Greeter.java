
public class Greeter {
	
	static {
		System.out.println("Inside static block 1.");
	}
	
	public void greet(String name) {
		System.out.println("Good morning : " + name);
	}
	
	static {
		System.out.println("Inside static block 2.");
	}
	
	static {
		System.out.println("Inside static block 3.");
	}
}
