public class Person {

    public String firstname;
    public String lastname;
    public int age;
    public String gender;
    public String nationality;
    public int yearOfBirth;

    public void print(){
       //Ich brauche keine Parameter anzugeben, damit das ausgegeben wird.
        System.out.println(firstname+" "+lastname+", "+age+" Jahre");
        // Damit hat die Klasse auch ein Verhalten bekommen - sie kann etwas machen :)
    }

}
