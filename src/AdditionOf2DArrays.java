public class AdditionOf2DArrays {
    public static void main(String[] args) {

        int[][] array1 = arrayGenerator(3,3);

        int[][] array2 = arrayGenerator(3,3);

        int[][] array3 = arrayAdder(array1,array2);

        arrayPrinterUsingForLoop( array1 );

        arrayPrinterUsingForEachLoop( array2);

        arrayPrinterUsingForLoop( array3 );

        arrayPrinterUsingForEachLoop( array3);
    }

    public static int[][] arrayGenerator(int row, int col){

        int num = 1;
        int[][] arrayName = new int[row][col];

        for(int i=0; i<row; i++) {
            for( int j=0; j<col; j++){
                arrayName[i][j] = num++;
            }
        }

        return arrayName;
    }

    public static void arrayPrinterUsingForLoop( int[][] arrayName) {

        System.out.println("Prining using For Loop : ");

        int row = arrayName.length;
        int col = arrayName[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print( arrayName[i][j] + " ");
            }
        }

        System.out.println();
    }

    public static void arrayPrinterUsingForEachLoop( int[][] arrayName ) {

        System.out.println("Printing using For Each / Enhanced Loop : ");

        for( int[] newArr : arrayName){
            for( int val : newArr){
                System.out.print( val + " ");
            }
        }

        System.out.println();
    }

    public static int[][] arrayAdder( int[][] array1, int[][] array2) {

        int row = array1.length;
        int col = array1[0].length;


        int[][] arraySum = new int[row][col];

        for(int i=0; i< row; i++){
            for( int j=0; j<col; j++){
                arraySum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return arraySum;
    }

}
