package chap7_ACloseLookAtMethodsAndClasses.ObjectsAsParameters;

public class OverloadCons2 {
	public static void main(String[] args) {
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		
		Box myclone = new Box(mybox1); //create copy of mybox1
		
		double vol;
		
		//get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		//get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		//get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		
		//get volume of clone
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		}
}
