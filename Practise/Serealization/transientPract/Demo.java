package Practise.Serealization.transientPract;

public class Demo implements java.io.Serializable{


    transient int i = 10;
    int i2 = 20;
    Demo2 d ;
    String s = "hello world";


    Demo(int i,int i2 , String s , Demo2 d){

        this.i = i;
        this.i2 = i2;
        this.s = s;
        this.d = d;

    }}

class Demo2  implements  java.io.Serializable{

    int i = 55;
    String s = "demo2";

    Demo2(int i , String s){

        this.i = i;
        this.s = s;
    }
}
