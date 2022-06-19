package chap5_ControlStatements;

public class ReturnStatement {
	public static void main(String[] args) {
		//Demonstrate return
		boolean t =true;
		
		System.out.println("Before the return.");
		
		if(t) return; // return to caller
		
		System.out.println("This won't execute.");
	}
}
