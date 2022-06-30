package HeapAndStack;

public class Codewars {

	public static void main(String[] args) {
		int vitesse = 130;
		int nbrVoiture = 0;
		while(vitesse != 0) {
			if(nbrVoiture == 0) {
				vitesse *= 0.90;
				nbrVoiture++;
			}
			vitesse *= 0.95;
			nbrVoiture++;
		}
		System.out.printf("il faut %s voitures avant d'être à l'arret.", nbrVoiture);
	}

}
