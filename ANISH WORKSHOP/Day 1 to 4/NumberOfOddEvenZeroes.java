public class NumberOfOddEvenZeroes {
    public static void main(String[] args) {
        System.out.println(numberZeros(new int[]{1,2,0,-90,-56,0,0}));
    }
    private static int numberZeros(int[] array){
        System.out.println(numberOfEven(array));
        System.out.println(numberOfOdd(array));
        return numberOfZero(array);
    }
    private static int numberOfEven(int[] array){
        int even = 0;
        for(int element:array){
            if(element % 2 == 0){
                even++;
            }
        }
        return even;
    }
    // private static int numberOfOdd(int[] array){
    //     int Odd = 0;
    //     for(int element:array){
    //         if(element%2 == 1){
    //             Odd++;
    //         }
    //     }
    //     return Odd;
    private static int numberOfOdd(int[] array){
        return array.length - numberOfEven(array);
    }
    private static int numberOfZero(int[] array){
        int Zeros = 0;
        for(int element:array){
            if(element == 0){
                Zeros ++;
            }
        }
        return Zeros;
    }
}
