package chap7_ACloseLookAtMethodsAndClasses;

public class OverloadingMethods {
	void test() {
		System.out.println("No parameters");
	}
//	Overload test for one integer parameter
	void test(int a) {
		System.out.println("a: " + a);
	}
	
//	Overload test for two itneger parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
// Overload test for a dou8ble parameter
	double test(double a) {
		System.out.println("double a: " + a);
		return a*a;
	}
	public static void main(String[] args) {
		OverloadingMethods ob = new OverloadingMethods();
		double result;
		
//		call all version sof test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.250: " + result);
	}
}
