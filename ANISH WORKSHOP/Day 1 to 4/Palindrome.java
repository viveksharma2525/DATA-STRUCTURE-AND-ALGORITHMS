import java.util.Scanner;
public class Palindrome {
    private static final Scanner scanner = new Scanner(System.in);
    /*
     mom
     nan
     a
     aaa
     nitin
     {1,2,2,1} true

     
     */
    public static void main(String[] args) {
        int length = scanner.nextInt();
        int [] array = getArray(length);
        System.out.println(isPalindrome(array));
    }
    private static boolean isPalindrome(int[] array){
        for(int i = 0;i<array.length/2;i++){
            if(array[i] == array[array.length - i]){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
