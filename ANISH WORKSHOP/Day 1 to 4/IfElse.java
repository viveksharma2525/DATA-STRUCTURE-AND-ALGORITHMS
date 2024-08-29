public class IfElse{
    public static void main(String[]args){
        /*if(true){
            System.out.println("i am in if block");
        }
        else{
            System.out.println("i am in else block");
        }
        */
        boolean itRains=false;
        boolean weatherIsNice=false;

        if(itRains){
            System.out.println("i will carry umbrella");
        }
        else if(!itRains && weatherIsNice){
            System.out.println("i will go to picnic");
        }
        else{
            System.out.println(" i will go cycling");
        }
        //System.out.println("i am outside if else");
    }
}