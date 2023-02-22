public class SuperKeyword {

    public static void main(String[] args) {

    }
}

class parent1{

    void method(){
        System.out.println("class A");
    }
}
class child1 extends parent1{

    void method(){
        System.out.println("class A");
    }
}
class child2 extends child1{

    void method(){
        super.method();
        super.method();
        System.out.println("class A");
    }
}