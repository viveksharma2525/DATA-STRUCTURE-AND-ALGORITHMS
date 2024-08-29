public class MaxElement {
    public static void main(String[] args) {
        System.out.println(maxium(new int[] {3,5,6,7,220,13,44}));
        // System.out.println(Integer.MIN_VALUE); // negative infinity
        // System.out.println(Integer.MAX_VALUE); //positive infinity

        System.out.println(maxium(new int[] {-100,-100000,-100000000}));
    }
    /*
     {1,2,3,4,5}
     {-1,-2,-3}
     */

    private static int maxium(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            else{
                return max;
            }
        }
        return max;
    }
}
