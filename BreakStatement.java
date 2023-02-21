import javax.swing.plaf.synth.SynthTextAreaUI;

public class BreakStatement {


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
