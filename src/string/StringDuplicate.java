package string;

public class StringDuplicate {
    public static void main(String[] args) {
        String str3 = "abbcde";
        StringBuilder str5 = new StringBuilder(str3);
        for(int i=0;i<str5.length();i++){
            for (int j=i+1;j< str5.length()-1;j++){
                if (str5.charAt(i)==str5.charAt(j)){
                    str5.deleteCharAt(i);
                }

            }
        }
        System.out.println(str5);
    }
}
