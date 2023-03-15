package ExoPackage;


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Exofacile {
    
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("Saisissez votre nom d'utilisateur");

    String nomUtil = scan.nextLine();

    System.out.println("Votre nom d'utilisateur est " + nomUtil + ".");
    
    Date dateJour = new Date();
    //long dateJourTime = dateJour.getTime();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String formatterDate = formatter.format(dateJour);
    System.out.println("Bienvenue nous somme le " + formatterDate + ".");
    }

}
