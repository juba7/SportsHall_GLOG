package sport;

public class Salle {
	private int id_salle;
	//private int capacite_max;
	private String nom_salle;

	public Salle(int id_salle, String nom_salle) {
		this.id_salle = id_salle;
		//this.capacite_max = capacite_max;
		this.nom_salle = nom_salle;
		System.out.println("Constructeur salle");
		

	}
	
	@Override
	public String toString() {
		return "id_salle=" + id_salle + ", nom_salle=" + nom_salle;
	}

	public void reserverSalle() { //boolean
		
		System.out.println("salle reservée");

	}
	
	
	public void desengagerSalle() { //boolean
		System.out.println("salle desengagée");

		
	}
	

}


