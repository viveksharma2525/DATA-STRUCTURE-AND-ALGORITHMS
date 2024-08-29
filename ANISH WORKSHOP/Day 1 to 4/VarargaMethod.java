public class VarargaMethod {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        func('a');
        func('a','n','i');
    
    }
    // to do function overloading(same name but different value)

    //first approach:
//     private static int sum(){

//     }
//     private static int sum(int a1){
        
//     }
//     private static int sum(int a1, int a2){
        
//     }


    // Second Approach using VaragsMethod(variable number argument)
    private static int sum(int... numbers){
        int sum = 0;
        for(int element:numbers){
            sum += element;
        }  
         return sum ;
    }
    private static void func(char normal , char... characters){
        System.out.println(normal);
        System.out.println(characters);
    }
 }

