/* 
Gray Code:
Sequence where every consecutive number differs by a single bit

1 bit             2bit                     3bit
0                 00                      000
1                 01                      001
                  11                      010
                  10                      011
                                          and so on..



- idea: 1 bit gray code = 0,1.  
- Reverse of gray code is gray code? Yes or No =  yes

- Step 1: for example 2 bit
1 bit=0
     1   2 bit
          0 0
          0 1  //first make the 2 bit by add  0 0 to the 1 bit
- step2 : for next half first take reverse of it 
          0 0 
          0 1
            1
            0

- step 3: and then make most significant bit 1 1 for the last half
          0  0 
          0  1
          1  1 
          1  0

so here is the logic behind it

- so we can say that for solving N bit problem we use N-1 problem.
*/ 

// phele arraylist karka aa
import java.util.ArrayList;
import java.util.List;
public class GrayCode {
    public static void main(String[] args) {

    }
    // private static List<Integer> graycode(int n){
    //     List<Integer>Gray = new  ArrayList<>();
    //      n = Gray.size();
        
    //     if(n == 1){
    //         Gray.add(0);
    //         Gray.add(1);
    //         return Gray;
    //     }

    //     List <Integer> p = graycode(n-1);

    //     List<Integer> Ans_List  = new ArrayList<>();

    //     int size = p.size();
    //      for (int i = 0; i<size; i++) {
    //         Ans_List.add(p.get(i));
    //      }
    // }
}
