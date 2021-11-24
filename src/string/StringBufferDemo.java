package string;

public class StringBufferDemo {
    public static void main(String[] args) {


        StringBuffer stringBuffer = new StringBuffer("pune");
        stringBuffer.append("city");
        System.out.println(stringBuffer);
        StringBuilder stringBuilder = new StringBuilder("mumbai");
        stringBuilder.append("city");
        System.out.println(stringBuilder);

//stringbuffer is mutable
//string is immutable
//buffer is synchronized



    }
}
