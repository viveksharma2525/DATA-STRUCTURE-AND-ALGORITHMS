import java.util.Arrays;

public class Sorting {
    /*
    Sorting Technique
      Problem: Arrange Students in increasing of heights

      Approach 1 : 
        A = 2 5 12 1
        compare with previous index of array

        A = 1 2 5 6 12     nd new element 3 comes
        1. compare with 12 and shift it to the right direction
        2. compare with 6 nd shift it to the right direction
        3. compare with 5 and shift it to the right direction
      

       *Insertion sort*

        i,j,current
       condition:j>i applied this condition to the problem

       step 1:A = 6 2 4 1 9 

       i = j+1
       j = i -1 = 6
       arr[j+1] = arr[j]

       arr[0] =2 

       step 2 :A = 2 6 4 1 9

       i = 2 current = 4   where 2 is the index number
       j =i -1 = 1 where 1 is the index of an array
        
       is j>i no 
       arr[j+1] = arr[j]

       then do j--

       is the arr[j] > current element
       then arr[j+1] = current

       step3 : A = 2 4 6 1 9
       i= 3 current = 1
       j= i-1 = 2 

       is j>i yes

       arr[i] = arr[j]

       then j--
        
       is current > arr[j] 
       yes

       arr[j] is shifted to right position
       
       nd continuing the processes

       A= 1 2 4 6 9


       
     
    public static void main(String[] args) {
      int[] height = {6,2,4,1,9,12,5,3};

      InsertionSort(height);

      System.out.println(Arrays.toString(height));

    }
    private static void InsertionSort(int[] height){
      for(int i=0;i<height.length;i++){
        int current = height[i];
        int j = i-1;
        while (j>=0 && height[j]>current) {
          height[j+1] = height[j];
          j--;
        }
        height[j+1] = current;
      }
    }
}

// Time complexity of worst case is o(n^2)  // reverse sorted array
// Best case = o(n)  //sorted Array

// space complexity:o(1)
*/
//Apprach 2 : Selection Sort
/* 
  A = 8 4 3 1 2 5 // swap 1 nd 8
  A = 1 4 3 8 2 5 // Swap 2 nd 4
  A= 1 2 3 8 4 5 // Swap 4 nd 8
  A= 1 2 3 4 8 5 // swap 8 nd 5
  A = 1 2 3 4 5 8
 */

 /* 
 public static void main(String[] args) {
  int[] array = {2,7,4,1,5,3};
  
  SelectionSort(array);

  System.out.println(Arrays.toString(array));
 }
 private static void SelectionSort(int[] array){
  for (int i = 0; i < array.length; i++) {
    int iMin = i;     // this statement take c1 take n-1 time
    for(int j = i+1;j<array.length;j++){
      if(array[j] < array[iMin]){
        iMin = j;    // this if statement take c2 to execute
      }
    }
    int temp = array[i];
    array[i] = array[iMin];  //this 3 line of code take c3 time 
    array[iMin] = temp;       // to execute n- 1time
  }
 }



 time complexity to execute using selection sort
 T[n] = (n-1)c1 + n(n-1)/2 C2 + (n-1)c3
      = an^2 + bn + c
      = o(n^2)
 */

 /*
  Approach 3: Bubble sort: the smallest number bubble ups to the right
  position

  A = 2 5 10 3 8

  A= 5 10 3 2 8
     0 1  2 3 4

     compare with previous element of an array


     if n=5
     - We have 4 element in its right position 
     - (n-1) iteration

     I1: A = 1 5 4 3 2
     I2: A = 1 2 5 4 3
     I3: A = 1 2 3 5 4
     I4: A = 1 2 3 4 5
      
     4 Iteration
     
  

  public static void main(String[] args) {
    int[] data = {2,7,4,1,5,3,10,34,166};

    BubbleSort(data);

    System.out.println(Arrays.toString(data));

  }
  private static void BubbleSort(int[] data){
    for (int i = 0; i <=data.length-1; i++) {
      int flag  = 0;
      for(int j= data.length-1;j>=i+1;j--){
        if(data[j] < data[j-1]){
          int temp = data[j];
          data[j] = data[j-1];
          data[j-1] = temp;
          flag = 1;
        }
      }
      if(flag == 0){
        break;
      }
    }
  }
}


bubble sort
 Worst Case Time Complexity:o(n^2) (reverse sorted)
 best Case Time Complexity:o(n)  ( sorted)
 */

  //count sort: If the number of the array are in a limited range,
  // we can use count sort

  /**
   * logic of count sort
   *  In data array 
   * count Zeroes = 3
   * count Ones = 4
   * count twos = 3
   * 
   * A =  0 0 0 1 1 1 1 2 2 2
   * 
   * T[n] = o(n)
   * Space Complexity = o(1)
   * 
   * 
   * Sorting  a string
   * 
   *  char[a to z]
   * S = "c b b a a d c c b"
   * 
   * freq[26] =  [a,b,c,d,e,.......,x,y,z]
   * 
   * 
   * Q: Array element are in the range  0 to 10^6
   * 
   * Distinct Character = 10^6
   * 
   */


 /*
  Q. Count the number of inversion pair in array

  A = 1 3 2 3 1
      0 1 2 3 4

      if (i<j) and A[i] > A[j] then its an inversion pair

       let i = 1
           j = 2

        (1<2)  and  3>2 then (3,2) is an inversion pair

        Ans : A = (3,2),(3,1),(2,1),(3,1) 4 pair


      Ex 2: 4 5 1 2 7 3
      (4,1) (4,2) (4,3)
      (5,1) (5,2) (5,3)
      (7,3)           

      = 7 pairs

      brute force approach:
      for(i = 0 : i<n;i++){
        for(j=i+1;j<n;j++){
          if(A[j] < A[i]){
            count++
          }
        }
      }

      // Time complexity: o(n^2)
      // Space complexity:o(1)


       

      Q2: A1:  4 5 1
          A2:  2 7 3

          if we sort the two arrays we can find the inversion pairs in
          o(n+m) time complexity

          if the array is unsorted the inversion pairs in o(n^2) time
          complexity


        Q: A = 4 5 1 2 7 3  find the number of inversion pair in an array

        split it into two subarrays  A1 = 4 5 1      A2= 2 7 3

        let there is any function which tells us the number of inversion 
        pairs in an array A1  nd A2  which is inv1 and inv2 respectively

        total number of pairs = inv1 + inv 2 + merge_inv


  */

  //Inversion Array
  public static void main(String[] args) {
    int[] data = {3,4,6,8,9,12,14,15};
    InversionOfArray(data);

    System.out.println(Arrays.toString(data));
  }
  private static void InversionOfArray(int[]data){
    
  }



















}











