package chap7_ACloseLookAtMethodsAndClasses.ObjectsAsParameters;

public class Test {
int a, b;

Test(int i, int j) {
	a = i;
	b = j;
}

//Return true if o is equal to the invoking object
boolean equalTo(Test o) {
	if(o.a == a && o.b == b) return true;
	else return false;
	
}

}
