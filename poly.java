
class Bike{
    int speedlimit=90;
    void method(){
        System.out.println("hello");
    }
}
class poly extends Bike {
    int speedlimit = 150;

    void method() {
        System.out.println(speedlimit);
    }


    public static void main(String args[]) {
        Bike obj = new poly();
        System.out.println(obj.speedlimit);//90
        obj.method();
    }
}