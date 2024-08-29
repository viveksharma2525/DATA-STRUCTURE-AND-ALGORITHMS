// import java.util.Scanner;
public class BasicArray {
    /*
     * return number of zeroes
     * print number of even elements
     * print number of odd elements
     */
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,0,0};
        System.out.println(numberZeros(data));
    }
    private static int numberZeros(int[] data){
        System.out.println(numberOfEven(data));
        System.out.println(numberOfOdd(data));
        return numberOfZeros(data);
    }
    private static int numberOfEven(int[] data){
        int even = 0;
        for(int element:data){
            if(element%2==0){
                even++;
            }
        }
        return even;
    }
    private static int numberOfOdd(int [] data){
        int odd = 0;
        for(int element:data){
            if(element%2!=0){
                odd++;
            }
        }
        return odd;
    }
    private static int numberOfZeros(int[] data){
        int zeros = 0;
        for(int element:data){
            if(element == 0){
                zeros ++;
            }
        }
        return zeros;
    }
}
