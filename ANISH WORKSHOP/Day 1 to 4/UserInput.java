//syntax->import java.util.Scanner
import java.util.Scanner;

public class UserInput{
    public static void main(String[]args){
        //ADT non-primitive
        //Scanner scanner= new Scanner(System.in);
        //String firstName=scanner.nextLine();
        //String lastName=scanner.nextLine();

        //string concatenation
        //System.out.println(firstName + " "+lastName);

        //int number=scanner.nextInt();
        //System.out.println(number+10);

        //character value input
        //char character=scanner.next().charAt();
        //System.out.println(character);

        //String message="+-/){[]}"

        //Increment Opeartor 
        int i=10;
        i++; //i=i+1; post increment operator
        System.out.println(i);
        ++i; //prefix increment operator
        System.out.println(i);

        System.out.println(i++);
        System.out.println(++i);
        
        int a=0;
        System.out.println(a+a++ + ++a + a++ +a);
        System.out.println(a);

        //Decrement operator
        a--;//a=a-1; postflix decrement
        --a; //prefix decrement;

        a=5;
        System.out.println(a + a-- + a++ + --a + -a+ -2 *a); //dry run 
        //a=5|5+
    }
}