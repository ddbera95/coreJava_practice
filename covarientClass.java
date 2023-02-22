public class covarientClass {

    public static void main(String[] args) {


        parenta a = new childb();

       a.method().print();



    }
}

class parenta{

    parenta method(){return this;}


    void print(){
        System.out.println("class a");
    }
}

class childb extends parenta{

    childb method(){
        return this;
    }
    void print(){
        System.out.println("class b");

    }
}