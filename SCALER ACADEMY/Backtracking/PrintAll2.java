class PrintAll2{
	public void PrintAll(int i, int n, int ans[]){
		if (i == n) {
			for (int j=0;j<n;j++) {
				System.out.print(ans[j] + " ");
			}
			System.out.println();
			return;
		}
		for (int x=0; x<=5; x++) {
			ans[i] = x;
			PrintAll(i+1, n, ans);
		}
	}
	public static void main(String[] args) {
		PrintAll2 print = new PrintAll2();

		int i = 0;
		int n = 5;

		int ans[] = new int[n];

		print.PrintAll(i, n, ans);
	}
}