public class FunctionParameterInheritance {
    public static void main(String[] args) {
        
    }
    private static void draw(Shape shape){
    
    }
    class Shape{
        public void draw(){
            System.out.println(" i am drawing generic shape");
        }
    }
    class circle extends Shape{
        public void draw(){
            System.out.println("drwaing circle");
        }
    }
}
