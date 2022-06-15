import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedClasses {
    public static void main(String[] args) {
 try {
    File f1 = new File("Io_Java.txt");
    File f2 = new File("Io_Java1.txt");
    FileReader fr = new FileReader(f1);
    BufferedReader br = new BufferedReader(fr);
    FileWriter fw = new FileWriter(f2);
    BufferedWriter bw = new BufferedWriter(fw);
    String s;
    while((s=br.readLine())!=null){
         bw.write(s);
         bw.flush();
    }
    br.close();
    bw.close();  
 } catch (IOException e) {
     e.printStackTrace();
 }       
    }
}
