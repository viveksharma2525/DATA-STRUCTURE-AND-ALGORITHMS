public class OOP {
    public static void main(String[] args) {
        // Student Lakshay = new Student();
        // System.out.println(Lakshay.FirstName);
        // System.out.println(Lakshay.LastName);
        // System.out.println(Lakshay.age);

        // Lakshay.FirstName = "Lakshay";
        // Lakshay.LastName = "Sharma";
        // Lakshay.age = 22;

        // System.out.println(Lakshay.FirstName);
        // System.out.println(Lakshay.LastName);
        // System.out.println(Lakshay.age);

        // Student raj = new Student();
        // raj.FirstName = "Rajesh";
        // raj.LastName = "Parkash";
        // raj.age = 23;

        // System.out.println(raj.FirstName);
        // System.out.println(raj.LastName);
        // System.out.println(raj.age);

        // System.out.println(raj);  //here raj is an object and this line prints the address where 
        //                           // this object is created

        Circle circle1 = new Circle();
        circle1.radius = 10;

        Circle circle2 = new Circle();
        circle2.radius = 0;

        Circle circle3 = new Circle();
        circle3.radius = 4;

        System.out.println(circle1.area());
        System.out.println(circle2.area());
        System.out.println(circle3.area());
        System.out.println(circle3.perimeter());

        System.out.println(area(circle1.radius));
    }

    private static double area(double radius){
        return Math.PI * radius * radius;
    }
}

/*
 ADT: Abstract Data Type Look Like
 */
class Student{
    String FirstName;
    String LastName;
    int age;
}


class Circle{
    double radius;

    double area(){
        return Math.PI*radius*radius;
    }

    double perimeter(){
        return 2 * Math.PI*radius;
    }
}
