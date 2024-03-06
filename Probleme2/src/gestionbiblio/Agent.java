package gestionbiblio;
import java.text.DateFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class Agent {
	   private ArrayList<Vipuser> listeVipusers;
	   private ArrayList<RegularUser> listeRegularUsers;
	   
	    public Agent() {
	        this.listeVipusers = new ArrayList<>();
	        this.listeRegularUsers = new ArrayList<>();
	    }
	   

	    public void AddNewUserVip() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Combien de Vipusers souhaitez-vous ajouter ?");
	        int nombreVipusers = scanner.nextInt();
	        scanner.nextLine();  // Lire la nouvelle ligne après le nombre

	        for (int i = 0; i < nombreVipusers; i++) {
	            System.out.println("Entrez les informations pour le Vipuser " + (i + 1) + " :");

	            System.out.print("Prénom : ");
	            String firstname = scanner.nextLine();

	            System.out.print("Nom : ");
	            String lastname = scanner.nextLine();

	            System.out.print("Date de naissance (YYYY-MM-DD) : ");
	            String birthdateInput = scanner.nextLine();

	            // Créer un nouvel objet Vipuser avec les informations saisies
	            Vipuser nouveauVipuser = new Vipuser(firstname, lastname);

	            // Ajouter le nouvel objet Vipuser à la liste
	            listeVipusers.add(nouveauVipuser);

	            System.out.println("Vipuser ajouté avec succès.\n");
	        }

	        // Afficher les détails des Vipuser ajoutés
	        System.out.println("Détails des Vipuser ajoutés :");
	        for (Vipuser vipuser : listeVipusers) {
	            System.out.println("Prénom : " + vipuser.firstname);
	            System.out.println("Nom : " + vipuser.lastname);
	        }
	    }

	        //private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        public void AddNewUserregular() {
	            Scanner scanner = new Scanner(System.in);

	            System.out.println("Combien de RegularUsers souhaitez-vous ajouter ?");
	            int nombreRegularUsers = scanner.nextInt();
	            scanner.nextLine();  // Lire la nouvelle ligne après le nombre

	            for (int i = 0; i < nombreRegularUsers; i++) {
	                System.out.println("Entrez les informations pour le RegularUser " + (i + 1) + " :");

	                System.out.print("Prénom : ");
	                String firstname = scanner.nextLine();

	                System.out.print("Nom : ");
	                String lastname = scanner.nextLine();

	                System.out.print("Date de naissance (YYYY-MM-DD) : ");
	                String birthdateInput = scanner.nextLine();
	                
	                RegularUser nouveauRegularUser = new RegularUser(firstname, lastname);
	                // Ajouter le nouvel objet RegularUser à la liste
	                listeRegularUsers.add(nouveauRegularUser);

	                System.out.println("RegularUser ajouté avec succès.\n");
	            }

	            // Afficher les détails des RegularUsers ajoutés
	            System.out.println("Détails des RegularUsers ajoutés :");
	            for (RegularUser regularUser : listeRegularUsers) {
	       
	                System.out.println("Prénom : " + regularUser.firstname);
	                System.out.println("Nom : " + regularUser.lastname);
	            }
	        }
	       
	        
	 
	      //methode penalite pour les VIP
	        public long penalitevip(Vipuser utilisateur, Date today) {
	            long penalite = 0;

	            for (Special element : utilisateur.tab2) {
	                long differenceEnMillis = today.getTime() - element.x.getTime();
	                long differenceEnJours = differenceEnMillis / (24 * 60 * 60 * 1000);

	                if (differenceEnJours > 30) {
	                    penalite = (differenceEnJours - 30) * 10 + penalite;
	                    return penalite;
	                }
	            }

	            return penalite;
	        }
	     //methode penalite pour les reguliers
	     
	        RegularUser obj1;

	        public long penalitereg(RegularUser utilisateur, Date today) {
	            long penalite = 0;

	            for (Special element : utilisateur.tab1) {
	                long differenceEnMillis = today.getTime() - element.x.getTime();
	                long differenceEnJours = differenceEnMillis / (24 * 60 * 60 * 1000);

	                if (differenceEnJours > 15) {
	                    penalite = (differenceEnJours - 15) * 10 + penalite;
	                    return penalite;
	                }
	            }

	            return penalite;
	        }
	    	}

	        
	     