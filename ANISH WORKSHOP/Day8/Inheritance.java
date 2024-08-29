import java.util.Scanner;

/**
 * Inheritance
 */
public class Inheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square1 = new Square(10);
        Square square2 = new Square(20);

        circle.helloWorld();

        // System.out.println(square1.equals(square2));
        // String hello = "hello"  + "1";
        // System.out.println("hello1" == hello);

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(string == "hello"); // here check the address of the string

    }
    private static class Shape{
        double area;
        double perimeter;


        // final methods cannot be overriden
        final void helloWorld(){
            System.out.println("hello World: Shape");
        }
    }
    // Circle - base class
    // Shape - parent class
    private static class Circle extends Shape{
        int radius;

        //override
        // void helloWorld(){
        //     System.out.println("hello World Circle");
        // }
    }
    private static class Square extends Shape{
        int side;

        Square(int side){
            this.side = side;
        }
        public int hashcode(){
            return 0;
        }

        }
}