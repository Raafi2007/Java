package objectExample;

public class StudentObject {

    public static void main(String[] args) {

        // Create a student object
        StudentClass student = new StudentClass();
        student.studentName = "Mohamed Rifai";
        student.age = 23;
        student.enrollmentId = 1438;
        student.studentLocation = "Noida";
        student.isReceivedId = true;
        student.mobileNumber = 6380660700L;

        // Display the student information
        System.out.println(student.display());
    }

}
