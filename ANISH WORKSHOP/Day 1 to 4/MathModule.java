import java.util.Scanner;
public class MathModule{
    public static void main(String[] args){
       // Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        //System.out.println(Math.max(34,-90));
        //System.out.println(Math.min(100,(Math.max(12,17)))); //function composition
        //System.out.println(Math.sqrt(9));  // Math.sqrt-> gives result in long type
        //System.out.println(Math.pow(2,3));   // Math return long types 
        //System.out.println(Math.PI);
        System.out.println(Math.random());
    }

    private static int randomInteger(int a,int b){
        return (int)Math.random()*(b-a)+a;   //expilict typecasting
    }
}