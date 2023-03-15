//Définition du package qui réprésente un dossier physique dans l'arborescence du projet
//PACKAGE_NOM_PACKAGE
package DemoPackage;

//Les imports des packages externes ajoutés automatiquement lors de la sélection (TAB ou Enter) du Type classe
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Définition classe contenue entre accolades
//VISBILITY class NOM_CLASSE (
public class correction_app {
    //Chaque classe peut contenir une méthode main qui nous permet d'exécuter la classe avec une liste d'arguments
    public static void main(String[] args) throws Exception {

        //Créer l'objet scan de classe Scanner par le mot clé "new"
        Scanner scan = new Scanner(System.in);

        //Imprimer à l'utilisateur l'étiquette de la donnée d'entrée à saisir
        System.out.println("Saisissez votre salaire");

        //Convertir la valeur capturée par la méthode nextLine du String vers Float pour pouvoir faire une opération
        //arithmétique avec le % car on ne peut pas multiplier un String par Float
        float salaire = 0;

        boolean siException = false;

        do {
            //Utiliser l'objet scan pour attendre que l'utilisateur saisisse la donnée (avec la touche Enter pour valider)
            String salaireUtilisateur = scan.nextLine();

            //Comme la valeur captée est de type String, il faut "try" la conversion qui peut échouer en Exception 
            //Ce n'est pas recommandé d'avoir une exception qui remonte à l'utilisateur
            //Donc il faut intervenir et faire un "catch"
        try {
            //La méthode valueOf peut exister sur d'autres types de classe, ex: String.valueOf
            salaire = Float.valueOf(salaireUtilisateur);
            siException = false;
        } catch (Exception e) {
            System.out.println("Format indéfini");
            siException = true;
        }
        }
        //Raccourci : while (SiException)
        while (siException == true);


        // boolean siQuestion = true;

        // while (siQuestion) {
        //     //Utiliser l'objet scan pour attendre que l'utilisateur saisisse la donnée (avec la touche Enter pour valider)
        //     String salaireUtilisateur = scan.nextLine();

        //     //Comme la valeur captée est de type String, il faut "try" la conversion qui peut échouer en Exception 
        //     //Ce n'est pas recommandé d'avoir une exception qui remonte à l'utilisateur
        //     //Donc il faut intervenir et faire un "catch"
        // try {
        //     //La méthode valueOf peut exister sur d'autres types de classe, ex: String.valueOf
        //     salaire = Float.valueOf(salaireUtilisateur);
        //     siQuestion = false;
        // } catch (Exception e) {
        //     System.out.println("Format indéfini");
        //     siQuestion = true;
        //     }
        // }
        //Définir le pourcentage
        double pourcentage = 0.9;

        //Appliquer l'opération arithmétique multplication entre salaire et pourcentage
        //Remarque: la multiplication entre float et double donne un type automatique double 
        double resultat = salaire * pourcentage;

        //Créer un objet anonyme de la classe Personne en faisant appel au constructeur ("new")
        Personne anonyme = new Personne();

        //Affection des attributs de l'objet anonyme
        anonyme.prenom = "Tarek";
        anonyme.nom = "Najem";
        anonyme.age = 31;
        anonyme.salaire = (float)(salaire * pourcentage);

        //Informer l'utilisateur depuis le terminal à propos de la donnée d'entrée à saisir
        System.out.println("Saisissez votre date");

        //Attendre la saisie de l'utilisateur (qui va être validé par Enter)
        String dateUtilisateur = scan.nextLine();

        //Créer un objet formatter d'une classe SimpleDateFormat
        //pour convertir la valeur String capturée du scan vers un objet d'une classe Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        //Utiliser la méthode formatter pour faire la conversion
        anonyme.dateNaissance = formatter.parse(dateUtilisateur);

        //anonyme.dateNaissance est inférieur à la date du jour
        Date dateJour = new Date();

        //if(PARAMETRE_1 OPERATEUR PARAMETRE_2)
        //getTime convertit en millisecondes les dates car les calculs de dates ne sont pas prises en compte sur ce framework

        long dateNaissanceTime = anonyme.dateNaissance.getTime();
        long dateJourTime = dateJour.getTime();

        if (dateNaissanceTime > dateJourTime) {
            System.out.println("Date naissance > Date Jour !");
            return;
        }

        //On convertir du double (résultat de l'opération précédente) vers float (la cible: le type de la propriété salaire)
        anonyme.salaire = (float) resultat;

        //La méthode valueOf existe aussi pour d'autres Types de classe
        String variableAge = String.valueOf(anonyme.age);

        //double : 5.32515151515151645454554548415121554545
        //float : 5.325151515151516

        //Refactoriser l'ancienne expression pour retourner le nom complet depuis une fonction à part
        //Appeler la fontion nommé "concatener" avec deux paramètres (anonyme.prenom, anonyme.nom)

        // String nomComplet = anonyme.prenom + " " + anonyme.nom + " " + variableAge + " " + "ans" +  " " + anonyme.salaire;

        String nomComplet = concatener(anonyme.prenom, anonyme.nom);

        //Concatener le résultat de la fonction avec age et salaire
        //Java gère automatiquement la concatenation entre String (variableAge) et float (salaire)
        String affichage = nomComplet + " " + variableAge + " " + anonyme.salaire;
        affichage = affichage + " " + formatter.format(anonyme.dateNaissance);
        System.out.println(affichage);

        //Extraire un constituant (jour ou mois ou année) d'un objet d'une classe Date à travers la classe SimpleDateFormat
        //Le constructeur de SimpleDateFormat prend le format souhaité (yyyy) en paramètre
        //Les formats possibles à utiliser sont des formats standards
        SimpleDateFormat formatterAnnee = new SimpleDateFormat("yyyy");

        //Pour l'afficher séparément à l'utilisateur
        System.out.println("Année:" + formatterAnnee.format(anonyme.dateNaissance));

        

    }

    //MODE_ACCES TYPE_RETOUR NOM_FONCTION (ARGUMENTS)
    //On définit une fonction nommée "concatener" avec deux paramètres avec un type de retour String
    static String concatener(String p1, String p2){

        //On effectue la concaténation entre les deux paramètres
        //On affecte le résultat à une nouvelle variable
        String retour = p1 + " " + p2;

        //On choisit la variable de retour
        return retour;

    }
    
    //MODE_ACCES TYPE_RETOUR NOM_FONCTION (ARGUMENTS)
    static void calculerMoyenneNotes() {
        //Créer l'objet scan de classe Scanner par le mot clé "new"
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez vos notes (ex: 13,14,17)");

        String notes = scan.nextLine();


        //String[] : taille fixe et doit être définie en déclaration de constructeur
        // String[] array = new String[5];

        //ArrayList<String> : taille modifiable
        // ArrayList<String> liste = new ArrayList<String>();

        //Transformer/Spliter la valeur unique string capturée (13,14,17) en liste
        String[] notesListe = notes.split(",");

        //Pour chaque élément "item" de la liste "notesListe" faire le bloc suivant
        for (String item : notesListe) {
            System.out.println(item);
        }
    }
}
