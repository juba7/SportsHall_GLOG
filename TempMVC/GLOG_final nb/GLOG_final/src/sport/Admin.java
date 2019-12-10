package sport;

public class Admin {
	private int ID_admin;
	private String login;
	private String mdp;
	private String nom_admin;
	
	public Admin(int ID_admin,String login,String mdp,String nom_admin) {
		System.out.println("Constructeur d'Admin");
		this.ID_admin = ID_admin;
		this.login= login;
		this.mdp=mdp;
		this.nom_admin = nom_admin;
	}
	
	
	public void Chercher_membre() {
		System.out.println("je suis chercher personne");

		
	}
	
	public void Desinscrire_personne() {
		System.out.println("je suis desinscrire personne");
		
	}
	
	public void Envoi_mail() {
		System.out.println("je suis envoi mail");
		
	}
	
	
}


