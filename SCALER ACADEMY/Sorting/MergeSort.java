import java.util.Arrays;
public class MergeSort {
    /*
     merge sort - o(nlogn) in worst case
     
     Prequities of merge sort

     A= 2 4 1 6 8 5 3 7

     break it is into sub-problem

     A = 2 4 1 6 8 5 3 7   A = LA+RA

     LA=2 4 1 6          RA= 8 5 3 7
     sorted= 1 2 4 6    sorted= 3 5 7 8
     Left Array           Right Array
      

     pseudo code for merge sort

      mergeSort(A){
        n = array.length;
        if(array.length<2){    // base condition for recursive call
          return
        }else{
          mid = (array.length)/2
          Left[] = size of mid
          Right[] =size of [(array.length)-mid]
        }
        for(int i = 0; i<mid-1;i++){
          left[i] = A[i];
        }
        for(int j = mid;j<array.length-1;j++){
          Right[i-mid] = A[i]
        }
      }
       mergesort(left)
       mergesort(right)           // recursive call when function calls itself inside the function is called recurisve call
       mergesort(left,right,Array)
      }

	  */
     
    public static void main(String[] args) {
      int[]data  = {2,3,4,5,6,7,8,19,45,36,74,77};

	  mergeSort(data);

      System.out.println(Arrays.toString(data));
    }

	// function to divide and conquor
    private static void mergeSort(int[] data){
      int N = data.length;
      if (N<2) {            //base condition
        return;
      }
      int mid = N/2;
      int[] Left = new int[mid];
      int[] Right = new int[N-mid];

    //   for (int i = 0; i <mid-1; i++) {
    //     Left[i] = data[i];
    //   }
    //   for (int i = mid; i < data.length-1; i++) {
    //     Right[i-mid] = data[i];
    //   }

	System.arraycopy(data,0,Left,0,mid);
	System.arraycopy(data,mid,Right,0,data.length-mid);
       
	  //recurisvely sort the two halves
      mergeSort(Left);
      mergeSort(Right);
      merge(data,Left,Right);

    }

	// function to merge the array
	private static void merge(int[] result,int[] Left,int[] Right){
		int i = 0,j=0,k=0;
		while (i<Left.length && j<Right.length) {
			if (Left[i] <= Right[j]) {
				result[k++] = Left[i++];
			}
			else{
				result[k++] = Right[j++];
			}
		}

		while (i<Left.length) {
			result[k++] = Left[i++];
		}

		while (j<Right.length) {
			result[k++] = Right[j++];
		}
	}
}

/* 
// Java program for Merge Sort 

// Driver Class 
class MergeSort { 
	// Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	void merge(int arr[], int l, int m, int r) 
	{ 
		// Find sizes of two subarrays to be merged 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		// Create temp arrays 
		int L[] = new int[n1]; 
		int R[] = new int[n2]; 

		// Copy data to temp arrays 
		for (int i = 0; i < n1; ++i) 
			L[i] = arr[l + i]; 
		for (int j = 0; j < n2; ++j) 
			R[j] = arr[m + 1 + j]; 

		// Merge the temp arrays 
		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarray array 
		int k = l; 
		while (i < n1 && j < n2) { 
			if (L[i] <= R[j]) { 
				arr[k] = L[i]; 
				i++; 
			} 
			else { 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		// Copy remaining elements of L[] if any 
		while (i < n1) { 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		// Copy remaining elements of R[] if any 
		while (j < n2) { 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 

	// Main function that sorts arr[l..r] using 
	// merge() 
	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) { 
			// Find the middle point 
			int m = (l + r) / 2; 

			// Sort first and second halves 
			sort(arr, l, m); 
			sort(arr, m + 1, r); 

			// Merge the sorted halves 
			merge(arr, l, m, r); 
		} 
	} 

	// A utility function to print array of size n 
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = { 12, 11, 13, 5, 6, 7 }; 

		System.out.println("Given Array"); 
		printArray(arr); 

		// Calling of Merge Sort 
		MergeSort ob = new MergeSort(); 
		ob.sort(arr, 0, arr.length - 1); 

		System.out.println("\nSorted array"); 
		printArray(arr); 
	} 
}
*/