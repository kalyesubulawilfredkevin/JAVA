import java.time.Year;

class Person {
    String name;
    int birthYear;

    // parameterized constructor
    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    // parameter less
    Person() {
        name = "KEVINWILFRED";
        birthYear = 2005;
    }

    // method calculate age
    int calculateAge(int birthYear) {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    //method print person details
    void personDetails() {
        int age = calculateAge(this.birthYear);
        System.out.println("Hello " + name + ", you were born in\n" + birthYear + "\nand your current age is \n" + age);
    }
}

public class PersonApp{
    public static void main(String[] args){

        //objects using parameterized constructor
        Person p1 = new Person("Kevin", 1876);
        p1.personDetails();
        Person p2 = new Person("mark", 2000);
        p2.personDetails();
        Person p3 = new Person("Ana", 2004);
        p3.personDetails();

        // parameter-less
        Person p4 = new Person();
        p4.personDetails();
        Person p5 = new Person();
        p5.personDetails();
    }
}
