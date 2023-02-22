public class tryCatch {

    {

        try{
            int i = 1/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

      public static void main(String[] args) {

        tryCatch t = new tryCatch();
    }
}
