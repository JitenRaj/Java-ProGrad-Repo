public class AdditionOf2DArrays {
    public static void main(String[] args) {

        int[][] array1 = arrayCreater(3,3);

        int[][] array2 = arrayCreater(3,3);

        int[][] array3 = arrayAdder(array1,array2);

        arrayPrinter(array1);
        arrayPrinter(array2);
        arrayPrinter(array3);
    }

    public static int[][] arrayCreater(int row, int col){

        int[][] arrayName = new int[row][col];

        for(int i=0; i<row; i++) {
            for( int j=0; j<col; j++){
                arrayName[i][j] = i+j;
            }
        }

        return arrayName;
    }

    public static void arrayPrinter( int[][] arrayName) {

        int row = arrayName.length;
        int col = arrayName[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print( arrayName[i][j] + " ");
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
