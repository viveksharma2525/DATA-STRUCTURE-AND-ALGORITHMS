public class Car extends Vehicle{
    public static void main(String[] args) {
        Car(){
            super(4);
        }
        Car(String model, String brand){
            this();
        }
    }
}
