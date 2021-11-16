package controlflowstatement;

public class ScannerAge {
    public static void main(String[] args) {
        int age=0;
        if(age>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you can not vote");
        }
        String str = age>18?"you can vote":"you can not vote";
        System.out.println(str);
    }
}
