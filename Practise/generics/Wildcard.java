package Practise.generics;



class Demo< T extends  Object> {

    T value;
    void print(){

        System.out.println(this);
    }

    public  static Demo<? super Number> getInstance(Demo<? super Integer> obj){


            return obj.cloneObj();

        }

        Demo<T> cloneObj(){

        return new Demo<T>();
        }


}
public class Wildcard {

    public static void main(String[] args) {

        Demo<Integer> t = new Demo<>();
        Demo<Number> t2 = new Demo<>();
        Demo<Object> t3 = new Demo<>();

        Demo obj = Demo.getInstance(t2);
        Demo obj2 = Demo.getInstance(t3);
        obj.print();
        obj.value = 10;
        t.value = 56;
        t.print();
        Object ob = new Object();

        System.out.printf(obj.value.getClass().getName());
        System.out.println(obj.value instanceof Number);
       // System.out.println(t.value instanceof  Float);


    }
}
