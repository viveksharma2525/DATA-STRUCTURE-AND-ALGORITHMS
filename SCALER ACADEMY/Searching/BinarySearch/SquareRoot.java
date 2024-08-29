public class SquareRoot {
    public static void main(String[] args) {
        int result = squareRoot(4);
        System.out.println(result);        
    }
    private static int squareRoot(int x){
        if (x == 0 || x == 1)
            return x;

        long start = 1;
        long end = x;

        long ans = 0;

        while (start<=end) {
        long mid = (start+end)/2;

        if (mid*mid  == x){
            return (int)mid;
        }
        else  {
            if (mid*mid<x) {
                ans= mid;
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        }
        return (int)ans;
    }
}
