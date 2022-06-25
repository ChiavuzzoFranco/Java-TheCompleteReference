package chap7_ACloseLookAtMethodsAndClasses.ObjectsAsParameters;

public class Box {
	double width;
	double height;
	double depth;
	
	// Notice this constructor. It takes an object of type Box.
	Box( Box ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	// constructor used zhen all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	// constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}
	
	// ccompute and return volume
	double volume() {
		return width * height * depth;
	}
}
