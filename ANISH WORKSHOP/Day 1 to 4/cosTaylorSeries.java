import java.util.Scanner;
public class cosTaylorSeries{
    /*
    cos(x)=1-x^2/2! + x^4/4! =x^6/6! + ....
    a(i)=(-1)^i*x^(2i)/(2i)!
    oscillation *= -1 initial value =1
    factor *= x^2  initial value=1
    factorial = (2i+2)(2i+2)  inotial value = 0! =1
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double theta = scanner.nextDouble();
        double result = 0;

        for( double precision =0 , oscillation =1, factor=1,factorial=1;precision<10;precision++){
            result += oscillation*factor/factorial;
            oscillation *= -1;
            factor *= theta*theta;
            factorial *= (2*precision +1)*(2*precision+2);
        }
        System.out.println(result);

    }
}