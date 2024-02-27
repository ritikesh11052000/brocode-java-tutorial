package package1;
import package2.*;

import java.io.PrintStream;

public class B {
    private String privatemessage = "this is private";

    public static void main(String[] args) {
    B b = new B();
        System.out.println(b.privatemessage);
    }
}
