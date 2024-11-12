package polymorphismExample;

public class Infoedge extends Company{


    @Override
    public void getSalaryDetails(){
        System.out.println("Salary Was 55,000 in Infoedge" );
    }

    @Override
    public void getManagerName(){
        System.out.println("Manager was Lalit sharma");
    }
}

