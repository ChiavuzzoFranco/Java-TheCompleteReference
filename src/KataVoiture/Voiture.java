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
				System.out.println("Je roule à " +(int)(vitesse * 0.90) + "km/h, après freinage d'urgence");
				System.out.println("________________________________________________________");
				
			}
			else freiner((int) (vitesse * 0.95));
			nbrVoiture++;
			
			System.out.println("Voiture Numéro : " + nbrVoiture);
			System.out.println("Je roule à " +(int)(vitesse * 0.95) + "km/h, après freinage d'urgence");
			System.out.println("________________________________________________________");
	
	}
	
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public int getVitesse() {
		return vitesse;
	}

}

Voiture 1 roule a 117
Voiture 2 freine
Voiture 2 roule a 111
Voiture 3 freine
Voiture 3 roule a 105
Voiture 4 freine
Voiture 4 roule a 99
Voiture 5 freine
Voiture 5 roule a 94
Voiture 6 freine
Voiture 6 roule a 89
Voiture 7 freine
Voiture 7 roule a 84
Voiture 8 freine
Voiture 8 roule a 79
Voiture 9 freine
Voiture 9 roule a 75
Voiture 10 freine
Voiture 10 roule a 71
Voiture 11 freine
Voiture 11 roule a 67
Voiture 12 freine
Voiture 12 roule a 63
Voiture 13 freine
Voiture 13 roule a 59
Voiture 14 freine
Voiture 14 roule a 56
Voiture 15 freine
Voiture 15 roule a 53
Voiture 16 freine
Voiture 16 roule a 50
Voiture 17 freine
Voiture 17 roule a 47
Voiture 18 freine
Voiture 18 roule a 44
Voiture 19 freine
Voiture 19 roule a 41
Voiture 20 freine
Voiture 20 roule a 38
Voiture 21 freine
Voiture 21 roule a 36
Voiture 22 freine
Voiture 22 roule a 34
Voiture 23 freine
Voiture 23 roule a 32
Voiture 24 freine
Voiture 24 roule a 30
Voiture 25 freine
Voiture 25 roule a 28
Voiture 26 freine
Voiture 26 roule a 26
Voiture 27 freine
Voiture 27 roule a 24
Voiture 28 freine
Voiture 28 roule a 22
Voiture 29 freine
Voiture 29 roule a 20
Voiture 30 freine
Voiture 30 roule a 19
Voiture 31 freine
Voiture 31 roule a 18
Voiture 32 freine
Voiture 32 roule a 17
Voiture 33 freine
Voiture 33 roule a 16
Voiture 34 freine
Voiture 34 roule a 15
Voiture 35 freine
Voiture 35 roule a 14
Voiture 36 freine
Voiture 36 roule a 13
Voiture 37 freine
Voiture 37 roule a 12
Voiture 38 freine
Voiture 38 roule a 11
Voiture 39 freine
Voiture 39 roule a 10
Voiture 40 freine
Voiture 40 roule a 9
Voiture 41 freine
Voiture 41 roule a 8
Voiture 42 freine
Voiture 42 roule a 7
Voiture 43 freine
Voiture 43 roule a 6
Voiture 44 freine
Voiture 44 arretee