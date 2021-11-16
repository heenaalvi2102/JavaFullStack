package controlflowstatement;

public class StarEx2 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=i;i<=4;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
