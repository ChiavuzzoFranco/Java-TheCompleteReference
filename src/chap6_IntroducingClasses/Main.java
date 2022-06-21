package chap6_IntroducingClasses;

public class Main {
	public static void main(String[] args) {
		Box mybox1 = new Box(3,4,5);
		Box mybox2 = new Box(10,11,12);
		double vol;
		
//		//asign values to mybox1's instance variables
//		mybox1.width = 10;
//		mybox1.height = 20;
//		mybox1.depth = 15;
//		
//		// assign differents values to mybox2's instance variables
//		mybox2.width = 3;
//		mybox2.height = 6;
//		mybox2.depth = 9;
		
//		//initialize each box
//		mybox1.setDim(10, 20, 15);
//		mybox2.setDim(3, 6, 9);
		
//		//compute volume of first box
//		vol = mybox1.width * mybox1.height * mybox1.depth;
//		System.out.println("volume is " + vol);
//		
//		//compute volume of second box
//		vol = mybox2.width * mybox2.height * mybox2.depth;
//		System.out.println("volume is " + vol);
		
		
//		//display volume
//		mybox1.volume();
//		mybox2.volume();
		
		//get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is: " + vol);
		
		//get volume of second box
		System.out.println("Volume is: " + mybox2.volume());
	}
}
