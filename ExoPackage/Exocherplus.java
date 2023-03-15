package ExoPackage;


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Exobanque {
    
    public static void main(String[] args) throws Exception {
    
        int compteur = 10 000;
        //1 scanner pour 2 input car le scan est en dehors du while

        Scanner scan = new Scanner(System.in);
        while (compteur>0){
            
           
            System.out.println("Combien voulez vous retirez");
            String nomUtil = scan.nextLine();

            //Scanner scan1 = new Scanner(System.in);
            //System.out.println("Saisissez votre mot de passe");
            //String nomPass = scan.nextLine();

            if (nomUtil.equals("admin") && nomPass.equals("123456")){
                System.out.println("Nom d'utilisateur et mot de passe correcte. Bienvenue ");
                break;
            }
            else{
                compteur = compteur - 1;
                System.out.println("Veuillez verifier votre nom d'utilisateur et votre mot de passe");
                System.out.println("Il vous reste " + compteur + " tentatives.");
            }

        }

        System.out.println("Echec d'identifation veuillez réessayer dans 5 minutes");
        
    }
}