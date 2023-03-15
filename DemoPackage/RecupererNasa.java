package DemoPackage;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecupererNasa {
    
    public static void main(String[] args) {
        System.out.println("Quel est votre destination ? ");

        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        getJSON();
    }

    static String getJSON() {
        String jsonString = "";

        try {
            String key = "FWroo2achZr9nam197RZnLbI0v7Naj80DbdOyGXt";
            URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=" + key);

            // Open Connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Get Byte from Connection
            InputStreamReader fluxDonnee = new InputStreamReader(connection.getInputStream());

            // Convert Byte stream to String stream
            BufferedReader fluxExtractionDonnee = new BufferedReader(fluxDonnee);

            String nextline;
            while ((nextline = fluxExtractionDonnee.readLine()) != null) {
                jsonString = jsonString + nextline;
            }
            fluxExtractionDonnee.close();
            fluxDonnee.close();
    }
    catch ( Exception exception){
    }
    System.out.println(jsonString);

    return jsonString;


}
}
   
        
