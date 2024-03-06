package gestionbiblio;
import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
	    // Create books and fill copies
		// Création de quelques livres avec des paramètres prédéfinis test de la fonction creation et affichage pour simplifier
		   Library obj = new Library();
		    obj.addlivre();//methode dans la liste library(vous pouver consulter tout les livrs)
		        //Test des fonctions de la class User pour rassurer que toutes les autres fonctions marchent
		       User obj2=new User();
		       //test recherche book 
		       obj2.findBookPerTitle1("les chemins qui montent",obj.livre,obj.copies);
		       
		       //test recherche par categorie
		        Category categoryToSearch = Category.Health;

		        // Appelez la fonction pour imprimer les livres de la catégorie spécifiée
		        obj2.printBooksByCategory(obj.livre, categoryToSearch);
		        //Test de la fonction qui calcule le nombre de livres
		        System.out.println("le nombre de livre="+obj2.Nombredelivresdispo("les chemins qui montent",obj.livre,obj.copies));
		        
		         /* alors notre scenario : on a deux clients un client vip (meriem) et un autre
			     client non vip (regular client karim) chacun a sa propre carte les clients viennet pour emprunter un livre
			     ici on va tester les deux classes vipuser et regular user dans deux situations differentes
			     */
		        /*Situation 1: On va tester la class Vip user avec meriem , meriem a uniquement 3 livres pas 5 mais elle a des dettes!!!*/ 
			    Vipuser obj1=new Vipuser("meriem", "benhaik");
			        for (int i = 0; i < 3; i++) {
			            obj1.tab2[i] = new Special();
			            obj1.tab2[i].x.setMonth(1);
			            obj1.tab2[i].x.setYear(2024);
			            obj1.tab2[i].x.setDate(2);
			            obj1.tab2[i].a = true;
			        }
			        Date b=new Date();
			        b.setYear(2025);
			        b.setDate(2);
			        b.setMonth(1);
			       //meriem lance une demande d'emprunt resultat elle ne peut pas emprunter car elle a des dettes 
			        
			        
			        System.out.println("----------SITUATION 1------------");
			        
			        obj1.lancerDemandeEmprunt(b, "mimi");//livre non existant
			        obj1.lancerDemandeEmprunt(b, "la terre et le sang");//meriem ne peut pas emprunter car meriem a une dette
			        
			        System.out.println("----------SITUATION 2------------");
			       /*Situation 2  On va tester la class REGULAR user avec karim , karim a 2 livres et il a des dettes il ne peut pas emprunter !!!*/
		           RegularUser obj3=new RegularUser("karim","benhaik");
		           for (int i = 0; i < 2; i++) {
		        	   obj3.tab1[i] = new Special();
		        	   obj3.tab1[i].x.setMonth(1);
		        	   obj3.tab1[i].x.setYear(2024);
		        	   obj3.tab1[i].x.setDate(2);
		        	   obj3.tab1[i].a = false;
			        }
			       obj3.lancerDemandeEmprunt(b, "les chemins qui montent");//karim ne peut pas emprunter car sa carte est pleine de plus il a une penalite de retard
		     
	}
			}
