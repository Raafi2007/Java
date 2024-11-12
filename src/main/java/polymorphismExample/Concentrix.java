package polymorphismExample;

public class Concentrix extends Company{



    @Override
    public void getSalaryDetails(){
        System.out.println("Salary Was 31,000 in Concentrix" );
    }

    @Override
    public void getManagerName(){
        System.out.println("Manager was Haris Roshan");
    }
}
