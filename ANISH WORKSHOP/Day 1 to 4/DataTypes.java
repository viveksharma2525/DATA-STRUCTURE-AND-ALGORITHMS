public class DataTypes{
    public static void main(String[] args){
    /*
    variable Instatiation
    datatype variable_name=value; */

    //primitive data types
    //Integer variable types
    byte b=10; // Store:1byte->8bits in computer memory
    short smallNumber=20; // Store:2byte
    int integer = -764; //store:4byte
    long veryLongNumber=Long.MAX_VALUE+1; //java is case sensitive so long and Long is different things
    System.out.println(veryLongNumber); 

    // Floating Point Number
    float p1=(float)3.14; //4bytes //explicit typecasting->syntax:var=(lowerDataType)expr;
    double e=2.71828;//use to store decimal values //8bytes

    //character values
    char character ='a';
    char character ='b';
    char character ='2';
    char character =' ';

    //boolean variables
    boolean truthy=false;
    truthy = true;

    //Non primitive data types(ADT:Abstract data type)
    String message ="hello world";
    String emptyString ="";
    String longString="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String characterOne="1"; 

    }
}