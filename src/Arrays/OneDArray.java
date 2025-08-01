public class OneDArray {
    public static void main(String[] args) {
       // int a[20] ;
//        int a[] , c ;
//        int[] b , d ;

        int a [] = new int[5] ;
        System.out.println("Array Size :  "+ a.length );

//        for(int i= 0  ; i < a.length ; i++ ){
//            System.out.print(a[i]+ " ");
//        }

        for (int x :a ){
            System.out.print(x+ " ");
        }

    }
}
