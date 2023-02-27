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

    public static class BreakStatement {


        public static void main(String[] args){

            if(true){

                if(true){

                    if(true){

                        System.out.println("3");

                        dhaval:
                        {

                            System.out.println("dhaval block");
                            break dhaval;

                        }
                    }

                    System.out.println("2");
                }

                System.out.println("1");
            }
        }
    }
}
