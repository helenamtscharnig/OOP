public class KontoDemoApp {

    public static void main(String[] args) {
        Konto K01 = new Konto();
        K01.setInhaber("Max Mustermann");
        K01.print();

        K01.aufbuchen(1000);
        K01.print();

        K01.abbuchen(100);
        K01.print();

        K01.abbuchen(300);
        K01.print();                //durchüberlegen: Warum muss ich hier kein sout machen? Generell Struktur

        K01.abbuchen(700);

        K01.aufbuchen(100000);
        K01.print();


    }
}
