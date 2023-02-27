package Practise.Interface;

class A{
    int i = 10;

   void doIt(){}

}

class B extends  A{
    int i = 10;
    void doIt(){

        i = 20;
        System.out.println(this.i + " " + super.i);

//        System.out.println(name == null);
    }

}

public class Main {
    public static void main(String[] args) {
       A b = new B();
       b.doIt();
        

    }
}