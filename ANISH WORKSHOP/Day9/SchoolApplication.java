/**
 * SchoolApplication
 */
public class SchoolApplication {

    public static void main(String[] args) {
        // Student anish = new Student("45e");

    Student Vivek = new Student.Builder()
        .withRollNumber("45e")
        .withName("Lakshay", "Sharma")
        .build();

    Student piyush = new Student.Builder()
       .withRollNumber("89")
       .withName("piyush", "goyal")
       .withAge(23)
       .build();

       System.out.println(piyush.rollNumber);

       System.out.println(Vivek.fullName());
    }

    
}