public class staticKeyword {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println(MyStudent.minAttendance);
        MyStudent.increaseAttendence();
        System.out.println(MyStudent.minAttendance);
    }
}
class MyStudent{
    static double minAttendance = 0.7;
    String firstName;
    String lastName;
    int age;

    static void increaseAttendence(){
        minAttendance +=0.04;
    }
}

class Person{
    public final static int DRIVING_AGE = 18;
    String firstName;
    String lastName;

    int age;

    boolean personCanDrive(){
        return this.age >= Person.DRIVING_AGE;
    }
}