public class TwoDArray {
    public static void main(String[] args) {
        int a [][] = new int[4][] ;

        a[0] = new int[1] ;
        a[1] = new int[2] ;
        a[2] = new int[3] ;
        a[3] = new int[4] ;

        for ( int x[] : a ){
            for( int z : x ){
                System.out.print(z+ " ");
            }
            System.out.println();
        }

//        for ( int i = 0 ; i < a.length ; i++ ){
//
//            for (int j = 0 ; j < a[i].length  ; j++ ){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
