import java.util.LinkedList;
class GenerateSubset{
	public void GenSub(int i, int n, int k, LinkedList<Integer> list, int arr[]){
		if (i == n) {
			System.out.println(list);
			return;
		}
		list.add(arr[i]);
		GenSub(i+1, n, k, list, arr);
		list.removeLast();
		GenSub(i+1, n, k, list, arr);
	}

	public static void main(String[] args) {
		GenerateSubset print = new GenerateSubset();

		int i = 0;
		int n = 3;
		int k = 7;

		LinkedList<Integer> list = new LinkedList<>();
		int arr[] = {5,-7,6};

		print.GenSub(i, n, k, list, arr);

	}
}