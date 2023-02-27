package Practise.Abstract;


abstract class hello{

    void method(){
        System.out.println("hello");
    }
}
public class imp {
    public static void main(String[] args) {
        hello a = new hello(){};

        a.method();
    }
}
