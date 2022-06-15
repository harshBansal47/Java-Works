import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
public class CharacterStream {
    public static void main(String[] args) {
        // in this program we read characters from one and write it to another
        try {
        File f1 = new File("Io_Java.txt");
        InputStream io = new FileInputStream(f1);
        byte[] array = new byte[2000];
        io.read(array);
        String str = new String(array);
        char [] ch = str.toCharArray();
        File f2 = new File("Io_Java1.txt");
        FileWriter fr = new FileWriter(f2);
        for(int i = 0; i<str.length();i++){
          fr.write(ch[i]);
        }
        fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// reader and writer are abstract class 
// bufferedReader , Filereader , inputstream reader ,outputStream reader classes are used for reading pupose
// bufferedwriter,printWriter,FileWriter are used to write 

/* Let us assume data is read from the keyboard into memory using DataInputStream 
 and it takes 1 sec to read 1 character into memory and this character is written 
 into the file by FileOutputStream by spending another 1 sec. */

 /* So for reading and writing a file will take 200 sec. This is wasting a lot of time.
 On the other hand, if Buffered classed are used, they provide a buffer which is first 
 filled with characters from the buffer which can be at once written into the file. 
 Buffered classes should be used in connection to other stream classes. */

 /* First, the DataInputStream reads data from the keyboard by spending 1 sec for each 
character. This character is written into the buffer. Thus, to read 100 characters into a
 buffer, it will take 100 second time. Now FileOutputStream will write the entire buffer in
  a single step. So, reading and writing 100 characters took 101 sec only. In the same way, 
  reading classes are used for improving the speed of reading operation.  Attaching 
  FileOutputStream to BufferedOutputStream as */