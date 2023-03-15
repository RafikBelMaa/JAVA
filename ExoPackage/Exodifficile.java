package ExoPackage;


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Exodifficile {
    
    public static void main(String[] args) throws Exception {
        JeuPendu();
    }
    static void JeuPendu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choisissez votre mot");
        String motJeu = scan.nextLine();
        // On demande un mot ou un caractere a l'utilisateur pour commence le jeus
        ArrayList<String> listeProgres = new ArrayList<String>();
        int listeProgressize = motJeu.length();
        int compteur = 10;
        for (int index = 0; index < listeProgressize; index++) {
            listeProgres.add("_"); 
        }
        while (listeProgres.contains("_") && compteur>0 ) {
            System.out.println(String.join(" ", listeProgres));
            System.out.println("Choisissez votre lettre");
            String lettre = scan.nextLine();
            int indexletter = motJeu.indexOf(lettre);
            if (indexletter == -1) {
                compteur = compteur - 1;
                System.out.println("Echec! Il vous reste " + compteur + " tentatives");

            }
            
            while (indexletter != -1) {
                 listeProgres.set(indexletter, lettre);
                 indexletter = motJeu.indexOf(lettre, indexletter+ 1);   
            }
           
        }
        if (listeProgres.contains("_")) {
            System.out.println("Echec d'identifation veuillez réessayer dans 5 minutes");
        }       
        else {
            System.out.println("Bien joué vous avez trouver le mot " + motJeu + " .");
        }
    }
    
}
