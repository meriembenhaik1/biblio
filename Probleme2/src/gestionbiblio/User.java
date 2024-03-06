package gestionbiblio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class User {

    static int count = 0;
    public int id;
    public String firstname, lastname;
    public Date birthdate;
    Library obj=new Library();
    Category cat;
    Livres obj1;
    Copy obj2;
    Agent obj3;

    public User() {
        this.id = count;
        count++;
    }

    public User(String firstname, String lastname) {
       // this(); // Ensure common initialization is applied
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public void remplissage() {
        if (obj2 != null && obj2.copies != null) {
            for (int i = 0; i < 5 && i < obj2.copies.size(); i++) {
                obj2.copies.get(i).nb = 1;
            }
        }
    }
    


User obj4;   
public int Nombredelivresdispo(String bookTitle, ArrayList<Livres> listeLivres, ArrayList<Copy> listeCopies) {
    for (Livres livre : listeLivres) {
        if (bookTitle.equals(livre.title)) {
            int nombreCopiesDispo = 0;

            for (Copy copie : livre.copies) {
                int indexCopie = listeCopies.indexOf(copie);

                if (indexCopie != -1 && !listeCopies.get(indexCopie).isEmprunte()) {
                    nombreCopiesDispo++;
                }
            }

            return nombreCopiesDispo;
        }
    }

    return 0; // Retourne 0 si le livre n'est pas trouvé dans la liste
}
public void printBooksByCategory(ArrayList<Livres> listeLivres, Category categoryToSearch) {
    ArrayList<Livres> booksInCategory = new ArrayList<>();

    // Collect books in the specified category
    for (Livres livre : listeLivres) {
        if (livre.category == categoryToSearch) {
            booksInCategory.add(livre);
        }
    }

    // Print books in the specified category
    System.out.println("Livres dans la catégorie " + categoryToSearch + ":");
    for (Livres livre : booksInCategory) {
        System.out.println("Titre: " + livre.title);
    }
}

    public boolean findBookPerTitle1(String bookTitle, ArrayList<Livres> listeLivres, ArrayList<Copy> listeCopies) {
        if (listeLivres != null && !listeLivres.isEmpty() && listeCopies != null && !listeCopies.isEmpty()) {
            for (int i = 0; i < listeLivres.size(); i++) {
                Livres livre = listeLivres.get(i);

                if (bookTitle.equals(livre.title)) {
                    if (i < listeCopies.size()) {
                        System.out.println("Le livre existe");
                        return true;
                    } else {
                        System.out.println("Erreur : Aucune information de copie trouvée pour le livre.");
                        return false;
                    }
                }
            }

            System.out.println("Le livre n'existe pas dans la liste.");
            return false;
        }

        System.out.println("Erreur : Liste de livres ou liste de copies non valide.");
        return false;
    }
   

}
