import java.text.DecimalFormat;

public class Vars {
    public static void main(String[] args) {


        double x = 12e22; //12 * 10 ^ 22;
        double y = 12e-22; //12 * 10 ^ -22;


        DecimalFormat decimalFormat = new DecimalFormat( "#.######################");



        System.out.println(x);
        System.out.println(y);
        System.out.println(decimalFormat.format(y));



        int i = 3_500_000;

        System.out.println(i);


        int a = 5;
        int b = 2;

        System.out.println(a / b);

        int c = 5;
        int d = 2;

        System.out.println(5f / d);
        System.out.println(5 / 2.);
        System.out.println(c % d);













    }
}
