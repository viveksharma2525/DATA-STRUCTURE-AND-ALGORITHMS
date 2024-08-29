// import java.util.Scanner;
// // import java.util.Arrays;
// // /*
// //     Subarray:Continous part of an array
// //         1. Complete array is subarray of itself.
// //         2. Single element of array is also subarray.
// //         3. empty subarray is not  valid
        
// //         A: 3 4 5 6 -2 8 10
// //         3,5,6  no
// //         -2  yes
// //         8,10 yes

// //          Subarray can be defined as 
// //          start and end
// //          A :  4 2 10 3 12 -2 15
// //  */



// public class Subarrays {
//     public static void main(String[] args) {
//         // Print all values of a subarray
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Give the length of an array:");
//         int length = scanner.nextInt();
//         // int array[] = {4,2,10,3,12,-2,15};
//         // int Start = 2;
//         // int End = 5;
//         // for (int i=Start; i<=End; i++) {
//         //     System.out.print(array[i] + " ");
//         // }
        
//        //Sum of all elements of Subarray

//         int[] originalArray = new int[length];
//         for (int index = 0; index < originalArray.length; index++) {
//             originalArray[index] = scanner.nextInt();
//         }
//         System.out.println("Starting index of Subarray: ");
//         int Start = scanner.nextInt();
//         System.out.println("Ending index of Subarray: ");
//         int End = scanner.nextInt();
//         System.out.println("The Sum of Subarray is "+sumSubarray(originalArray, Start, End));
//     }
//     private static int sumSubarray(int originalArray[],int Start,int End){
//         int sum = 0;
//         for (int i = Start; i <= End; i++) {
//             sum = sum + originalArray[i];
//         }
//         return sum;
//     }
//   }
// //    // *********************************************************************************************

// // /*
// //   OPTIMIZED CODE OF ABOVE QUESTION:
   
// //   Q2 optimized using prefix
// //     sum of allsubarray
// //  */



// //  //-------------------------------------------------------------------------------


// //  /*
// //   q6 (Google.facebook)Given an array. find the sum of all subarrays sums.
// //   A:     10 20 30
// //   index:  0  1  2
    
// //   Bruteforce approach
// //             sum
// //     0,0      10
// //     0,1      30
// //     0,2      60
// //     1,1      20
// //     1,2      50 
// //     2,2      30

// //     Sum = 3 a[0] + 4a[1] + 3a[2]

// //     What is multiplier?
// //     -> Number of Subarrays contains this number
  
// //   */
// //    int [] array = {10,20,30};
// //    System.out.println(SOPSubArray(array));
// // }
// //  private static int SOPSubArray(int array[]){
// //  int Total_Sum = 0;
// //   for (int start = 0; start < array.length; start++) {
// //     int sum = 0;
// //     for (int end = start; end < array.length; end++) {
// //         sum += array[end];
// //         Total_Sum += sum;
// //     }
// //   }
// //   return Total_Sum;
// //  }
// // }

// // /**
// //   Use of prefix sum
// //   s= starting index 
// //   e = ending index
// //   for(s=0;s<n;s++){
// //     for(e=s;e<n;e++){
// //       int sum = sumsubarray(A,S,E)
// //       sop(sum);
// //     }
// //   }


// //   prefix sum
// //   time complexity:o(n^3)
// //   space complexity:o(n)
// //  */

// /************************************************************************************** */


// /*
// what is prefix sum in programming?

//  */


// // import java.util.Scanner;
// // import java.util.Arrays;

// // public class  Subarrays{
// //   public static void main(String[] args) {
// //     Scanner scanner = new Scanner(System.in);
// //     // String length = scanner.nextLine();
// //     int half[] = {10,14,15,16,17,18,20,22};
// //     // System.out.println(half.length);
// //     int start = 1;
// //     int end = 4;
// //     for(int i=start;i<=end;i++){
// //       System.out.print(half[i] + " ");
// //     }
// //   }
// // }



// /*   
//   sum of subarrays
//   A:10 20 30 40 50 50



// import java.util.Scanner;
// import java.util.Arrays;

// public class Subarrays {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int length = scanner.nextInt();
//     int sub [] = new int[length];

//     for(int index=0;index<sub.length;index++){
//       sub[index] = scanner.nextInt();
//     }
//     System.out.println(Arrays.toString(sub));

//     System.out.println("Give me a starting index");
//     int start = scanner.nextInt();

//     System.out.println("Give me a ending index");
//     int end = scanner.nextInt();

//     System.out.println("THE SUM OF SUBARRAYS IS" + sumSubarray(sub,start,end));

//   private static int sumSubarray(int sub[],int start,int end){
//     int sum = 0;
//     for (int i = Start; i <= End; i++) {
//       sum = sum + originalArray[i];
//       }
//       return sum;
//     }
//   }

// }

// */









































