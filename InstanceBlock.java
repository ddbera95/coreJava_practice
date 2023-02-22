public class InstanceBlock {

    public static void main(String[] args) {

        A a = new A();
    }
}


class A{

    {
        int  x = 1/0;
    }

}
