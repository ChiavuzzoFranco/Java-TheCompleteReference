package chap5_ControlStatements;

public class BreakStatements {
	public static void main(String[] args) {
//		//Using break to exit a loop.
//		for(int i =0;i<100;i++) {
//			if(i == 10) break; // terminate loop if i is 10
//			System.out.println("i: " + i);
//			}
//		System.out.println("Loop complete");
		
//		//_________________________________
//		//Using break to exit a while loop.
//		int i = 0;
//		
//		while(i < 100) {
//			if(i == 10) break;// terminate loop if i is 10
//			System.out.println("i: " + i);
//			i++;
//		}
//		System.out.println("Loop complete.");
		//____________________________________
		//Using bread with nested loops.
//		for(int i=0;i<3;i++) {
//			System.out.print("Pass " + i + ": ");
//			for(int j=0; j<100; j++) {
//				if(j==10) break; // terminate loop if j is 10
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("Loop complete");
		//____________________________________
//		//Using break as a civilized form of goto.
//		boolean t = true;
//		
//		first: {
//			second : {
//				third: {
//					System.out.println("Before the break.");
//					if(t) break second; // break out of second block
//					System.out.println("This won't execute");
//				}
//				System.out.println("You are in second block");
//			}
//			System.out.println("This is after second block");
//		}
		//_____________________________________
		//using break to exit from nested loops
		outer: for(int i=0; i<3; i++) {
			System.out.println("Pass " + i + ":");
			for(int j=0; j<100; j++) {
				if(j == 10) break outer; // exit both loops
				System.out.println(j + " ");
			}
			System.out.println("This will not print");
		}
		System.out.println("Loops copmplete.");
	}
	
}
