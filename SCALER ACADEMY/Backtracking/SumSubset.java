class SumSubset{
    public int Sum(int i, int n, int arr[], int sum, int k){
		if (i == n) {
			if (sum == k) {
				return 1;
			}
			else{
				return 0;
			}
		}
        sum += arr[i];
		int x = Sum(i+1, n , arr, sum, k);
		sum -= arr[i];
		int y = Sum(i+1, n , arr, sum, k);

		return x+y;
	}
	public static void main(String[] args) {
		SumSubset print = new SumSubset();

		int i = 0;
		int n = 3;
		int k = 7;
		int sum = 0;

		int arr[] = {5, -2, 9};

		int res = print.Sum(i, n, arr, sum, k);

		System.out.println("The Sum is : " + res);
	}
}