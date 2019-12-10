package sport;

public class Personne {
	protected int id;
	protected String nom;
	protected String prenom;
	protected String numtel;
	protected String mail;
	protected String datenaissance;
	protected String adresse;
	
	
	
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
