package gestionbiblio;

import java.util.Date;

public class RegularUser extends User {
    Special[] tab1;
    long penalite = 0;
    Livres obj1;
    Agent obj;
    Library obj3;

    public RegularUser(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.tab1 = new Special[2];
        this.obj = new Agent();
        this.obj1 = new Livres();
        this.obj3 = new Library();
        // Initialisez obj3 avec une nouvelle instance de Library
        this.obj3 = new Library();
        // Ajoutez des livres à obj3 (à ajuster selon votre implémentation)
        obj3.addlivre();
        // Initialisez tab1 avec des instances de Special
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = new Special();
        }
    }

    public RegularUser() {
        this.tab1 = new Special[2];
        this.obj = new Agent();
        this.obj1 = new Livres();
        this.obj3 = new Library();
        // Initialisez obj3 avec une nouvelle instance de Library
        this.obj3 = new Library();
        // Ajoutez des livres à obj3 (à ajuster selon votre implémentation)
        obj3.addlivre();
        // Initialisez tab1 avec des instances de Special
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = new Special();
        }
    }

    User obj4 = new User();
    Vipuser c;

    public void lancerDemandeEmprunt(Date today, String nomLivre) {
        int nbCopies = obj4.Nombredelivresdispo(nomLivre, obj3.livre, obj3.copies);

        if (nbCopies == 0) {
            System.out.println("Le livre n'est pas disponible pour le moment ou n'existe pas.");
            return;
        }

        int b = 1;

        for (int i = 0; i < tab1.length; i++) {
            long penalitereg = obj.penalitereg(this, today);

            if (tab1[i].a) {
                if (penalitereg != 0) {
                    System.out.println("Vous avez une pénalité donc vous ne pouvez pas emprunter.");
                    return;
                }

                b++;
            } else if (penalitereg == 0 && b < 5) {
                if (nbCopies > 0) {
                    // Enregistrer la date d'emprunt
                    tab1[i].x = today;
                    tab1[i].a = true;
                    System.out.println("Emprunt réussi !");
                    return;
                } else {
                    System.out.println("Le livre n'est plus disponible.");
                    return;
                }
            }
        }

        if (b >2) {
            System.out.println("Vous ne pouvez pas emprunter. Vous avez déjà emprunté 2 livres, le maximum est atteint.");
        } else {
            System.out.println("Vous ne pouvez pas emprunter. Vous avez une pénalité et le maximum est atteint.");
        }
    }
}
