public class StaticMethodInheritance {

    public static void main(String[] args) {

        Ab par = new B();
        par.method();
    }
}
class Ab{

    static void method(){

        System.out.println("ab class method");
    }
    void method2(){
        System.out.println("parent");
    }

}

class B extends  Ab{

    static void method(){
        System.out.println("hello world");
    }

    void method2(){
        System.out.println("child");
    }

    void mehod3(){
        System.out.println("child2");
    }

}