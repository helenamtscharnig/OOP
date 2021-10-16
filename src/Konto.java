public class Konto {

    private String inhaber;
    private double kontostand;
    private int idNumber;
    public static int anzahlKonto = 10;

    public Konto(String inhaber){        //Methode ohne Rückgabetyp schreiben, bekommt speziellen Namen: Konstruktor
        this.inhaber = inhaber;         // Quasi Pflichtfeld, ich kann ohne einen Namen kein Konto erstellen.
        kontostand = 0;
        this.idNumber = ++anzahlKonto;

    }
    //public void setInhaber(String inhaber){
       // this.inhaber = inhaber;
       // kontostand = 0;
    //}

    public void aufbuchen(double betrag){
        if (betrag > 0){
            kontostand = kontostand + betrag;
        }
        else {
            System.out.println("Nur Werte > 0 erlaubt.");
        }
    }
    public void abbuchen (double betrag){
        if (kontostand >= betrag){
            kontostand -= betrag;
        }
        else {
            System.out.println("Nicht genügend Geld am Konto.");
        }
    }
    public void print(){
        System.out.println("ID-Number: "+idNumber+"; Kontoinhaber: "+inhaber+"; Kontostand: "+kontostand);
    }
}


