public class InnerClass {

    public static void main(String[] args) {

        outer.Inner a = new outer.Inner();
        System.out.println(a.toString());
    }
}

class outer{


   static class Inner{


    }
}
