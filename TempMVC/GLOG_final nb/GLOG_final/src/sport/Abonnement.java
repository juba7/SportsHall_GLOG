package sport;

public class Abonnement {
	private String nom_abo;
	private int id_abo;
	private int prix_abo;
	private String avantage;
	
public Abonnement (String nom_abo,int id_abo,int prix_abo, String avantage) {
	this.nom_abo = nom_abo;
	this.id_abo = id_abo;
	this.prix_abo = prix_abo;
	this.avantage = avantage;
}

public Abonnement () {
	this.nom_abo = "";
	this.id_abo = 0;
	this.prix_abo = 0;
	this.avantage = "";
	
}


@Override
public String toString() {
	return "type=" + nom_abo + ", id_abo=" + id_abo + ", prix=" + prix_abo + ", avantage=" + avantage;
}


public int getAbo_prix() {
	System.out.println("Le prix de l'abonnement choisi est : %s" +prix_abo);

	return prix_abo;
	}

public String getAbo_type() {
	System.out.println("Le type d'abonnement choisi est : %s" +nom_abo);

	return nom_abo;
	}

public int getAbo_ID() {
	System.out.println("L'ID de l'abonnement choisi est : %s" +id_abo);

	return id_abo;
	}

public String getAbo_avantage() {
	System.out.println("Les avantages de l'abonnement choisi sont : %s" +avantage);

	return avantage;
	}

public void setAbo_prix(int prix_abo) {
	this.prix_abo = prix_abo;
	//Verficiation String entré
}

public void setAbo_type(String nom_abo) {
	this.nom_abo = nom_abo;
	//Verficiation String entré
}
public void setAbo_ID(int id_abo) {
	this.id_abo = id_abo;
	//Verficiation String entré
}
public void setAbo_avantage(String avantage) {
	this.avantage = avantage;
	//Verficiation String entré
}

 
}
