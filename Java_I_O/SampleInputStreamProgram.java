import java.io.*;
public class SampleInputStreamProgram {
    public static void main(String[] args) throws IOException {
        try {
            InputStream input = new FileInputStream("Io_Java.txt");
            System.out.println("Char - "+ (char)input.read());
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
