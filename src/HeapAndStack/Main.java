package HeapAndStack;
	
public class Main {

    public static void radarAutoroute(int vitesse) {
        if(vitesse > 130) // vitesse est une variable local à la methode radarAutouroute
            System.out.println("Vous roulez trop vite");
        else
            System.out.println("Bonne route");
    }
    
    
    public static void main(String[] args) {
//      1. Un premiere couche  est cree sur la pile ( stack ) pour notre methode main
//      2. Un espace est aloué dans cette première couche afin de stocker la variable vitesseAutoroute ainsi que sa valeur
      int vitesseAutoroute =130; // variable local à la methode main
//      3. Un espace est aloué dans cette première couche  afin de stocker la variable vitesseAutoroute ainsi que sa valeur
      int vitesseActuel = 110;
//    
//      4. Ici nous rencontrons une nouvelles methode, ce qui à pour effet de creer une nouvelle couche au dessus de la methode main()
//       Dans cette nouvelle couche, sera aloue un espace afin de stocker la variable vitesse (variable local de la méthode radarAutouroute)
        radarAutoroute(vitesseAutoroute);

//      6. Une fois la methode executée, l'espace lui etant aloué dans la stack sera libere, 
//        ainsi execution de la couche main() reprendra.
        
        
//      7.Ici nous venons de creer une nouvelle instance de la classe Voiture.
        Voiture peugeot308 = new Voiture(130, " Ancienne 308");
//      notre variable ne stock pas la valeur de notre objet mais sa reference, cad son adresse dans la memoire Heap( le tas),
//      ce qu on appelle une 'variable de reference'
//      Un espace est cree dans la pile main() afin de stocker la variable peugeot308 et sa reference.
//      La valeur de l'objet est stockée dans un espace aloué à notre nouvelle instance, situé dans le heap.

        
//      8. Cet exemple permet d illustrer les explications ci dessus.
        System.out.println(peugeot308); // return la reference de l'objet peugeot308
        
//      Ci dessous, nous créons une nouvelle variable de type Voiture et nous lui donnons comme valeur, la valeur de notre variable peugeot308,
//      c'est a dire l adresse menant a la valeur de l objet peugeot308.
        Voiture nouvellePeugeot308 = peugeot308;
//      Pour le verifier, affichons la valeur de notre nouvellePeugeot308
        System.out.println(nouvellePeugeot308);
//       Et oui, nos deux variables de type Voiture pointent vers le meme espace memoire et donc le meme objet.
        System.out.println(peugeot308.modele + " " + nouvellePeugeot308.modele);
        nouvellePeugeot308.modele = "Nouvelle peugeot 308";
        System.out.println(peugeot308.modele + " " + nouvellePeugeot308.modele);

//      Les deux variables pointant vers le meme objet, ils nous affichent donc le meme modèle.
//      9. Si nous souhaitons créer un objet de type Voiture representqnt l'ancienne peugeot 308,
//      nous devons aobligatoirement creer une deuxieme instance du type Voiture en utilsant le New Voiture()
//      
//      Pour pouvior reutiliser la variable peugeot308, nous devons supprimer sa reference actuel
        peugeot308 = null;
        System.out.println(peugeot308); // return  null
//       Verifions que la variable ne pointe plus vers notre nouvelle308.
//       System.out.println(peugeot308.modele); // error

//      Maintenant nous pouvons creer une instance pour notre premiere peugeot 308
        peugeot308 = new Voiture(130, "Premier modele de 308");
        System.out.println(peugeot308 + " " + nouvellePeugeot308);
        
// 		Nous avons maintenant nos deux modèles de 308, l'ancien modèle étant obsolète, supprimons le.
        peugeot308 = null;
        
//      Maintenant que plus aucune variable ne pointe vers notre instance peugeot308 , l'objet sera supprimé automatiquement par le Ramasse-miette.
        
    }
}