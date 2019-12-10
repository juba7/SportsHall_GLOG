/*

Controlleur

 */
package Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import sport.Abonnement;
import sport.Admin;
import sport.Client;
import sport.Coach;
import sport.Cours;
import sport.Creneau;
import sport.Modele;
import sport.Salle;

/**
 *
 * @author Juba
 */
public class AppController {

    // entrer prinsipale dans le programme 
    Modele modele = null;
 
    // tout les clients de la base de donnée
    public List<List<String>> get_clients() {

        List<List<String>> Tableau = new ArrayList<List<String>>();
        for (Client c : modele.get_clientList()) {
            List<String> Ligne = c.GetClientData();
            Tableau.add(Ligne);
        }

        return Tableau;

    }

    //public void update client data
    
    
    
    public static void main(String[] args) {
        SimpleDateFormat formater = null;
        //SimpleDateFormat formater = null;
        List<Client> listcl = new ArrayList<Client>();
        //List<Coach> listco = new ArrayList<Coach>();

        Client C1 = new Client(123, "Tam", "Steph", "0607356451", "steph@gmail.com", "01/07/1997", "13 rue du massif");
        System.out.println(C1.toString());
        listcl.add(C1);
        Client C2 = new Client(789, "Hamza", "BITI", "0607356451", "hamzah@gmail.com", "01/07/1997", "13 rue du massif");
        listcl.add(C2);
        Admin A1 = new Admin(456, "Lena", "09111995G", "Ghalem");
        Coach Co1 = new Coach(123, "Qaos", "Asmaa", "7356451", "boom@gmail.com", "01/07/1827", "chatelet");
        Abonnement Abo1 = new Abonnement("type1", 1, 19, "douche froide");
        System.out.println(Abo1.toString());
        Abonnement Abo2 = new Abonnement("type2", 1, 25, "douche chaude");
        Salle Sal1 = new Salle(105, "Zumba");
        System.out.println(Sal1.toString());
        Salle Sal2 = new Salle(106, "Zumbaaaaa");
        Cours Cou1 = new Cours("cours1", "individuel", 100, listcl, Co1);
        System.out.println(Cou1.toString());
        Cours Cou2 = new Cours("cours2", "collectif", 50, listcl, Co1);
        A1.Chercher_membre();
        A1.Desinscrire_personne();
        A1.Envoi_mail();
        C1.PayerAbo();
        C1.PayerInscrip();
        Cou1.annuler();
        Cou2.confirmer();
        Cou2.modifier();
        Sal1.desengagerSalle();
        Sal2.reserverSalle();
        //C1.modif_prix(11111);
        C1.AddAbo(Abo1);
        System.out.println(C1.toString());
        C1.AddAbo(Abo2);
        System.out.println(C1.toString());
        Abo1.setAbo_prix(35);
        System.out.println(Abo1.toString());
        //Abo1.setAbo_prix(35);
        //System.out.println( C1.toString());
        Abo2.setAbo_prix(2222222);
        System.out.println(C1.toString());

        Date d = new Date();
        //formater = new SimpleDateFormat("hh:mm a, zzzz");
        formater = new SimpleDateFormat("dd-MM-yy");
        System.out.println(formater.format(d));

        Date heure_d = new Date();
        formater = new SimpleDateFormat("hh:mm a, zzzz");
        System.out.println(formater.format(heure_d));

        Date heure_f = new Date();
        formater = new SimpleDateFormat("hh:mm a, zzzz");
        System.out.println(formater.format(heure_f));

        Creneau Cre1 = new Creneau(heure_d, heure_f, d, Cou1, Sal1);
        System.out.println(Cre1.toString());

        //Date date = new Date(  );
        //Juba mon poto n'oublie pas de tester �a apr�s avoir changer le format de l'heure de d�but et de la fin==>d�commente en bas !
        //Cre1.setCreneau_date(date));
        //Cre1.setCreneau_date_debut(debut);
        //Cre1.setCreneau_date_fin(fin);
        Cre1.setCreneau_salle(Sal2);
        System.out.println(Cre1.toString());

        Creneau Cre2 = new Creneau(heure_d, heure_f, d, Cou2, Sal2);
        Cre2.setCreneau_salle(Sal1);
        System.out.println(Cre2.toString());

        Cre2.setCreneau_cours(Cou1);
        System.out.println(Cre2.toString());

    }

    //public boolean clientSetAbo(String ID,String ID_abo) {
    //Client get_client_with_id(String ID_personne);
    //}
}
