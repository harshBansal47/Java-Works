import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class InputOutput {
    public static void main(String[] args)throws IOException {
        // buffer reader class
        // used to read stream of characters
        FileReader fr = new FileReader("Io_Java.txt");
        BufferedReader br = new BufferedReader(fr);
        br.close();

//################################## java formatted output //////////////////////////////////////////////
String company_name = new String("Tesla") ;
int place = 1;
String quality = new String();
quality = "Innovation";
System.out.printf("%s"+" is the "+"No.%d"+" company of %s"+ " in whole world",company_name,place,quality);
/////////////////////////////////////////////////////####################################################
    }
}
