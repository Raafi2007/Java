package objectExample;

public class PGClass {

    String pgName;
    String pgOwner;
    int pgRent;
    String pgLocation;
    long pgMobileNumber;




    public PGClass(String pgName, String pgOwner, int pgRent, String pgLocation, long pgMobileNumber){
        this.pgName = pgName;
        this.pgOwner = pgOwner;
        this.pgRent = pgRent;
        this.pgLocation = pgLocation;
        this.pgMobileNumber = pgMobileNumber;

    }


    void displayPGDetails(){

        System.out.println("PG Name is :"+pgName);
        System.out.println("PG owner is :"+pgOwner);
        System.out.println("PG Rent is :"+pgRent);
        System.out.println("PG Location is :"+pgLocation);
        System.out.println("PG Mobile Number is :"+pgMobileNumber);
    }
}
