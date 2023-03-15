package ExoPackage;


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ExoCalculatrice {
    
    public static void main(String[] args) throws Exception {
        tirette();
    }

    static void calculette(){
        int compteur = 3;
        int soldeActuel = 10000;
        //1 scanner pour 2 input car le scan est en dehors du while
        Scanner scan = new Scanner(System.in);
        
        
        while (compteur>0 ){
            System.out.println("Saisissez votre code secret");
            String secret = scan.nextLine();
            if (secret.equals("94623") && soldeActuel!= 0){
                System.out.println("Mot de passe correcte. Bienvenue combien voulez vous retirez ?");
                int soldeOperation = scan.nextInt();
                int soldeTout = soldeActuel - soldeOperation;
                while (soldeTout<0) {
                    System.out.println("Vous n'avez pas assez d'argent sur votre compte pour pouvoir retirer cette somme"); 
                    System.out.println("Veuillez renseigner une nouvelle somme");
                    soldeOperation = scan.nextInt(); 
                    soldeTout = soldeActuel - soldeOperation;
                }
                System.out.println(" Voici votre argent il vous reste " + soldeTout + " euros sur votre compte ");
                System.out.println("Merci pour votre confiance n'oubliez pas de retirez votre carte. A bientot");
                return;
            }
            else{
                compteur = compteur - 1;
                System.out.println("Veuillez verifier votre nom d'utilisateur et votre mot de passe");
                System.out.println("Il vous reste " + compteur + " tentatives.");
            }
            //System.out.println("Echec d'identifation votre compte est temporairement bloqué.");
        }
        System.out.println(compteur);
        if (compteur == 0){
            System.out.println("Echec d'identifation votre compte est temporairement bloqué.");
        }
    }
}