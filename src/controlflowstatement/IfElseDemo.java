package controlflowstatement;

public class IfElseDemo {
    public static void main(String[] args) {

    int i = 19;
    String nationality = "pak";
    if(i> 18){
        if(nationality =="indian"){
            System.out.println("you can vote");
        }else{
            System.out.println("not indian");
        }
    }else{
        System.out.println("you can not vote");
    }
}
}
