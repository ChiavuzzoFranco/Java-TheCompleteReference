package KataVoiture;

public class Autoroute {
	private int vitesseMax;
	private int longueur;
	
	Autoroute(){
		this.vitesseMax = 130;
		this.longueur = 445;
	}
	
	public void ralentissement() {
		System.out.println("ACCIDENT - RALENTISSEZ");
	}
	
	public int getVitesseMax() {
		return vitesseMax;
	}
}
