//fachklasse
public class CO2_Messung {

    //Init grenzwert
    private double grenzwert;

    //Konstruktor
    public CO2_Messung() {
        this.grenzwert = 1000;
    }

    //Methode/funktion je nach messwert
    //Messwert über 1500: "IF" wird ausgeführt.
    //Messwert über 1000: "ELSE IF" wird ausgeführt
    //Messwert unter 1000 : "ELSE" wird ausgeführt.
    public String pruefe(double messwert) {
        String ausgabe;


        if (messwert>grenzwert+500){
            ausgabe= "Grenzwert:" + this.grenzwert +
                    "\nMesswert:" + messwert +
                    "\nAchtung,Messwert beachtlich hoch, Luftqualität sehr schlecht.";

        }
       else  if (messwert >this.grenzwert) {
            ausgabe = "Grenzwert:" + this.grenzwert +
                    "\nMesswert:" + messwert +
                    "\nAchtung,Messwert außerhalb der Toleranzen";

        } else {
            ausgabe = "Grenzwert:" + this.grenzwert + "\nMesswert:" + messwert +
                    "\nMesswert i.O";
        }
        //Rückgabewert an die mainclass
        return ausgabe;
    }
// schließung fachklasse
}
