/*
QUESTIONS
1. max absolute difference
2. 1st missing +ve integers
3. merge overlapping
4. rain water trapping
 

// import java.util.Scanner;
// import java.util.Arrays;
public class Arrays2{
    public static void main(String[] args){
    /*
    Q.1 Max Absolute Differences(Amazon)
     F(i,j)   =  | A(i) - A(j)| + |i-j|     A(i) = value of that index  where i is the index number itself
    Brute force:consider all pairs of numbers
    A: 1 3 -1
        0 1 2 

     i    j    
     0    0           1-1 + 0-0 =0
     0    1           1-3 + 0-1 = 3
     0    2           1 +1 + 0-2 =4 
     1    0           3- 1 + 1-0 = 3
     1    1           0-0 + 1-1 =  0 
     1    2           3 +1 + 1-2 = 5
     2    0           -1-1  + 2-0 = 4
     2    1           -1 -3 + 2-1 = 5
     2    2           -1+1  + 2-2 = 0

     Time complexity : o(n^2)
     Space complexity : o(n)

     let F is function
     F(i,i) = 0
     F(i,j) = F(j,i)

     observations:
     \x\ =  x       if x >0
     \x\  = -x      if x<0
       
       
     Case 1 : arr[i] <= arr[j]
     F(i,j) =  arr[j] - arr[i] + j - i
            = (arr[j]+j) - (arr[i]+i)
     
     Case 2 : if arr[i] > arr[j]
     F(i,j) = (arr[i] - i) - (arr[j] - j)
 
     why to take max of above two cases
      ex  arr[i] =3    arr[j] = 5
           i=1          j=2
           
        Case 1 : 



     max(arr[j] + j) - (arr[i]+i), (arr[i] - i) - (arr[j] - j)


      let Xi = arr[i] + i
          Xj = arr[j] + j

         Yi = arr[i] - i
         Yj = arr[j] - j

      Case 1 : max(Xj - Xi)
      Case 2 : max(Yi -Yj)
      
      max(case1, case2)
       
      Case1 : 2+(j-i)
      Case2 : -2 +(j-i) here is we take max of both the cases
       
      find (max(case 1)) for i,j
      nd   (max (case 2)) for i,j


       For the max of case 1 i will only find the 
       max(Xj-Xi)

       for the max of case 2 i will only find the
       max(Yj -Yi)

       Logic :
          
           Case 1: max(arr[j] - arr[i])
           [ max            min]

           A: 1 3 -1
           X: 1 4   1

           max[Xi] = 4
           min[X] = 1
           4 - 1 =3 

           max for case 1 is 3
           Case 2 : max(Yj -Yi)         //////  ???? lots of confusion here


           A: 1 3 -1
           Y: 1 2  -3 

           max(Y) = 2
           min(Y) = -3
           max of case 2 is  2+3 =5

           max(max(case1),max(case2))

        
         


    }
}
*/

/*
  Q2/ First Missing Non Negative integer
     
      0 1 2  3  4 5  6 
  A = 8 10 1 -3 2 -5 0

  Ans = 3

  A = 2 3 7 6 8 -1 -10 15
   Ans = 0

   Brute force : 
   Check for 0,1,2,3

   for(i=0;i< ,i++){
    //check if "i"
   } 
    
   N=5
   A=[0,1,2,3,4]
   N=6
   A=[0,1,2,3,4,5,6]

   Range = 0 to N
   min(ans) = 0 
   max(ans) = n-1;

   Time complexity: O(N^2)
   Space Complexity: o(n)

   Approach2 : Use a hashset to check if element is present in array
   for(i=0;i<=n;i++){
    if(i is not in the array{
        return element;
    })
   }

   Time Complexity : O(n)
   Space Complexity : o(n)

   Efficent Approach
   Range of ans  = [0,n]

   Let us consider array element only in the range [0,n-1]

   Case 1: If all numbers in range are present in the answer = n
   Case 2: First missing number in the range [o,n-1]

  Space Complexity: o(n)

  Can we do it with o(1)

  let N=7   0  1 2 3 4 5 6 
  A  =      8 10 1 6 2 -5 0
   Ans = 3

   Range  : [0  to  n-1 =6]
             [0 to 6]

    
 */
































