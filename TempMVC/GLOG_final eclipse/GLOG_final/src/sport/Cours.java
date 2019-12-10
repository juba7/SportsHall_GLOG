package sport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Cours {
	private String nom;
	//private int duree;
	private String type; //indiv ou collectif
	//private int creneau;
	private int id_cours;
	//liste coach
	private Coach coach;
	//private List<Coach> listco;
	//liste client
	private List<Client> listcl;
	
public Cours (String nom, String type, int id_cours, List<Client> listcl, Coach coach) {
	this.nom= nom;
	//this.duree=duree;
	this.type=type;
	//this.creneau=creneau;
	this.id_cours=id_cours;
	this.listcl = listcl;
	this.coach = coach;
	//
	System.out.println("Constructeur cours");
	
}

public Cours () {
	this.nom = "";
	this.type= "";
	this.id_cours= 0;
	//this..id_cours...= "";
	this.listcl =  new ArrayList<Client>();
	this.coach = new Coach (0," "," "," "," ", "","");
	
}



@Override
public String toString() {
	return "nom=" + nom + ", type=" + type + ", id_cours=" + id_cours;
}

public void confirmer() {
	System.out.println("Cours confirmé");	
}
 
public void annuler() {
	System.out.println("Cours annulé");	
}

public void modifier() {
	System.out.println("Cours modifié");
}

public String getCours_nom() {
	System.out.println("Le prix de l'abonnement choisi est : %s" +nom);

	return nom;
	}

public String getCours_type() {
	System.out.println("Le prix de l'abonnement choisi est : %s" +type);

	return type;
	}

public int getCours_id_cours() {
	System.out.println("Le prix de l'abonnement choisi est : %s" +id_cours);

	return id_cours;
	}

}