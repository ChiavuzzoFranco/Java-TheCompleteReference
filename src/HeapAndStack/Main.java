package HeapAndStack;
	

public class Main {
	public static void radar(int vitesseActuel, int vitesseAutoroute) {
		if(vitesseActuel > vitesseAutoroute)
			System.out.println("Vous roulez trop vite!!!");
		else
			System.out.println("Bonne route :)");
	}
	
	public static void main(String[] args) {
		int vitesseAutoroute = 130;
		int vitesseActuel = 130;
		
		radar(vitesseActuel , vitesseAutoroute);
		
		
	}
}
