/**
 * Interfaces: what class can do which is extends from
 */
public class Interfaces {
    public static void mian(String[] args){
    }
    private static void complexAlgorithm(Morphable morphable){
        // circle.grow(10);
        // circle.shrink(5);
        // circle.rotatAntiClockWise(98);
        // circle.rotatClockWise()

        morphable.shrink(10);
        morphable.grow(2);
    }
}

interface Rotatable{
      void rotatClockWise();
      void rotatAntiClockWise();
}

interface Morphable{
    void grow(int factor);
    void shrink(int factor);
}

abstract class Shape{
    abstract void draw();
}

class MycircleAwesome extends Shape implements Morphable,Rotatable{
    public void rotatClockWise(double theta){

    }
    public void rotatAntiClockWise(double theta){

    }
    public void grow(int factor){

    }
    public void shrink(int factor){

    }
}
