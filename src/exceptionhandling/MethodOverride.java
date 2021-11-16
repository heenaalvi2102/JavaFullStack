//in method override unchecked exception used in both parents and child class
//if parent class declared no exception then you can declare unchecked exception in child
//if paren class declare exception then you can declare same exception
//if parent class declare exception then you can declare child exception

package exceptionhandling;

import java.io.IOException;

public class MethodOverride {
    public void show()throws Exception{
        System.out.println("in show");
    }
}
class MethodOverride2 extends MethodOverride{
    @Override
    public void show() throws ArithmeticException {
        System.out.println("in child ");
    }

    public static void main(String[] args) throws IOException {
        MethodOverride2 obj = new MethodOverride2();
        obj.show();

    }
}
