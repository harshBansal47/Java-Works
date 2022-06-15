import java.io.*;
public class InputStreamDemo{
    public static void main(String[] args) {
        try {
            InputStream io = new FileInputStream("Io_Java.txt");
            char a = (char)io.read();
            char b = (char)io.read();
            char c = (char)io.read();
            char d = (char)io.read();
            char e = (char)io.read();
            char f = (char)io.read();
            char g = (char)io.read();
            char h = (char)io.read();
            char i = (char)io.read();
            System.out.println(a + " " + b + " " +c+ " " +d+ " " +e+ " " +f+ " " +g+ " " +h+ " " +i);
            System.out.println((char)io.read());
            System.out.println((char)io.read());
            System.out.println(io.read());
            System.out.println((char)io.read());
            System.out.println((char)io.read());
            System.out.println(io.read());
            System.out.println((char)io.read());
            System.out.println((char)io.read());
            System.out.println((char)io.read());
            System.out.println(io.read());
            System.out.println((char)io.read());
            System.out.println(io.available());
            System.out.println(io.markSupported());
            io.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
