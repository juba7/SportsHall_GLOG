package sport;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private String numtel;
	private String mail;
	private String datenaissance;
	private String adresse;
	
	
	
@Override
	public String toString() {
		return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numtel=" + numtel + ", mail=" + mail
				+ ", datenaissance=" + datenaissance  + ", adresse=" + adresse ;
	}



public Personne (int id,String nom,String prenom, String numtel, String mail, String datenaissance, String adresse) {
	System.out.println("Constructeur de personne");
	this.id=id;
	this.nom = nom;
	this.prenom = prenom;
	this.numtel = numtel;
	this.mail = mail;
	this.datenaissance = datenaissance;
	this.adresse = adresse;
}
	
}
