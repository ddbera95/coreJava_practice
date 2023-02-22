

public class StaticBlock {



    public static void main(String[] args) {

        demo2 d = new demo3();
//       demo2.print();
//       demo2.print();
    }

}
class demo2{


    {
        System.out.println(this.toString());
    }
    static{
        System.out.println("hello world");
    }

    public static void print(){
        System.out.println("hello world print");
    }

}
class demo3 extends demo2{

    static {
        System.out.println("from demo 3");
    }
}