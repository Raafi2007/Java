package polymorphismExample;

public class MethodOverrideCompany {


    public static void main(String[] args) {
        Company cp;

        System.out.println("-------------------------------------");
        cp = new Concentrix();
        cp.getSalaryDetails();
        cp.getManagerName();

        System.out.println("-------------------------------------");


        cp = new Teleperformance();
        cp.getSalaryDetails();
        cp.getManagerName();

        System.out.println("-------------------------------------");


        cp = new Infoedge();
        cp.getSalaryDetails();
        cp.getManagerName();

        System.out.println("-------------------------------------");






    }
}
