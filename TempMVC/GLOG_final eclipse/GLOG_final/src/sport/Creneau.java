package sport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Calendar;


public class Creneau {
	public Date debut;
	public Date fin;
	public Date date;
	public Cours cours;
	public Salle salle;
	
	public Creneau(Date  debut,Date fin,Date date, Cours cours, Salle salle) {
		this.debut=debut;
		this.fin=fin;
		this.date=date;
		this.cours=cours;
		this.salle=salle;
	}

	@Override
	public String toString() {
		
		SimpleDateFormat formater = null;
		
		Date debut = new Date(  );
		formater = new SimpleDateFormat("hh:mm a");
		System.out.println(formater.format(debut));
		    
		Date fin = new Date(  );
		formater = new SimpleDateFormat("hh:mm a");
	    System.out.println(formater.format(fin));
	    
	   
	    Date d = new Date(  );
		formater = new SimpleDateFormat("hh:mm a, zzzz");
		//formater = new SimpleDateFormat("dd-MM-yy");
	    System.out.println(formater.format(d));

		return "debut=" + formater.format(debut) + ", fin=" + formater.format(fin)+ ", date=" + d + ", cours=" + cours
				+ ", salle=" + salle;
	}

	public void setCreneau_date(Date date) {
		this.date= date;
		//Verficiation String entré
	}
	
	public void setCreneau_date_debut(Date debut) {
		this.debut= debut;
		//Verficiation String entré
	}
	public void setCreneau_date_fin(Date fin) {
		this.fin= fin;
		//Verficiation String entré
	}
	
	public void setCreneau_salle(Salle salle) {
		this.salle= salle;
		//Verficiation String entré
	}
	
	public void setCreneau_cours(Cours cours) {
		this.cours= cours;
		//Verficiation String entré
	}
	
}
