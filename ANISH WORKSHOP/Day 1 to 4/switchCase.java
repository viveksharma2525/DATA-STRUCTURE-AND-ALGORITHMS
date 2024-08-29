import java.util.Scanner;
public class switchCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // finite no. of sets
        switch(n){
            case 0:
                System.out.println("this is not valid");
                break;
            case -1:
                System.out.println("not allowed");
                break;
            case 100:
                System.out.println("okay will do");
            default:
                System.out.println("not any cup of tea");
        }
    }
}