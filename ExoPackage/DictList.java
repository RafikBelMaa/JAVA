package ExoPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class DictList 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> motCle = new ArrayList<String>();
        ArrayList<String> motList = new ArrayList<String>();

        System.out.println("Taper votre clé :");
                
        motCle.add("Ananas");
        motCle.add("Banane");
        motCle.add("Pomme");

        motList.add("Définition Ananas");
        motList.add("Définition Banane");
        motList.add("Définition Pomme");

        String umotCle = scan.nextLine();
        Boolean cleExistant = false;

        for (int i = 0; i < motCle.size() ; i++) 
        {
            if (umotCle.equals(motCle.get(i)) )
            {
                cleExistant = true;
                String definition = motList.get(i);
                System.out.println(definition);
            }
        }

        if (cleExistant == false) 
        {
            System.out.println("Le mot clé est inexistant !");
        }

        scan.close();

    }
}
