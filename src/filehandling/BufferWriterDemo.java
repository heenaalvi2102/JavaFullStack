package filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {

        try{
            FileWriter fileWriter = new FileWriter("bufferwriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String str= "i am in pune";
            bufferedWriter.write(str);
            System.out.println("file successfully write");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileReader fileReader = new FileReader("bufferWriter.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while(i>0){
                System.out.print((char) i);
                i= bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
