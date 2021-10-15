public class CarDemoApp {
    public static void main(String[] args) {

        int number = 7;
        String numberString = "Seven";

        Car golf5_G876TU = new Car(); //mit dieser Zeile erstelle ich aus der Class ein neues Objekt
        Car fiatPanda_G123RU = new Car();

        golf5_G876TU.manufacturer = "Volkswagen";
        golf5_G876TU.model = "Golf V";
        golf5_G876TU.horsePower = 90;
        golf5_G876TU.colour = "black";
        golf5_G876TU.co2Emission = 300;

        fiatPanda_G123RU.manufacturer = "Fiat";
        fiatPanda_G123RU.model = "Panda";
        fiatPanda_G123RU.horsePower = 75;
        fiatPanda_G123RU.colour = "red";
        fiatPanda_G123RU.co2Emission = 120;

        Car golf5_GU123GU = new Car();
        golf5_GU123GU.colour = "blue";
        golf5_GU123GU.manufacturer = "Volkswagen";
        golf5_GU123GU.model = "Golf V";
        golf5_GU123GU.productionYear = 2020;
        golf5_GU123GU.co2Emission = 220;
        golf5_GU123GU.horsePower = 120;

        System.out.println("Golf aus Graz "+golf5_G876TU.model);
        System.out.println("Golf aus GU "+golf5_GU123GU.colour);
        System.out.println("Fiat aus Graz "+fiatPanda_G123RU.horsePower);
    }
}
