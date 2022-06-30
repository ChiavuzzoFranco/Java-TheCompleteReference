package chap7_ACloseLookAtMethodsAndClasses.Recursion;
//Recursion 2
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
/*
 * La valeur  de fact(10) est la derni�re � �tre retourn� .
 * Cela image parfaitement le principe LIFO(stak)
 * ______________________
 *|        STACK         |
 *|        fact(1)       |  Premier � �tre retourn�
 *|        fact(2)       |
 *|        fact(3)       |
 *|        fact(4)       |
 *|        fact(6)       |
 *|        fact(6)       |
 *|        fact(7)       |
 *|        fact(8)       |
 *|        fact(9)       |
 *|        fact(10)      | Dernier � �tre retourn�
 *|        main()        |
 * */
 