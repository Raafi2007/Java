package encapsulationExample;

public class PersonObject {

    public static void main(String[] args)
    {
        // person object created
        PersonClass person = new PersonClass();
        person.setName("Mohamed Rifai");
        person.setAge(23);

        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
