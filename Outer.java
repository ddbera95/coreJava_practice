// Java code to demonstrate that inner
// classes cannot be declared as static

public class Outer
{
    private int getValue(int data)
    {
         class Inner
        {
            private int getData()
            {
                System.out.println("Inside inner class");
                if(data < 10)
                {
                    return 5;
                }
                else
                {
                    return 15;
                }
            }
        }

        Inner inner = new Inner();
        return inner.getData();
    }

    public static void main(String[] args)
    {
        Outer outer = new Outer();
        System.out.println(outer.getValue(10));
    }
}
