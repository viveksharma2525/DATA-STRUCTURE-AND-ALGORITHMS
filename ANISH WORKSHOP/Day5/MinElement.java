public class MinElement{
    public static void main(String[] args) {
        System.out.println(minumum(new int[] {22,34,55,-199,40000}));
    }
    private static int minumum(int[] array){
        int min = Integer.MAX_VALUE;
        for(int element:array){
            if(element < min){
                min = element;
            }
        }
        return min;
    }
}