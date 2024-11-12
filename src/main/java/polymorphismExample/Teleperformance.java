package polymorphismExample;

public class Teleperformance extends Company {


    @Override
    public void getSalaryDetails(){
        System.out.println("Salary Was 33,000 in Teleperformance" );
    }

    @Override
    public void getManagerName(){
        System.out.println("Manager was Taukri Khan");
    }
}

