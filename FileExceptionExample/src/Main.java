import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

 class Example {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("file.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();  // Write a new line
            bufferedWriter.write("This is an example of BufferedWriter.");

            // It is important to flush or close the writer to ensure the data is written to the file
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("file.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                // Process the byte data
                //System.out.println((char)data + " = " + data);
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Täällä ollaan");
        }


        try (OutputStream outputStream = new FileOutputStream("file.txt")) {
            String text = "Hello, World!";
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileWriter fw = null;
            fw = new FileWriter("file.txt");
            fw.append("hello");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}