package polymorphism;

public class Animal {
    public void sound() {
        System.out.println("Animal sound");
        }
    }
class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat sound");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }

}