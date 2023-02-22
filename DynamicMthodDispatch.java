public class DynamicMthodDispatch {

    public static void main(String[] args) {

        demoa2 a = new demoa2();
        a.method();//create a error
    }
}
class demoa2{


}

class demob2 extends demoa2{

    public void method(){
        System.out.println("hello world");
    }
}