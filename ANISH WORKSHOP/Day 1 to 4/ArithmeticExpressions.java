public class ArithmeticExpressions{
    public static void main(String[]args){
        int a=5;
        int b=3;

        //basic arithmetic operations
        //System.out.println(a+b);
        //System.out.println(a-b);
        //System.out.println(a/b); //-->1.66-->1
        //System.out.println(a*b);

        System.out.println(a+a/b);
        //5+5/3
        //5+1
        //6
        
        //explicit type casting->forcefull data type conversion
        System.out.println(a+((float)a)/b);
        //5+5/3
        //5+5.0/3.0
        //5+1.66
        //5.0+1.66
        //6.66

        // modulus operator
        System.out.println(0%2);
        System.out.println((char)('a'+1));
        //char(2bytes)+int(4bytes)
        //char->int'a'-->97+1
        //97+1
        //98
    }
}