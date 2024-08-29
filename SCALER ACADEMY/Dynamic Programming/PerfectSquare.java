class PerfectSquare{
	public int pSquare(int n){
		int dp[] = new int[n + 1];
		if (n == 0) {
			return 0;
		}

		if (dp[n] != -1) {
			return dp[n];
		}

		dp[n] = 1;
		int ans = Integer.MAX_VALUE;

		for (int x = 1; x <= n ; x++ ) {
			ans = Math.min(ans, pSquare(n - x*x));
		}
        dp[n] += ans;
		return dp[n];
	}
	public static void main(String[] args) {
		PerfectSquare print = new PerfectSquare();
		int n = 6;
		int res = print.pSquare(n);
		System.out.println(res);
	}
}