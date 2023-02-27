package Practise.Serealization.transientPract;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ser {
    public static void main(String[] args) throws IOException {

        Demo d = new Demo(55,77," dhaval bera" , new Demo2(33 , "demo2 dhaval bera"));

        FileOutputStream fout = new FileOutputStream("/home/dhaval/hello.txt");

        ObjectOutputStream out =  new ObjectOutputStream(fout);

        out.writeObject(d);
        System.out.println("successfully serialized the object");
        out.close();
        fout.close();
    }
}
