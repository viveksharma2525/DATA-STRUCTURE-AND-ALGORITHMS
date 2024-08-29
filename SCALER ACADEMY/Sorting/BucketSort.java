/*
 Bucket Sort:
 Variation of count sort
 - Arrays element are in the range 0 to 1000.

 Q: if the array elememts are in the range[0,1]

 A = [0.45,0.27,0.23,0.67,0.81,0.13,0.32,0.19,0.07,0.41]

 - map these floats to integers

 A[i] -> floor(A[i]*10)

 let each index is bucket

 N array =  N buckets
 1 bucket = 1 element

 - Array of size of 10
-  floor(A[i]*10 )=[45,27,23,67,81,13,32,19,07,41]

   A  =  0     1     2     3    4     5      6    7      8      9
         0.07  0.13  0.27  0.32 0.45        0.67        0.81
               0.19  0.23       0.41


- so we basically used insertion sort to sort the element in the bucket


pseudo code : 
void bucketSort(float array[],int n){
    vector<int> buckets [n];

    //mapping of elemets to the buckets
    for(int i=0; i<n;i++){
        bucket_num = A[i]*n;
        buckets[bucket_num].push(A[i]);
    }

    //sort the buckets
    for(int i=0;i<n;i++){
        sort(buckets[i]);
    }
    for(int i =0 ;i<n;i++){
        //print elements of bucket[i]
    }
}

Best Case Time Complexity

N elements = 1 buckets

Worst case:O(n^2)

*/


import java.util.Vector;
// import java.util.ArrayList;
public class BucketSort {
    public static void main(String[] args) {
        // float[] data = Range[0,1];
        
    }
    private static void bucketsort(float[] Array ){
        Vector<Integer> buckets= new Vector<>(Array.length);
        buckets[];

        // mapping the element to our buckets
        for (int i = 0; i < Array.length; i++) {
            float Bucket_num = Array[i]*Array.length;
            
        }
    }
}
