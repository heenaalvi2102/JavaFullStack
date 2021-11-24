package string;

public class StrinReverse {
    public static void main(String[] args) {
        String str = " Welcome";
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        System.out.println(str1);
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
