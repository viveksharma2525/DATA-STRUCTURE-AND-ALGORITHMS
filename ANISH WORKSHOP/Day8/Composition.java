/*
 * 
 * solving the proble (m of multiple inheritance
 * 
 * A(func()) && B(func()) // A and b contains same function
 *   
 * C(func())  class C will confused call which function
 * 
 * abstract class
 * If you want to create a  parent class which tell us what to do
 *  not how to do it.
 */
public class Composition {
    public static void main(String[] args) {
        Sandwich mySandwich = new HoneySandwich();
        mySandwich.prepare();
    }
}

abstract class Sandwich{
    public void prepare(){
        toastBread();
        putToppingsOnBread();
        putSauce();
        putBreadInOven();
    }

    public void toastBread(){
        System.out.println("toasting bread");
    }
    public void putBreadInOven(){
        System.out.println("oven");
    }

    abstract void putToppingsOnBread();
    abstract void putSauce();
}

class HoneySandwich extends Sandwich{
    void putToppingsOnBread(){
        System.out.println("onions");
    }

    void putSauce(){
        System.out.println("mustard");
    }
}

class CheeseSandwich extends Sandwich{
    void putToppingsOnBread(){
        System.out.println("avacado");
    }
    void putSauce(){
        System.out.println("white sauce");
    }
}