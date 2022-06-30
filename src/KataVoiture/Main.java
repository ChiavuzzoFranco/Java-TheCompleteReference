package KataVoiture;

public class Main {
	public static void main(String[] args) {
		Autoroute autorouteDuSoleil = new Autoroute();
		Voiture voiture = new Voiture();
		
		
		int vitesse = autorouteDuSoleil.getVitesseMax();
		voiture.setVitesse(vitesse);
		voiture.rouler(vitesse);
		
		autorouteDuSoleil.ralentissement();
		voiture.freiner(vitesse);
		
		
	}
}
