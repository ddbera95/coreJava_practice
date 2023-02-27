package Practise.Serealization;

import java.io.*;

class Hello implements  java.io.Serializable{

    int i = 10;
    String s = null;
    Hello(int i , String s ){
        this.i = i;
        this.s = s;

        System.out.println("hello ia m serializable cunstructor " + i + s);
    }

}

public class ObjectSer {

    public static void main(String[] args) throws IOException , ClassNotFoundException{



        FileOutputStream fout = new FileOutputStream("/home/dhaval/hello.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        Hello h = new Hello(55 , " dhaval bera");
        out.writeObject(h);


        System.out.println("successfully serialized the object");

        out.close();
        fout.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/dhaval/hello.txt"));

        h = null;

        h= (Hello)in.readObject();
        System.out.println("successfully deserialized the object");

        System.out.println(h.i +" " + h.s);

    }

}
