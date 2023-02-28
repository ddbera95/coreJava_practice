package Practise.generics;

public class GenericsClass {

    public static void main(String[] args) {

        PrintMessege obj = new PrintMessege();



    }
}


class PrintMessege<T>{


    <U extends Number> void print(U t){

        System.out.println(t);
    }
}

