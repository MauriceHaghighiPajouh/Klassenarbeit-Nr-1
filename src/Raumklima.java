//Scanner import
import java.util.Scanner;
//mainklasse
public class Raumklima {
    public static void main(String[] args) {
//Init messwert und ausgabe
        double messwert;
        String ausgabe;
// Scanner init eingang
        CO2_Messung test = new CO2_Messung();
        Scanner scan = new Scanner(System.in);
//Print line beim starten des programms
        System.out.println("Zur Analyse bitte den gemessenen Wert eingeben");

//Init was die eingabe zu bedeuten hat und was ausgegeben wird
        messwert = scan.nextDouble();
        ausgabe = test.pruefe(messwert);
        System.out.println(ausgabe);
//scanner schließen
        scan.close();

//klasse schließen
    }
}
