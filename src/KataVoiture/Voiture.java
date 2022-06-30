package KataVoiture;

public class Voiture {
	private int vitesse;
	private String modele;
	private int nbrVoiture = 0;
	
	Voiture() {
		this.modele = "Peugeot 308";
	}
	
	public void rouler(int vitesse) {
		setVitesse(vitesse);
		System.out.printf("Je roule à %d%n",vitesse);
	}
	
	public void freiner(int vitesse) {
			if(vitesse== 0)  return;
			if(vitesse == 130) {
				 freiner((int) (vitesse * 0.90));
				nbrVoiture++;
			
				System.out.println("Voiture Numéro : " + nbrVoiture);
				System.out.println("Je roule à " +(vitesse * 0.95) + "km/h, après freinage d'urgence");
				System.out.println("________________________________________________________");
				
			}
			else freiner((int) (vitesse * 0.95));
			nbrVoiture++;
			
			System.out.println("Voiture Numéro : " + nbrVoiture);
			System.out.println("Je roule à " +(vitesse * 0.95) + "km/h, après freinage d'urgence");
			System.out.println("________________________________________________________");
	
	}
	
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public int getVitesse() {
		return vitesse;
	}

}
