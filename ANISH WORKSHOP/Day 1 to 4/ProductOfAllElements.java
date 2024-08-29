public class ProductOfAllElements {
    public static void main(String[] args) {
       /*
       {1,2,3,4} --> 1.2.3.4 =40
       {90,0} --> 90.0 = 0
       */ 
      System.out.print((product(new int[]{1,2,3,6})));
    }
    private static int product(int[] array){
        int result = 1;
        for(int element:array){
            result *= element;
        }
        return result;
    }   
}
