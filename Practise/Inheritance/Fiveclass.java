package Practise.Inheritance;


public class Fiveclass {
    public String method(){

        return "one";
    }

    public static void main(String[] args) {

        Fiveclass f = new one();
        System.out.printf(f.method());
    }
}

class one extends  Fiveclass{

    public String method(){
        return "one";
    }
}