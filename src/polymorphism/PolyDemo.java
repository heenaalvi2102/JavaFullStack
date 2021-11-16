package polymorphism;

public class PolyDemo {
    public int add(int a,int b){
        return a+b;
    }

    public double add(double a,int b){
        return a+b;
    }
    public float add(float a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        PolyDemo obj= new PolyDemo();
        System.out.println(obj.add(2,4));
        System.out.println(obj.add(2.9,4));
    }
}
