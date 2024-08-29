import java.util.Scanner;
public class patternQ10{
    /*
    A
    A B A
    A B C B A
    A B C D B A
    increasing: (A,A+i)
    decreasing: (A+i-1,A)
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i=0; i<rows; i++){
            for(char character='A'; character <= 'A'+i; character++){
             System.out.print(character + " ");
            }

            //explicit typecasting System.out.print((int)character + " ");
            for(char character =(char)('A'+ i-1); character >= 'A';character--){
                System.out.print(character + " ");
            }

            System.out.println();
        }
        
    }
}