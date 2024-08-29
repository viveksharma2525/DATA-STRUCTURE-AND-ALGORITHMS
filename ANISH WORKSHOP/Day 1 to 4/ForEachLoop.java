
public class ForEachLoop{
    public static void main(String[] args){
        int[] array = {1,-39,90,76,34};
    /*
        for(instantiation;conditions;updation){

        }
        --> only valid for iterable objects
        --> arrays are iterable
        for(data_type variable: iterable_variable)
     */
    //public static void main(String[] args){
        // int[] array = {1,-100,90,78,69};
        
        // for(int index=0;index<array.length;index++){
        //         System.out.print(array[index] + " ");
        //     }
        //     System.out.println();

            //for each loop
            for(int element:array){
                 System.out.print(element + " ");
             }
    }
}