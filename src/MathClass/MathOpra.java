package MathClass;

public class MathOpra {
    public static void main(String[] args) {
        int i = 10;
        float f = 9.5F;

        //Absolute method
        double x = Math.abs(-f);
        System.out.println("Absolute value is : "+x);


        //Square root value
        double y = Math.sqrt(100);
        System.out.println("Squared value is : "+y);

        //power value
        double z = Math.pow(3,2);
        System.out.println("Power is : "+z);

        System.out.println(Math.PI);
        System.out.println(Math.log(2.0));
        System.out.println(Math.exp(1.0));
        System.out.println(Math.max(-2.3,12.8));
        System.out.println(Math.ceil(-5.6));
        System.out.println(Math.floor(-5.6));




    }
}
