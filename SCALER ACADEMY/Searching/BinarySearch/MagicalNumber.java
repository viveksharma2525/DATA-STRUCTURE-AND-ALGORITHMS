public class MagicalNumber {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        int result = nthMagicalNumber(8, 2, 3);
        System.out.println(result);
    }
    // calculate x = mid/a + mid/b - mid/lcm(a,b)
    private static int GetMultipleCount(long num,int a , int b,int lcm){
        return (int)(num/a) + (int)(num/b) - (int)(num/lcm);
    }
    // To Calculate the lcm
    private static int Getlcm(int a , int b){
        int lcm,hcf;
        int oA = a;
        int OB = b;
        while (a!=0 && b!=0) {
            if (a>b) {
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if (a ==0 ) {
                hcf = b;
            }
            else{
                hcf = a;
            }
            lcm  = (oA*OB)/hcf;
            return lcm;
    }
    private static int nthMagicalNumber(int n,int a,int b){

         // Edge cases
         if (a == 0 || b == 0)
         return 0;

        //defining the search space
        long left = Math.min(a, b)*1;
        long right = (Math.max(a, b) * (long) n);

        int lcm = Getlcm(a, b);
        long ans = right;

        while (left<=right) {
            long mid = left +(right - left)/2;
            int factorCount = GetMultipleCount(mid, a, b, lcm);

            if (factorCount >=n) {
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (int)(ans%MOD);
    }
}
