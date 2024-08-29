import java.util.Scanner;
public class sinTaylorSeries{
    /*
    sinx=x-x^3/3!+x^5/5!-x^7/7! +..........
    a(i)=oscillation+factor(x)/factorial
    oscillation*=-1
    factor *=x^2
    factorial *= (2i+1)*2i
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double theta = scanner.nextDouble();
        double result=0;

        for(double precision=0, oscillation = 1,factor =theta, factorial=1; //--> instantiaton
        precision<30 //condition;
        precision++,oscillation*=-1,factor *=theta*theta,
        factorial *= (2*precision+1)*(2*precision){    //updation
            double a_i = oscillation * factor / factorial;
            result += a_i;
            }
        System.out.println(result);

    }
}