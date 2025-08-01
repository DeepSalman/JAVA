package Arrays;

public class PrtacticeClass {
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for(int x: arr){
//            System.out.print(x+" ");
//        }
//    }

    public static void main(String[] args) {
        int a[][] = new int[4][];

        a[0] = new int [1];
        a[1] = new int [2];
        a[2] = new int [3];
        a[3] = new int [4];

        for(int x[]:a){
            for(int y:x){
                System.out.println(y+" ");
            }
        }
    }
}
