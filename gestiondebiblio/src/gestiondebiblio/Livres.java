package gestiondebiblio;

public class Livres {
private String titre;
private String auteur;
private int id;
private String spécialité;
private int stockdispo;

public Livres(String titre,String auteur, int id,String spécialité,int stockdispo) {
	this.titre = titre;
	this.auteur = auteur;
	this.id = id;
	this.spécialité = spécialité;
	this.stockdispo=stockdispo;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSpécialité() {
	return spécialité;
}
public void setSpécialité(String spécialité) {
	this.spécialité = spécialité;
}
public int getstockdispo() {
	return stockdispo;
}
public void setstockdispo(int stockdispo) {
	this.stockdispo = stockdispo;
}

}
