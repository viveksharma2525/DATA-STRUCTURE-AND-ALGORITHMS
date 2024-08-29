public class AccessModifiers {
    /*
     public 
     default
     protected
     private
     */
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1.area);

        // Square square2 = new Square(10);
        // System.out.println(square2.area);
    }
}

//Immutable 
//final
class Square{
    public final int side;
    public final int area;

    //Default constructor
    Square(){
        this(0);
        System.out.println("Default Constructor");
    }

    //Parameterized Constructor
    Square(int side){
        System.out.println("Parameterized Constructor");
        this.side = side;
        this.area = area();
    }

    private int area(){
        return side*side;
    }
}
