package polymorphismExample;

public class MethodOverloadingObject {


    public static void main(String[] args) {
        // Calling method by passing
        // input as in arguments

        //Multiply
        System.out.println(MethodOverloadingClass.Multiply(2, 4));
        System.out.println(MethodOverloadingClass.Multiply(5.5, 6.3));

        //Add
        System.out.println(MethodOverloadingClass.Add(2, 4));
        System.out.println(MethodOverloadingClass.Add(2, 7, 3));
    }
}