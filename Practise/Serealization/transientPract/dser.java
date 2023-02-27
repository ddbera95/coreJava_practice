package Practise.Serealization.transientPract;

import java.io.*;

public class dser  {


    public static void main(String[] args) throws IOException , ClassNotFoundException{

        FileInputStream fin = new FileInputStream("/home/dhaval/hello.txt");

        ObjectInputStream in = new ObjectInputStream(fin);

        Demo d = (Demo)in.readObject();
        System.out.println("successfully deserialized the obhect");

        System.out.println(d.i + " " + d.i2 +" " + d.s + " " + d.d.toString() + " " + d.d.i + " " + d.d.s);


    }

}
