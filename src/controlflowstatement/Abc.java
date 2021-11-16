package controlflowstatement;

public class Abc {
    public static void main(String[] args) {
        int a = 90, b = 80, c = 70, d = 60;
        if (a > b && a > c) {
            System.out.println("a is grater");
        } else if (b > c && b > d) {
            System.out.println("b is grater");
        } else if (c > d) {
            System.out.println("c is greater");
        }
    }

}
