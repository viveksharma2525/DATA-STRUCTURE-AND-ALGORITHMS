/*
 1. Quick sort
 2. Bucket sort
 3. Radix sort
 4. problem on bucket sort

 Q1: Given an array of integer,rearrange the array such that array
 the last element is in the correct position of a sorted array

 1. All the elements lesser than it should be left 
 2. All the elements greater than it should be right position

 A = 5 1 6 2 7 4
 S(A) = 1 2 4 5 6 7

 - Before sorting the array the array the last element is 4
   After sort the array 4 is in index 2 of an array the no.
   lesser than of it is left of it. and greater one is right.
   of it.

   Approach 1: sort the array
   Time complexity:o(nlogn)   //use merge sort the sort the array

   Approach 2 : sort the array is quick sort

   A = 5 1 6 2 7 4

   Step1 : find the no. of elements smalller than 4(A[n-1)=2. //o(n)
   Step2: A = 5 1 4 2 7 6
              0 1 2 3 4 5 


Pseudo code

//quick sort has better space complexity

 Choices for Pivot
 1.Last element:Array[high];
 2.first element: Array[Low];
 3.Random element
 4.median of 1st ,middle and Last element

 Best Case                         Worst Case
 - when the pivot is median      -  when the pivot is smallest or 
    of the array                     largest
T[n] =  o(nlogn)                   T[n] = o(n^2)


Average case Time Complexity

*/


import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] data = {5,1,6,2,7,4};

        quicksort(data,0,data.length-1);

        System.out.println(Arrays.toString(data));
        
    }
    private static void quicksort(int[] data,int Low,int High){
        Low = 0;
        High = data.length-1;
        int index = Partition(data,Low,High);
        if (Low>=High) { // base case for recurision
          
        quicksort(data,Low,index-1); // recursive call
        quicksort(data, index+1, High);
        }
    }

    // This function make the pivot element to the right position
    private static int Partition(int[] data,int Low,int High){
        int Pivot = data[High];
        int index = Low-1;

        // To find the last element in an array
        
        for (int j = Low; j < High; j++) {
            if (data[j] < Pivot) {
                index++;
                int temp = data[index];
                data[index] = data[j];
                data[j] = temp;
            }
        }

        int temp = data[index + 1];
        data[index + 1] = data[High];
        data[High] = temp;

        return index + 1;
        
        
        }

            
        }



 

/* 
//chatgpt code 

    import java.util.Arrays;

    public class QuickSort {
        public static void main(String[] args) {
            int[] data = {5, 1, 6, 2, 7, 4};
    
            quicksort(data, 0, data.length - 1);
    
            System.out.println(Arrays.toString(data));
        }
    
        private static void quicksort(int[] data, int low, int high) {
            if (low < high) {
                int index = partition(data, low, high);
                quicksort(data, low, index - 1);
                quicksort(data, index + 1, high);
            }
        }
    
        private static int partition(int[] data, int low, int high) {
            int pivot = data[high];
            int i = low - 1;
    
            for (int j = low; j < high; j++) {
                if (data[j] < pivot) {
                    i++;
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
    
            int temp = data[i + 1];
            data[i + 1] = data[high];
            data[high] = temp;
    
            return i + 1;
        }
    }
    

    T[n] = Time for sorted ana array of size n

    Average case = 

*/

// why quick sort is better than merge sort
// 1.Space Complexity of merge sort : o(n)
//   Space Complexity of quick sort : o(nlogn)
//  2. Locality of Reference
//     merge: Random access
//     quick sort: Sequential access(Better Caching)


/*
 - HeapSort: o(nlogn)

 - Quicksort is seen to perform better than merge sort and heap sort

 Tim_sort = Quicksort(merge sort) + insertion sort + 

 */