
public class MathTestDriver {
	
	public static void main (String[] args) {
		MathSingleton m1 = MathSingleton.getinstance();
		System.out.println("316 + 13 ="+m1.add(316, 13));
		System.out.println("316 - 13 ="+m1.subtract(316, 13));
		System.out.println("316 * 13 ="+m1.multiply(316, 13));
		System.out.println("316 / 13 ="+m1.divide(316, 13));
		//m1 = MathSingleton.getinstance();
		MathSingleton m2 = MathSingleton.getinstance();
		System.out.println(m1.equals(m2));
	}
}
