package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.awt.SystemColor.text;

public class FileHandlingDemo {
    public static void main(String[] args) {
        //byte stream
        File file = new File("text.txt");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Welcome";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully");
            fileOutputStream.close();

        }catch(FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
             FileInputStream fileInputStream = new FileInputStream("text.txt");
             int i = fileInputStream.read();
             while (i>0){
                 System.out.print((char) i);
                 i = fileInputStream.read();

             }
            fileInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
