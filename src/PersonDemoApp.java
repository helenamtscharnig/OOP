public class PersonDemoApp {
    public static void main(String[] args) {
        Person PN001 = new Person();
        PN001.firstname = "Hugo";
        PN001.lastname = "Boss";
        PN001.age = 24;
        PN001.gender = "male";

        Person PN002 = new Person();
        PN002.firstname = "Max";
        PN002.lastname = "Mustermann";
        PN002.age = 39;
        PN002.gender = "male";

        Person PN003 = new Person();
        PN003.firstname = "Louis";
        PN003.lastname = "Vuitton";
        PN003.age = 82;
        PN003.gender = "male";

        System.out.println(PN002.firstname+" "+PN002.lastname+", "+PN002.age+" Jahre");
        System.out.println(PN001.firstname+" "+PN001.lastname+", "+PN001.age+" Jahre");
        System.out.println(PN003.firstname+" "+PN003.lastname+", "+PN003.age+" Jahre");

        System.out.println("_____");

        printPerson(PN001);
        printPerson(PN002);
        printPerson(PN003);

        System.out.println("_____");

        //Ideal wäre es, wenn sich die Class selbst ausgibt.
        PN001.print();
        PN002.print();
        PN003.print();

        System.out.println("_____");

    }

    public static void printPerson (Person p) {     //Methode erstellen, um nicht jedes Mal sout machen zu müssen.
        System.out.println(p.firstname+" "+p.lastname +", "+p.age+" Jahre");
        //woher kommt das kleine "p"? Von "Person p"...
    }


}
