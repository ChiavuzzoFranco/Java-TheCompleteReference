package chap5_ControlStatements;

public class Exercices {
public static void main(String[] args) {
	String[] mots = {"Bonjour", "à", "tous"};
	String phrase = "";
	for(String mot : mots)
		phrase += (mot + " ");
		System.out.println(phrase);
		
	int[][] tableau = {
			{1, 2 ,3 ,4, 5},
			{6, 7, 8, 9, 10}
	};
	for(int i=0; i< tableau.length; i++) {
		for(int j=0;j< tableau[i].length; j++)
			System.out.print(tableau[i][j]);
		System.out.println();
	}
	
}
}
