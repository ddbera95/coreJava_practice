import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class switchStatement {

    public static void main(String [] args){

        try{

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            String s1 = bf.readLine();

            switch (s1){

                case "123":
                    System.out.println(s1 + " 123");
                    break;
                case "hello":
                    System.out.println(s1 + "hello");
                    break;
                case "world":
                    System.out.println(s1 + "world");

                default:
                    System.out.println("default");
            }
        }

        catch (Exception e){

            System.out.println(e);
        }



    }
}
