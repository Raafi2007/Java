package polymorphismExample;

public class MethodOverrideAnimal {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myAnimal.sound();
        myCat.sound();
        myDog.sound();
    }
}
