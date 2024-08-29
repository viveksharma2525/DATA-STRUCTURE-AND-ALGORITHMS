public class NoSubarray {
    /*
     Q. Given an array of positive integers. find the max K such that
     there is no subarray of length K with sum>B.
     */
    public static void main(String[] args) {
        int [] array = {3,2,5,4,6,3,7,2};
        System.out.println(Subarray(array));
    }
    private static boolean Check(int[] array,int K,int B){
        int sum = 0;
         //first window sum  0 to K-1
        for (int i = 0; i < K-1; i++) {
            sum += array[i];
        }
        if(sum>B){
            return false;
        }

        for (int i = K; i < array.length; i++) {
            sum += array[i] = array[i-K];
            if (sum>B) {
                if (sum>B) {
                    return false;
                }
            }
            return true;
        }

        return false;
        
    }
    private static int Subarray(int[] array){
        int n =  array.length;
        int low  = 1;
        int high = n;
        int ans = 0;

        while (low<=high) {
            int mid = (high+low)/2;
            if (Check(array, mid, B)) {
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return 0;
    }
}