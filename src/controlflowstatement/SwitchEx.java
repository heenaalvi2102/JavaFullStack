package controlflowstatement;
import java.util.Scanner;
public class SwitchEx {
    public static void main(String[] args) {
        int num1,num2;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        num1= scanner.nextInt();
        System.out.println("enter second number");
        num2= scanner.nextInt();
        ch = scanner.next().charAt(0);

        switch(ch){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("incorrect statement");
        }
    }
}
