package superkeyword;

public class SuperKeyword {
    int i = 89;

    public SuperKeyword() {
        System.out.println("In super keyword const");
    }

    public SuperKeyword(int i) {
        System.out.println("In super keyword para");
    }

    public void show() {
        System.out.println("In Super demo show");
    }

}

class A extends SuperKeyword {
    int i = 90;

    public A() {
        System.out.println("In A cont");
    }

    public A(int i) {
        super(i);
        System.out.println("In para count");
    }

    public static void main(String[] args) {
        A obj = new A(1);
    }

    public void show() {
        super.show();
        System.out.println("i=> " + super.i);
        System.out.println("i=> " + i);

    }

}
class B extends A {
    public B() {
        System.out.println("In B const");
    }

    public static void main(String[] args) {
        B obj = new B();

    }
}






