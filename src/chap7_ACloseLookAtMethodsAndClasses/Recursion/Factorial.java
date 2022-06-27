package chap7_ACloseLookAtMethodsAndClasses.Recursion;

public class Factorial {
	//this is a recursive method;
	int fact(int n) {
		int result;
		
		if(n==1) return 1;
		result = fact(n-1) * n;
		System.out.println(result + " " + n);
		return result;
	}
}
