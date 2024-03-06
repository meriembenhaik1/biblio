package gestionbiblio;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Library {
	public ArrayList<Livres> livre;
	public ArrayList<User> usr;
	public ArrayList<Copy> copies;


	    // Constructeur pour initialiser les listes
	    public Library() {
	        livre = new ArrayList<>();
	        usr = new ArrayList<>();
	        copies = new ArrayList<>();
	    }

	    public void addlivre() {
	        // Instances de Livres
	        Livres livre1 = new Livres("la terre et le sang", Category.Fiction);
	        Livres livre2 = new Livres("la belle et la bete", Category.Fiction);
	        Livres livre3 = new Livres("les chemins qui montent", Category.History);
	        Livres livre4 = new Livres("times d waman", Category.Comics);
	        Livres livre5 = new Livres("Inserm", Category.Health);

	        // Création des copies pour le Livre 1
	        Copy copie1Livre1 = new Copy();
	        Copy copie2Livre1 = new Copy();
	        Copy copie3Livre1 = new Copy();
	        Copy copie4Livre1 = new Copy();

	        // Création des copies pour le Livre 2
	        Copy copie1Livre2 = new Copy();
	        Copy copie2Livre2 = new Copy();

	        // Création des copies pour le Livre 3
	        Copy copie1Livre3 = new Copy();
	        Copy copie2Livre3 = new Copy();
	        Copy copie3Livre3 = new Copy();

	        // Création des copies pour le Livre 4
	        Copy copie1Livre4 = new Copy();

	        // Création des copies pour le Livre 5
	        Copy copie1Livre5 = new Copy();
	        Copy copie2Livre5 = new Copy();
	        Copy copie3Livre5 = new Copy();

	        // Ajout des copies à la liste
	        copies.add(copie1Livre1);
	        copies.add(copie2Livre1);
	        copies.add(copie3Livre1);
	        copies.add(copie4Livre1);
	        copies.add(copie1Livre2);
	        copies.add(copie2Livre2);
	        copies.add(copie1Livre3);
	        copies.add(copie2Livre3);
	        copies.add(copie3Livre3);
	        copies.add(copie1Livre4);
	        copies.add(copie1Livre5);
	        copies.add(copie2Livre5);
	        copies.add(copie3Livre5);

	        // Ajout des copies aux livres
	        livre1.copies.add(copie1Livre1);
	        livre1.copies.add(copie2Livre1);
	        livre1.copies.add(copie3Livre1);
	        livre1.copies.add(copie4Livre1);

	        livre2.copies.add(copie1Livre2);
	        livre2.copies.add(copie2Livre2);

	        livre3.copies.add(copie1Livre3);
	        livre3.copies.add(copie2Livre3);
	        livre3.copies.add(copie3Livre3);

	        livre4.copies.add(copie1Livre4);

	        livre5.copies.add(copie1Livre5);
	        livre5.copies.add(copie2Livre5);
	        livre5.copies.add(copie3Livre5);

	        // Ajout des livres à la liste
	        livre.add(livre1);
	        livre.add(livre2);
	        livre.add(livre3);
	        livre.add(livre4);
	        livre.add(livre5);

	       // Affichage des informations sur les livres et les copies
	        /*for (Livres livre : livre) {
	            afficherInformationsLivreEtCopies(livre);
	        }*/
	    }

	    // Méthode pour afficher les informations sur le livre et ses copies
	    static void afficherInformationsLivreEtCopies(Livres livre) {
	    	
	        System.out.println("Informations sur le Livre :");
	        System.out.println("Titre : " + livre.title);
	        System.out.println("Catégorie : " + livre.category);
	        System.out.println("Nombre de copies : " + livre.copies.size());

	        for (Copy copie : livre.copies) {
	            System.out.println("   ID de la copie : " + copie.getId());
	        }

	        System.out.println("-----------------------------");
	    }
	    
	    
}
