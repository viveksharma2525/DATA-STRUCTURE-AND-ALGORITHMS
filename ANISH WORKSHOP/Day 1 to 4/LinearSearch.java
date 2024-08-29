public class LinearSearch{
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5}, 4));
        System.out.println(linearSearch(new int[]{1,2,3,4,5}, 100));
        /*
        Linear Search
         {1,2,3,4} elem=3 index = 2
         {2,3,5,7,11} elem=2 index=0
         */
    }
    private static int linearSearch(int[] array,int element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
}