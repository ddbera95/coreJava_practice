import java.io.IOException;

public class ExceptionClass {

    public static void main(String[] args) {

        exp e = new exp();

        e.method();

    }
}

class exp{

    public void method() throws IOException {

        System.out.println("hello world");
        int i = 1*1;
        //i = i/0;
    }
}