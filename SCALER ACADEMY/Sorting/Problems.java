/*
Q: given an unsorted constant array which cannot be modified,
   find the max gap between any 2 integers

   GAP: Difference between consecutive array of sorted array.

   A = 7  8 3 1 6
   sort(A) = 1 3 6 7 8

   Approach 1:
   1. copy it to a new array
   2. Sort the array - o(nlogn)
   3. Traverse and find the max gap- o(n)

   Time Complexity: o(nlogn)
   Space Complexity:o(n)

   Approach 2:

   1)Max value of max-gap:
   You know  max(A), min(A),  n

   A = 2 5 2 5  2 2 5

   max = 5
   min = 2
   N = 7 

   MAX VALUE = max - min

   2] Min value of max gap
   You know max,min and N


   Arrange 5 numbers between 0 to 100 such that the max gap is min

   0  to 100

   - if all elements are at equal distinct

   n = 5
   max = 100
   min = 0

   min gap = 25

    0  25  50  75  100

    100-0/4 = 25
    max-min/n-1 = 25


    Bucket Sort:
    - x,y   if(x-y)<g


    - Grater buckets of size g

    A = 10 20 8 14 37
    max = 37
    min =8
    n = 5

    g = minimum of max gap

    g  = max-min/n-1
          37-8/4
          29/4
          = 7

   
    creates a buckets

  B0 =  Buckets 1:min = 8 to 14  [8, 8+g]   = 8,10
  B1=   Buckets 2: 15 tot 21     [8+g,8+2g]  = 15,20
  B2 =  Buckets 3: 22 to 28      [8+2g,8+3g] = 
  B3 =  Buckets 4: 36 to 37      [8+3g,8+4g] = 37

    A[i] - Kth bucket

    8+k.g = A[i]
    k.g = A[i] - 8/9
    k = (A[i]-min)/g
    
    

    Ex2: A = 10 20 8 15 37 30 28 23
    max = 37
    min = 8
    n = 8
    
    g (min of max gap) = max-min/n-1 = 37-8/7 = 29/7 = ~4

    b0 = 8 to 8+g = 8 to 11 [8 to 12) = 8,10[a]
    b1 = 12-15 [12 to 16) = 15[a]
    b2 = 16 to 19
    b3 = 20 to 23 = 23,20[a]
    b4 = 24 to 27
    b5 = 28 to 31 = 28,30[a]
    b6 = 32 to 35 
    b7 = 36 to 37 = 37[a]


    max of b0 = 10
    min of b1 = 15

    ans = min-max = 5

Not: we only take care about the constecutive elements of an array

ALGO:
1. Find g
2. Place elements into buckets
Any Bucket = max and min
3. Iterate the buckets and find the gap

Pseudo code

//compute g = max-min/n-1

buckets[N].max = <INT_MIN>
buckets[N].min = <INT_MAX>
A = [{MIN,MAX},....]

for(i=0;i<n;i++){
      B_Num = A[i] - min/g
      buckets[b_num].max =  max(A[i],buckets[b_num].max)
      buckets[b_num].min = min(A[i],buckets[b_num].min)
}
int prev_max = buckets[0].max;
for(int i =0 ; i<n;i++){
      if(buckets[i].min!=INT_MAX){
            ans = max(ans,buckets[i].min-prev_max);
            prev_max = buckets[i].max;
      }
}
*/
public class Problems {
      public static void main(String[] args) {
            int [] data = {2,3,4,5,6,7,8};

            System.out.println(data);
      }

      private static void Chunks(int[] data){

      }

}


/*
 Q: Max chunks to make array sorted

 A =  2 0 1 2 
      0  2 1 2

    2  0  1  2

  ex: [ 3 2 3 4 0  ]

  chunks = subarray

  A  = 2 1 3 9 8 15 11 14 13

  ans=4

  A = 2 3 1 9 8 1


 */