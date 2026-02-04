package methods;

public class MethodExample {
    // Access Modifier  Optional Modifiers Return Datatype  Method Name     Parameters
    // v                final, static       V               V               V
    public                                  void            methodExample  (){}

    public int methodExample2() {
        return 0;
    }

    public final void methodExample3() {
        System.out.println("printing from instance method");
    }

    public static void methodExample4() {
        System.out.println("I'm Printing from a static method");
    }

    public void methodExample5() {
        return;
    }
}
