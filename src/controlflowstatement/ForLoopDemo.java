package controlflowstatement;

public class ForLoopDemo {
    public static void main(String[] args) {

        int[] arr= new int[4];
        arr[0] =1;
        arr[1] =20;
        arr[2] =30;
        arr[3] =40;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i:arr){
            System.out.println(i);
        }
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
