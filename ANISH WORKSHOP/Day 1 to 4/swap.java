public class swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b= temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void Swap(int a,int b){
        int temp = a;
        a = b;
        b= temp;
    }
    private static void func(){
        func(10);
    }
    private static void func(int x){
        
    }
}