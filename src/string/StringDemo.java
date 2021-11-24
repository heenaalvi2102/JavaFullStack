package string;

public class StringDemo {
    public static void main(String[] args) {
        char[] arr={'M','U','M','B','A','I'};

      //  String str2 = new String(arr);


        String str = new String("Pune");//2
        String str1 = "Pune";//0
        String str2 = "Pune";//0
        String str3 = new String("pune");//1
        String str4 = new String(arr);//1
        System.out.println(str==str1); //false   // reference
        System.out.println(str.equalsIgnoreCase(str1));//true //content   //ignore case
    }
}
