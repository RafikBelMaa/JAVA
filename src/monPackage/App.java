//Definition du package qui represente un dossier physique dans l'arborescence du projet
//ex: package NOM_PACKAGE;
package monPackage;

//Les imports des packages externes ajoutés automatiquement par VS Code lors du selection (TAB ou Enter) du Type classe
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Definition classe contenue entre accolades
//ex: VISIBILITY class NOM_CLASSE {
public class App {
    //Chaque classe peut contenir une methode main qui nous permet d'executer la classe avec une liste d'arguments 
    public static void main(String[] args) throws Exception {
        //calculerMoyenneNotes();
        calculMoyenne();

        //Creer l'objet scan du classe Scanner par le mot-cle "new"
        Scanner scan = new Scanner(System.in);

        //Imprimer à l'utilisateur l'étiquette de la donnée d'entrée à saisir
        System.out.println("Saisisser votre salaire");
        
        //Convertir la valeur capturée par la méthode nextLine du String vers Float 
        //pour pouvoir faire une operation arithmetique avec le %
        //car on peut pas multiplier un String par Float
        float salaire = 0;

        boolean siException;
        do {
            //Utiliser l'objet scan pour attendre que l'utilisateur saisit la donnée (avec la touche Enter pour valider)
            String salaireUtilisateur = scan.nextLine();

            //Comme la valeur capté est de type String, il faut "try" la conversion qui peut échouer en Exception
            //c'est pas recommandé que l'exception monte à l'utilisateur 
            //donc il faut intervenir et faire "catch"
            try {
                //La méthode valueOf peut exister sur d'autre types de classe, ex: String.valueOf
                salaire = Float.valueOf(salaireUtilisateur);
                siException = false;
            } catch (Exception e) {
                //J'affiche un message plus "user-friendly" que l'exception
                System.out.println("Format indéfini");
                siException = true;
            }
        }
        //Raccourci: while (siException); System.out.println("Saisissez votre nom d'utilisateur");
        while (siException == true); 

        /* 
        boolean siQuestion = true;
        while (siQuestion) {
            //Utiliser l'objet scan pour attendre que l'utilisateur saisit la donnée (avec la touche Enter pour valider)
            String salaireUtilisateur = scan.nextLine();

            //Comme la valeur capté est de type String, il faut "try" la conversion qui peut échouer en Exception
            //c'est pas recommandé que l'exception monte à l'utilisateur 
            //donc il faut intervenir et faire "catch"
            try {
                //La méthode valueOf peut exister sur d'autre types de classe, ex: String.valueOf
                salaire = Float.valueOf(salaireUtilisateur);
                siQuestion = false;
            } catch (Exception e) {
                //J'affiche un message plus "user-friendly" que l'exception
                System.out.println("Format indéfini");
                siQuestion = true;
            }
        }
        */

        //Definir le pourcentage
        double pourcentage = 0.9;

        //Créer un objet anonyme de la classe Personne en faisant appel au constructeur ("new")
        Personne anonyme = new Personne();

        //Affectation des attributes de l'objet anonyme
        anonyme.prenom = "Rafik";
        anonyme.nom = "MAACHI";
        anonyme.age = 31;

        //Informer l'utilisateur depuis le terminal à propos de la donnée d'entrée à saisir
        System.out.println("Saisisser votre date");

        //Attendre la saisie de l'utilisateur (qui va etre validé par Enter)
        String dateUtilisateur = scan.nextLine();
        
        //Créer un objet formatter d'une classe SimpleDateFormat
        //pour convertir la valeur String capturé du scan vers un objet d'une classe Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        //Utiliser la méthode formatter pour faire la conversion
        anonyme.dateNaissance = formatter.parse(dateUtilisateur);

        //anonyme.dateNaissance soit inferieur à la date du jour
        Date dateJour = new Date();
        //if(PARAMETRE_1 OPERATEUR PARAMETRE_2)

        long dateNaissanceTime = anonyme.dateNaissance.getTime();
        long dateJourTime = dateJour.getTime();
        if (dateNaissanceTime > dateJourTime) {
            System.out.println("Date naissance > Date Jour !");
            return;
        }

        //Appliquer l'operation arithmetique multiplication entre salaire et pourcentage
        //Remarque: La multiplication entre float et double donne un type automatique double
        double resultat = salaire * pourcentage;

        //On convertit du double (resultat de l'operation précédente) vers float (la cible: type de la propriété salaire)
        anonyme.salaire = (float) resultat;

        //La methode valueOf existe aussi pour des autres types de classe
        String variableAge = String.valueOf(anonyme.age);

        // double
        // 5.328913721321837128362173821736128736217832132131232132132132

        // float
        // 5.32891372132183712836

        //Refactoriser l'ancienne expression pour retourner le nom complet depuis une fonction séparé
        //Appeler la fonction nommé "concatener" avec deux parametres

        // String nomComplet = anonyme.prenom + " " + anonyme.nom + " " + anonyme.age;
        String nomComplet = concatener(anonyme.prenom, anonyme.nom);

        //Concatener le resultat de la fonction avec age et salaire
        //Java gère automatiquement la concatenation entre String (variableAge) et float (salaire)
        String affichage = nomComplet + " " + variableAge + " " + anonyme.salaire;
        affichage = affichage + " " + formatter.format(anonyme.dateNaissance);
        System.out.println(affichage);

        //Extraire le constituant année d'un objet d'une classe Date à travers la classe SimpleDateFormat
        //Le constructeur de SimpleDateFormat prend le format souhaitée (yyyy) en paramètre
        //Les formats possibles à utiliser sont des formats standards
        SimpleDateFormat formatterAnnee = new SimpleDateFormat("yyyy");

        //Pour l'afficher séparément à l'utilisateur
        System.out.println("Annee:" + formatterAnnee.format(anonyme.dateNaissance));
    }

    //Syntaxe: MODE_ACCES TYPE_RETOUR NOM_FONCTION (ARGUMENTS) {
    //On définit une fonction nommée "concatener" avec deux paramètres
    //Avec un type de retour String
    static String concatener(String p1, String p2) {
        //On effectue la concatenation entre les deux paramètres
        //On affecte le resultat à une nouvelle variable
        String retour = p1 + " " + p2;

        //On choisit la variable de retour
        return retour;
    }
 
    static void calculMoyenne() {
        //Récupérer la donnée par l’utilisateur
        System.out.println("Saisisser vos notes (ex: 1,2,3..)");

        Scanner scan = new Scanner(System.in);
        String notes = scan.nextLine();

        //String[] : taille fixe non modifiable et doit etre defini en declaration de constructeur
        //String[] array = new String[5]; 
        //ArrayList<String> : taille modifiable
        //ArrayList<String> liste = new ArrayList<String>();

        //une liste
        String[] notesArray = notes.split(",");
        List<String> notesList = Arrays.asList(notesArray);

        double somme = 0;
        //iterater sur la liste
        for (String item : notesList) {
            //une liste de nombre
            int numberItem = Integer.parseInt(item);
            somme = somme + numberItem;
        }   
        double moyenne = somme /notesList.size();

        System.out.println("La moyenne est " + moyenne);
    }
}
