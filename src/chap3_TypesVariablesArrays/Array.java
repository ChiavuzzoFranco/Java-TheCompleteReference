package chap3_TypesVariablesArrays;

public class Array {
public static void main(String[] args) {
	
//	int[] month_days;
//	month_days = new int[12];
//	month_days[0] = 31;
//	month_days[1] = 28;
//	month_days[2] = 31;
//	month_days[3] = 30;
//	month_days[4] = 31;
//	month_days[5] = 30;
//	month_days[6] = 31;
//	month_days[7] = 31;
//	month_days[8] = 30;
//	month_days[9] = 31;
//	month_days[10] = 30;
//	month_days[11] = 31;
//	System.out.println("April has " + month_days[3] + " days");
	
	//improved version of the previous program
	int[] month_days = {31 , 28 , 31 , 30, 31 ,30 , 31 , 31 ,30 , 31, 30 ,31};
	System.out.println("April has " + month_days[3] + " days.");
	
	//Pratique
	String[] test = new String[10];
	test[1] = "coucou";
	System.out.println(test[1]);
	
	String phrase ="";
	String[] test2 = {"Salut, ","moi c'est Franco"};
	for(int i =0; i<test2.length; i++)
		phrase +=test2[i];
	System.out.println(phrase);
}
}
