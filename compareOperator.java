public class compareOperator {

    public static void main(String [] args){

        float f = (float) -1/0;

        float f2 = (float) 1/0;

        float f3  = Float.NaN;

        float f4 = Float.POSITIVE_INFINITY;

        float f5 = Float.NEGATIVE_INFINITY;

        System.out.println(f4 + f4);

        System.out.println(f5 + f5);

        System.out.println(f4 + f5);

        System.out.println(f3 + f3);

        System.out.println(f3 + f4);


    }
}
