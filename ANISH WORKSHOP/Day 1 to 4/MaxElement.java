public class MaxElement {
    public static void main(String[] args) {
        //representing infinity
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(maximum(new int[]{1,2,3,4}));
        /*
            {1,2,3,4,5} -->5
            {} --> infinity
         */

         // To update array we don't use foreach Loop

    }
    private static int maximum(int[] array){
        int max = Integer.MIN_VALUE;
        for(int index = 0; index < array.length;index++){
            if(array[index]>max){
                max  = array[index];
            }
        }
        return max;
    }
}
