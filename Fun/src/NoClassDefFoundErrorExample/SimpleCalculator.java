package NoClassDefFoundErrorExample;

/**
 * Created by uttam36 on 23/05/17.
 */
public class SimpleCalculator {

    static int someInt = foo();

    public static int foo() {
        return  1 / 0;
    }
}
