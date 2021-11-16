package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("buffer.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "pune";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);
            bufferedOutputStream.write(arr);
            bufferedOutputStream.close();
            fileOutputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileInputStream fileInputStream = new FileInputStream("buffer.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int  i = bufferedInputStream.read();
            while(i>0){
                System.out.print((char)i);
                i= bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
