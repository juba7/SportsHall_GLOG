package sport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client extends Personne{
	//private int somme;
	protected Abonnement abonnement;
	
	
	public Client (int ID_personne, String nom, String prenom,String numtel,String mail, String datenaissance,String adresse) {
		super(ID_personne, nom,prenom, numtel,mail,datenaissance, adresse);
		//this.abonnement=new Abonnement();
		
		//this.abonnement=new Abonnement(type,ID_abo,prix,avantage);
	}
	
	// TO DO: Get client data
        public List<String> GetClientData(){
            return new ArrayList<String>(Arrays.asList(
                    Integer.toString(id) ,
                    nom ,
                    prenom ,
                    numtel ,
                    mail ,
                    datenaissance ,
                    adresse                     
            ));
        }
        
        
	//set_abonnement()
	
	public boolean PayerAbo() {
		
		/*i = abonnement.getAbo();
		//if (somme >= i)	
			return true;
		
		else 
			return false;
		*/	
		return true;
	}
	
	public boolean PayerInscrip() {
		/*int i = 30; 
		if (somme >=i)
			return true;
		else
			return false;*/
		return true;
	}
	public void AddAbo(Abonnement a) {
		this.abonnement = a;
	}
	
	public String toString() {
		
		return (super.toString() + "/n" + abonnement);
	}
	public int recup_prix() {
		System.out.println("Le prix de l'abonnement choisi est : %s" +abonnement.getAbo_prix());

		return abonnement.getAbo_prix();
		}

	public String recup_type() {
		System.out.println("Le type d'abonnement choisi est : %s" +abonnement.getAbo_type());

		return abonnement.getAbo_type();
		}

	public int recup_ID() {
		System.out.println("L'ID de l'abonnement choisi est : %s" +abonnement.getAbo_ID());

		return abonnement.getAbo_ID();
		}

	public String recup_avantage() {
		System.out.println("Les avantages de l'abonnement choisi sont : %s" +abonnement.getAbo_avantage());

		return abonnement.getAbo_avantage();
		}
	
        
	
}


