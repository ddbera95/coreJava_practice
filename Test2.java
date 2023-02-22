import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test2 {


    public static void  main(String [] args){

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        demo d = new demo();
        demo y = d.clone(d);
        int [] a = new int[5];
        System.out.println(a.length);

        System.out.println(d);

        try {
            String[] s = bf.readLine().split(" ");
            System.out.println(Arrays.toString(s));

        }catch (Exception e){
            System.out.println(e);
        }

    }
}

class demo{

     int x;
     String y;
     demo(){

    }
    demo clone(demo d){
        this.x =d.x;
        this.y = d.y;
        return this;
    }
}

