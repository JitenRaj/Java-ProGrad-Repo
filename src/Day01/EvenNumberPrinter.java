public class EvenNumberPrinter {
    public static void main(String[] args) {

        printUsingForLoop( 20 );

        printUsingForEachLoop( 15);
    }

    public static void printUsingForLoop(int size) {

        System.out.println("Using For Loop : ");

        for(int i = 0; i<size; i++){
            if( i % 2 == 0)
                System.out.print( i + " ");
        }

        System.out.println();
    }

    public static void printUsingForEachLoop( int size) {

        System.out.println( "Using ForEach Loop : ");

        int[] intArray = new int[size];
        for(int i=0; i<size; i++) {
            intArray[i] = i;
        }

        for ( int i : intArray ) {
            if( i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
    }
}
