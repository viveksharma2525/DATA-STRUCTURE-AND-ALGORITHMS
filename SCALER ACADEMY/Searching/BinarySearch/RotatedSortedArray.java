public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] array = {5,8,10,14,18,23,-15,-9,-6,0,2};
        int result = SearchingK(array);
        System.out.println(result);
    }
    private static int SearchingK(int [] array){
        int n = array.length;
        int Target = -6;

        //search space
        int low = 0;
        int high = n-1;

        while (low<=high) {
            int mid = (high+low)/2;
            if (array[mid] == Target) {
                return mid;
            }

            else {
                if (array[0]<=array[mid]) {
                    //left part of an array
                    if (array[0]<=Target && Target<array[mid]) {
                        high = mid-1;
                    }
                    else{
                        low = mid +1;
                    }
                }
                else if (array [0]>array[mid]) {
                    //right part of an array 
                    if (Target>array[mid] && Target<=array[n-1]) {
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}