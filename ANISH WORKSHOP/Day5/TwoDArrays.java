public class TwoDArrays {
    public static void main(String[] args) {
        // int [] array = new int[10];
        int [][] matrix = new int[5][];
        matrix[0] = new int[10];
        matrix[1] = new int[2];
        matrix[2] = new int[20];
        System.out.println(matrix[2].length);
        System.out.println(matrix.length);

        int [][] data = new int[10][3];
        data[0] = null;
        System.out.println(data[5].length);
        System.out.println(data[6].length);
        System.out.println(data[0]);

    } 
}