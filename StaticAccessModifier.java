   class StaticAccessModifier {

    static int z = 0;
    public  static  void main(String[] args){

        System.out.println("main");
//         staticModifier.dhaval d = new staticModifier.new dhaval();
//        staticModifier.dhaval y = new staticModifier.dhaval();

        bera.dhaval d = new bera().new dhaval();
        bera.dhaval y = new bera().new dhaval();

        d.display();


        d.x++;
        y.x++;


        System.out.println(d.x);
        System.out.println(y.toString() + " " + d.toString());
    }

}

 class staticModifier{
    static int x = 0;

    int y = 0;
        class dhaval{

         int x = 5;
         int z = 6;
         public void display(){

             System.out.println(x);
         }
     }

       dhaval method(){

       x++;

       StaticAccessModifier.z = 1;
       System.out.println("method");
      // StaticAccessModifier.main(new String[]{"hello"});
        dhaval d = new dhaval();
        d.display();
        return d;
    }





}

class bera extends  staticModifier{



}
