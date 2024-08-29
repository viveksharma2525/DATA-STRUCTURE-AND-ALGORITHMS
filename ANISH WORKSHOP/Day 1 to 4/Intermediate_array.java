/*
 intro to arrays
 int arr[5] //array of integer size 5

 0 1 2 _ _ _  _  _ _ n-1

 1. Print all numbers of arrays
 for(i=0;i<n;i++){
    print(array[i]); // this is used to print all element of array
     
    Time Complexity:O(N)
    Space Complexity:O(1)

 }


// import java.lang.reflect.Array;

public class Intermediate_array {
   public static void main(String[] args) {
     System.out.println(GreatestInteger(new int[] {-3,-2,6,8,4,8,5}));
   }
   private static int GreatestInteger(int[] array){
    //find the max
    int max_val = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
        if(max_val < array[i]){
            max_val = array[i];
        }
    }

    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if(array[i] == max_val){
            count++;
        }
    }
    return array.length - count;
}
}


q.1 Given integer array of N element.count the number of element
having atleast 1 number greater than itself?
 array = {-3,-2,6,8,4,8,5}
 ans = 5

logic: 1.all the max number are not counted
       2. everything other than the max number will be counted
     
       n = total number of elements
      ans: n - count of max

      1. find the max
      2. find the count of max
      3. n - count

      dry run the code
      {1,2, 3, 1, 5}
       i      max
       0        1
       1        2
       2        3
       3        3
       4         5
 */


    //    ********************************************

/*
 q2. Given n array elements check if there is a pair i,j such that arr[i] + arr[j] =K.
     i!=j.
     i and j are indexes. K is given sumn

     ex: {3,-2,1,4,3,6,8} K=10
     arr[i] + arr[5] = 10
     return true;

     ex2: {2,4,-3,7}  K=8
     return false;

     
















import java.util.Scanner;
public class Intermediate_array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Please Enter the value of k");
        // int k = scanner.nextInt();
        System.out.println(AddIndex(new int[] {3,-2,1,4,3,6,8}));
        System.out.println(AddIndex(new int[] {2,4,-3,7}));
    }
    private static boolean AddIndex(int[] array){
        int k = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] + array[j] == k && i!=j ){
                    return true;
                }
            }
        }
        return false;
    }
}
*/

/*
 given an integer array . reverse the entire array

 input:{-1,4,,7,6,-2,7,8,10}
 output: {10,8,7,-2,6,7,4,-1

    observation: do swaping

    i          j  operation
    0          7    swap
    1          6  swap
    2           5   swap
    3           4   swap
    4           3    stop
}
// incomplete solution


public class Intermediate_array{
   public static void main(String[] args) {
        
    }
    private static int ReverseArray(int[] array,int N){
        // int i =0;
        // int j = N-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = N-1; j < array.length; j++) {
                while (i<j) {
                    int temp = array[i]
                    array[i] = 
                }
            }
        }
        }
    } 

/*
 q3 reverse the part of array starting at index s and ending at index e.

 eg: {100 200 300 400 500}
 starting index=1
 ending index=3
  answer {100 200 300 400 500 }

 
public class Intermediate_array{
    public static void main(String[] args) {
        
    }
    private static int ReversePart(int array[]){
        int S = 0;
        int N = array.length-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                while(i<j){
                    
                }
            }
        }

    }
}
*/

























