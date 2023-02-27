package Practise.Lamda;



interface demo {

    public void helo(int s);
}
public class lamdaClass {

    public static void main(String[] args) {


        String s[] = new String[]{"hello" , "there" , "how are you"};
        int j[] = new int[] { 5 , 2  , 4 , 6};

       dd((int i) -> {
           System.out.println((i*i));
       },j);

        dd((int i) -> {
            System.out.println(i*i*i);

        },j);


    }

    public static void dd(demo d , int s[]){

       for(int x:s){

           d.helo(x);
       }
    }
}
