package gestiondebiblio;

public class Client {
	private String nom;
	private String prenom;
	private float matricule;
	public Client(String nom, String prenom, float matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}
	public Client() {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule=matricule;
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
	public float getMatricule() {
		return matricule;
	}
	public void setMatricule(float matricule) {
		this.matricule = matricule;
	}
	
}
