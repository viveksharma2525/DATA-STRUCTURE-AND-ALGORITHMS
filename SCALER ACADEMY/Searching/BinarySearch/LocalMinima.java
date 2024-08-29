

// find the local minima using binary search distinct elements

public class LocalMinima {
    public static void main(String[] args) {
        int[] array = {9,8,3,7,6,4,1,5};
        int result = minima(array);

        System.out.println(result);
    }
    private static int minima(int[] array){
        int n = array.length;
        //base cases or edge cases
        if (n==1) {
            return 0;
        }
        else if(array[0]<array[1]){
            return 0;
        }
        else if(array[n-1]<array[n-2]){
            return -1;
        }

        //define search space
        int low = 1;
        int high = n-2;

        //main case
        while (low<=high) {
            int mid = (low+high)/2;

            //hadle case 1
            if(array[mid-1]>array[mid]  && array[mid+1]>array[mid]){
                return mid;
            }

            //handle case2
            else if(array[mid-1]>array[mid]){
                low = mid + 1;
            }

            //handle case 3 and 4
            else{
                high = mid -1 ;
            }
        }
        return -1;
    }
}
