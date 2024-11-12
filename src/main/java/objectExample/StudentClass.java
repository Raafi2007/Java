package objectExample;

public class StudentClass {
    String studentName;
    int age;
    int enrollmentId;
    String studentLocation;
    boolean isReceivedId;
    long mobileNumber;

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public String getStudentLocation() {
        return studentLocation;
    }

    public boolean getIDStatus() {
        return isReceivedId;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    // Method to return "Yes" if ID is received, otherwise "No"
    public String IDStatus() {
        if (getIDStatus()) {  // if isReceivedId is true
            return "Yes";  // return "Yes" if ID is received
        } else {
            return "No";   // return "No" if ID is not received
        }
    }

    // Method to display all student information
    public String display() {
        return "Student Name: " + this.getStudentName() +
                "\nStudent Age: " + this.getAge() +
                "\nEnrollment ID: " + this.getEnrollmentId() +
                "\nLocation: " + this.getStudentLocation() +
                "\nHas received ID: " + this.IDStatus() +
                "\nMobile Number: " + this.getMobileNumber();
    }

}

