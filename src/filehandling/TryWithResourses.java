package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourses {
    public static void main(String[] args) {
        try( FileOutputStream fileoutputstream = new FileOutputStream("sample2.txt")) {

            String str = "hello";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);
            fileoutputstream.write(arr);
            System.out.println("file successfully write");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileInputStream fileInputStream = new FileInputStream("sample2.txt")){
            int i = fileInputStream.read();
            while(i>0){
                System.out.print((char)i);
                i= fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

