public class ProductAllElements {
    public static void main(String[] args){
        System.out.println("The Product of an array is " + product(new int[] {1,2,3,4}));
    }
    /*
      {1,2,3,4} -> 24
      {90,0} --> 0
     */
    private static int product(int[] array){
        int result = 1;
        for(int element:array){
            result *= element;
        }
        return result;
    }
}
