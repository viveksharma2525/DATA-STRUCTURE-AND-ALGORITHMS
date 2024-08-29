public class VaragsMethod {
    /*
     * varags can be only in one function
     * they must be last parameters
     */
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum());
        func('a');
        func('a', 'b','c','d');
    }
    private static int sum(int... numbers){
        int sum = 0;
        for(int element:numbers){
            sum += element;
        }
        return sum;
    }
    private static void func(char normal,char... characters){
        System.out.println(normal);
        System.out.println(characters);
    }
}
