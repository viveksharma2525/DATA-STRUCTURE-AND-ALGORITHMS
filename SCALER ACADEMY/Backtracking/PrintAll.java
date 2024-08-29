class PrintAll{
    public void printAll(int i, int n, int ans[]){
		if( i == n){
			for (int j = 0;j<n ;j++ ) {
				System.out.print(ans[j] + " ");
			}
			System.out.println();
			return;
		}
		ans[i] = 1;
		printAll(i+1, n, ans);
		ans[i] = 2;
		printAll(i+1, n, ans );
	}
	public static void main(String[] args) {
		PrintAll print = new PrintAll();

		int i = 0;
		int n = 3;
        
        int ans[] = new int[n];

        print.printAll(i, n, ans);
        
	}
}