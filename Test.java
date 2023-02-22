public class Test {


Test(){
    System.out.println("cunstructor");
}
    {

        System.out.println("block");
        m1();
    }
    public void m1(){
        System.out.println(i);
    }
  int i = 10;
    public static void main(String[] args){

      Test x = new Test();
    }
}
