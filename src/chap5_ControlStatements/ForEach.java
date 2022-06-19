package chap5_ControlStatements;

public class ForEach {
	public static void main(String[] args) {
//		//use a for each style for loop
//		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int sum = 0;
//		
//		// use for each style for to display and sum the values
//		for(int x : nums) {
//			System.out.println("Value is: "+ x);
//			sum += x;
//		}
//		System.out.println("Summation: " + sum);
		//____________________________________________________________
//		//Foreach 2
//		int sum = 0;
//		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		//use for to display and sum the values
//		for(int x : nums) {
//			System.out.println("Value is: " + x);
//			sum += x;
//			if(x == 5) break; // stop the loop when 5 is obtained
//		}
//		System.out.println("Summation of first 5 elements: " + sum);
		//____________________________________________________________
		//Foreach 3
		//use for each style for on a two dimensional array
//		int sum = 0;
//		int [][] nums = new int[3][5];
//		
//		//give nums some values
//		for(int i = 0; i < 3; i++)
//			for(int j = 0; j < 5; j++) {
//				nums[i][j]= (i+1) * (j+1);
//				
//			}
//		
//		
//		//use for each for to display and sum the values
//		for(int[] x : nums) {
//			for(int y : x) {
//				System.out.println("Value is : " + y);
//				sum += y;
//			}
//		}
//		System.out.println("Summation : " + sum);
		//____________________________________________________________
		//Foreach 4
		//Search an array unsig for each style for
		int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
		int val = 5;
		boolean found = false;
		
		//use for each style for to search nums for val
		for(int x : nums) {
			if(x == val) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println("Value found");
		
	}

}
