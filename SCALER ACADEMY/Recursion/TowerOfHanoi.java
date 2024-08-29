/*
 Tower of hanoi: Given 3 tower A,B,C 
 - N discs are on tower of hanoi
 - move all discs from A to C.

 - Only 1 discs moves at a time.
 - Larger disc cannot be placed on smaller disc.


 ex: if n=2 

 A = Source Tower
 B = Temp Tower
 C = Destination Tower

  logic:
  A has 2 disc.

 first A to B smaller
 Second A to C to the Destination
 Third B to C to to the Destination

 if n=3

 A has 3 disc.

 Step 1:
 1. A to C
 2. A to B
 3. C to B

 now Temp has 2 disc which is smaller than the larger one

 Step 2:
 1. A to C the larger one.

 Step 3:
 1. B to A
 2. B to C
 3. A to C

 Algorithm:
 1. Move n-1 from A to B via C.
 2. Move from A to C
 3. Move n-1 form B to C via A.

 */
public class TowerOfHanoi {
    public static void main(String[] args) {
       towerOfHanoi(4, 1, 3, 2);
    }
    private static void towerOfHanoi(int n, int src, int dest,int temp){
        if(n == 0){   //base case
            return;
        }
        else{
            towerOfHanoi(n-1, src, temp, dest);  //recursion calls
            System.out.println("Move from " + src  +  "to" +  dest);
            towerOfHanoi(n-1, temp, dest, src);
        }
    }
}
