package controlflowstatement;
import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        int num,sum=0;
        char choose=0;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("enter the number");
            num= scanner.nextInt();
            sum=sum+num;
            System.out.println("do you want to enter next number");
            choose=scanner.next().charAt(0);
        }while(choose=='Y'|| choose=='y');
        System.out.println("sum is==>"+sum);
    }
}
