import java.util.Arrays;
class GenPermutation{
	public void GenPer(int i, int n, int arr[]){
		if (i == n) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int l = i; l<n ; l++){
			int temp = arr[i];
			arr[i] = arr[l];
			arr[l] = temp;

			GenPer(i+1, n, arr);

			temp = arr[i];
			arr[i] = arr[l];
			arr[l] = temp;
		}
	}
	public static void main(String[] args) {
		GenPermutation print = new GenPermutation();

		int i = 0;
		int n = 3;

		int arr[] = {4, 5, 7};
        print.GenPer(i, n , arr);
	}
} 