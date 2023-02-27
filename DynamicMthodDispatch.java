public class DynamicMthodDispatch {
     int i;

    public static void main(String[] args) {

        demoa2 a = new demoa2();
        a.method();

    }

    void method(){
        System.out.println(i);
    }
}
class demoa2{

    double i;
    void method(){
        System.out.println(i);
    }

}

class demob2 extends demoa2{


}