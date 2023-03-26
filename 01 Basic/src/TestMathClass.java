
public class TestMathClass {
	public static void main(String[] args) {
		
		MathClass mathClass = new MathClass();
		System.out.println("Addition : " + mathClass.add(12.4, 56.7));
		mathClass.add(45, 78);
		System.out.println("Addition : " + mathClass.add(12, 90, 34));
		
	}
}
