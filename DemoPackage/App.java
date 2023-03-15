package DemoPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez votre salaire");
        String salaireUtilisateur = scanner.nextLine();

        float salaire = Float.valueOf(salaireUtilisateur);
        double pourcentage = 0.9;
        


        String stringVar = "Hello, World";
        Personne anonyme = new Personne();

        

        anonyme.prenom = "Kamel";
        anonyme.nom = "Milad";
        //anonyme.age = (float)(date + anonyme.dateUtilisateur);
        anonyme.salaire = (float)(salaire * pourcentage);


        


        System.out.println("Saisissez votre date de naissance");
        String dateUtilisateur = scanner.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        anonyme.dateNaissance = formatter.parse(dateUtilisateur);

        String variableAge = String.valueOf(anonyme.age);

        //String nomComplet = anonyme.prenom + " " + anonyme.nom + " " + anonyme.age;
        String nomComplet = concatener(anonyme.prenom, anonyme.nom, anonyme.age);
        String affichage = "Vous etes Mr. " + nomComplet + " , vous etes née le  "  + formatter.format(anonyme.dateNaissance) + " et vous touchez "  + anonyme.salaire + " par mois.";
        
        SimpleDateFormat formatterActuel = new SimpleDateFormat("dd/mm/yyyy");
        anonyme.actuel = formatterActuel;
        System.out.println("Nous somme le " + (formatterActuel)) ;


        
        //System.out.println(format.format(date));

        SimpleDateFormat formatterAnnee = new SimpleDateFormat("yyyy");
        System.out.println("Annee:" + formatterAnnee.format(anonyme.dateNaissance));
    
        
        System.out.println(affichage);
    }
    //MODE_ACCES TYPE_RETOUR NOM_FONCTION (ARGUMENTS)
    static String concatener(String p1, String p2, int a1) {
        return p1 + " " + p2 + " " + a1;
    }

    static String retour() {
        String valeur = "";
        return valeur;
        
    }
    //static void maFonction(String parametre, String parametre2) {
      //  System.out.println("Appelle maFonction");
    //}

    //void maFonction1(String parametre1) {


    }


      
        


