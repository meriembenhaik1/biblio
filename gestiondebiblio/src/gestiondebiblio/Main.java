package gestiondebiblio;
import java.util.LinkedList;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		//l'employer responsable
Employer obj1 = new Employer("benhaik","meriem","informatique","responsable general");
System.out.println("voici l'employer responsable du service informatique : \n");
System.out.println(obj1.toString());
		//la liste des livres disponible allow to l'employer
 Livres obj2 =new Livres("le fils du pauvre" ,"mouloud feraoun",1,"literatture algerienne kabyle",1); 
 Livres obj3 =new Livres("le sel de tout les oublis" ,"yasmina khedra",2,"literatture algerienne",30);
 Livres obj4 =new Livres("nedjma" ,"kateb yacine",3,"literatture algerienne",42); 
 Livres obj5 =new Livres("tout le bleu du ciel" ,"melissa da costa",4,"young adulte",20); 
 Livres obj6 =new Livres("la terre et le sang" ,"mouloud feraoun",5,"literatture algerienne kabyle",3); 
 Livres obj7 =new Livres("les chemins qui montent" ,"mouloud feraoun",6,"literatture algerienne kabyle",8); 
 
 LinkedList<String> ListdesLivres = new LinkedList<>();//j'ai déja realiser une methode qui permet de creéer une list chainée mais j'ai pas su ccomment la manipuler ???
 ListdesLivres.add(obj2.getTitre());
 ListdesLivres.add(obj3.getTitre());
 ListdesLivres.add(obj4.getTitre());
 ListdesLivres.add(obj5.getTitre());
 ListdesLivres.add(obj6.getTitre());
 ListdesLivres.add(obj7.getTitre());
 System.out.println("voici les livres en stock disponible : ");
 for (String item : ListdesLivres) {
        System.out.println(item + " -> ");
    }
 Client obj8 = new Client("benhaik", "ines", 22221412);
 Client obj9 = new Client("benhaik", "massine", 222212512);
 Client obj10 = new Client("benhaik", "yanis", 2545555);
 Client obj11 = new Client("benhaik", "meziane", 5588412);
//creation de la liste des clients inscrits 
 
 LinkedList<Float> listedesclients = new LinkedList<>();
 listedesclients.add(obj8.getMatricule());
 listedesclients.add(obj9.getMatricule());
 listedesclients.add(obj10.getMatricule());
 listedesclients.add(obj11.getMatricule());
 System.out.println("voici les matricules des clients iscrits : ");
 for (Float item : listedesclients) {
        System.out.println(item + " -> ");
    }
 //l'emprunt d'un livre pour avoir l'mprunt il faut que le client soit dans la liste chainée sinon on l'ajoute
/* modelisation de la situation suivante (un client qui n'est pas inscrit veut emprunter un livre on suit le cheminement suivant
  (1-on verifie si le livre est dans la liste
  2-si oui (on verifie si le client est dans la liste si oui on lui attribue le livre on decremente le stock,sinon on le rajoute dans la lite des clients ensuite on rajoute le client dans la liste des emprunteurs
  */
 Scanner myObject= new Scanner (System.in);//creation d'un objet a partir de la class de scanner pour y acceder il a les memes attributs et les memes methode que scanner
	System.out.println("entrer uniquement votre nom ");//instruction a l'utilisateur
	String Usernom=myObject.nextLine();
 Client obj14 = new Client();
 obj14.setNom(Usernom);
 Scanner Object= new Scanner (System.in);//creation d'un objet a partir de la class de scanner pour y acceder il a les memes attributs et les memes methode que scanner
	System.out.println("entrer uniquement votre prénom ");//instruction a l'utilisateur
	String Userprenom=Object.nextLine();
	obj14.setPrenom(Userprenom);
	obj14.setMatricule(2226158);
 listedesclients.add(obj14.getMatricule());
 
 System.out.println("voici la la liste des livres disponibles");
 for (String item : ListdesLivres) {
     System.out.println(item + " -> ");
 }
 Scanner Object1= new Scanner (System.in);
 System.out.println("entrer le titre du livre que vous voulez emprunter");
 String livre=Object1.nextLine();
 String elementToFind = livre;
 boolean isFound = ListdesLivres.contains(elementToFind);
 if (isFound) {
     System.out.println("Le livre " + elementToFind + " a été trouvé dans la liste chaînée vous pouvez le prendre.");
 } else {
     System.out.println("Le livre " + elementToFind + " n'a pas été trouvé dans la liste chaînée.");
 }
 //après l'emprunt on doit décrementer le nombres de livres dispo dans le stock

 
 
 
if(livre.equals(obj2.getTitre())) {
	int a= obj2.getstockdispo();
	a=a-1;
	obj2.setstockdispo(a);
	if(obj2.getstockdispo()==0) {
		 ListdesLivres.remove(obj2.getTitre());
	}
	
}else if(livre.equals(obj3.getTitre())) {
	int a=obj3.getstockdispo();
	a=a-1;
	obj3.setstockdispo(a);
	if(a==0) {
		 ListdesLivres.remove(obj3.getTitre());
	}
	
}else if(livre.equals(obj4.getTitre())) {
	int a=obj4.getstockdispo();
	a=a-1;
	obj4.setstockdispo(a);
	if(a==0) {
		 ListdesLivres.remove(obj4.getTitre());
	}
	
}else if(livre.equals(obj5.getTitre())) {
	int a=obj5.getstockdispo();
	a=a-1;
	obj5.setstockdispo(a);
	if(a==0) {
		 ListdesLivres.remove(obj5.getTitre());
	}
	
}else if(livre.equals(obj6.getTitre())) {
	int a=obj6.getstockdispo();
	a=a-1;
	obj6.setstockdispo(a);
	if(a==0) {
		 ListdesLivres.remove(obj6.getTitre());
	}
	
}else {
	int a=obj7.getstockdispo();
	a=a-1;
	obj7.setstockdispo(a);
	if(a==0) {
		 ListdesLivres.remove(obj7.getTitre());
	}
}

System.out.println("voici les livres disponible après l'emprunt");
for (String item : ListdesLivres) {
    System.out.println(item + " -> ");
}




 }	
	}
