package Practise.Exception;

import java.io.IOException;

public class CustomException {

    public static void main(String[] args) {

        Test t = new Test();

        //t.method();
        System.out.println("hello");
        float f = 5f/0;
        System.out.println(f);
        //t.method2();
        try {
            t.method2();
        }
        catch (CustomUncheckedException e){
            System.out.println("custom " + e);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}




class Test{


    void method() throws CustomCheckedException{

        System.out.println("this is checked exception method");
    }

    void method2() throws  CustomUncheckedException {

        System.out.println("this is unchecked exception method");
        throw new CustomUncheckedException();
    }

}

class CustomCheckedException extends  Exception{


    String massage;
    CustomCheckedException(){
        super();
        massage = "cheked custom exception";
       // System.out.println("checked exception");
    }
}

class CustomUncheckedException extends RuntimeException{

    String massage;
    CustomUncheckedException(){
        super();
        massage = "suctom unchacked Exception";

    }
}
