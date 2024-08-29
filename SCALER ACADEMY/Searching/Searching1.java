/*
 1. Target(What to search?)
 2. Search Space(where to search?

 Factor that affects the time taken to search?
 1. Size of search space.
 2. order of elements in Search Space.

 Linear Search: o(N)

 How is ordered arrangment helping us to Search faster?

 */

 // Binary Search
/* 
public class Searching1{
    public static void main(String[] args) {
        int [] array = {3,5,9,12,19,26,29,35,39};
        int  Target = 12;
        int result = BinarySearch(array,Target);

        if(result!=-1 && array[result] == Target){
            System.out.println("Element found");
        }
        else{
            System.out.println("Not Found");
        }
    }
    private static int BinarySearch(int array[],int Target ){
        int low = 0;
        int High = array.length-1;
        

        while (low <= High) {
            int mid = low+(High-low)/2;
            if (array[mid] == Target){
                return mid;
            }
            else if(array[mid]<Target){
                low = mid + 1;
            }
            else{
                High = mid -1;
            }
        }
        return -1;
    }
}
*/


//pseudo code
/* 
import java.util.*;
public class Searching1{
    public static void main(String[] args) {
        int [] array = {3,4,5,1,2};   
        Solve(array);
    }
    //monotonic space defined
    private static int check(int x,int[] array){
        return array[x] >= array[0] ? 1:0;

        //here we use ternary operator return 1 if it is first half and 0 if it is another half
    }
    private static void Solve(int array[]){
        int low = 0;
        int High = array.length-1;
        int ans = 0;

        while (low<=High) {
            int mid = (low+High)/2;
            if(check(mid,array)== 1){
                low = mid + 1;
            }
            else{
                ans = mid;
                High = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
*/

//biotonic spaces 
// find the index at which the number is changing increasing or decreasing
// import java.util.*;
public class Searching1{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,2,1};   
        Solve(array);
    }
    //biotonic space defined
    private static int check(int x,int[] array){
        return array[x] > array[x-1] ? 1:0;
        //here we use ternary operator return 1 if it is first half and 0 if it is another half
    }
    private static void Solve(int array[]){
        int low = 1;
        int High = array.length-1;
        int ans = 0;

        while (low<=High) {
            int mid = (low+High)/2;
            if(check(mid,array)== 1){
                ans = mid;
                low = mid +1;
            }
            else{
               High = mid -1;
            }
        }
        System.out.println(ans);
    }
}
