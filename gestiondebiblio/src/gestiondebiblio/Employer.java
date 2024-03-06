package gestiondebiblio;
import java.util.LinkedList;

public class Employer {
	private String nom;
	private String prenom;
	private String service;
	private String role;
	
	public Employer(String nom, String prenom, String service, String role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.service = service;
		this.role = role;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	/*public void listedeLivres() {
		LinkedList<String> ListdesLivres = new LinkedList<>();
		 for (String item : ListdesLivres) {
	            System.out.print(item + " -> ");
	        }
	}*/
	
	/*public void listedeClientsapresinscription() {
		LinkedList<String> Listdeclient = new LinkedList<>();
		 for (String item : Listdeclient) {
	            System.out.print(item + " -> ");
	        }*/
	
	public String toString() {
        return "Nom : " + nom + ", Prenom : " + prenom + ",service : " + service +",role: "+role; 
    }
}
