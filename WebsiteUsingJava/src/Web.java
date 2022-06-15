import java.net.*;
import java.io.*;
public class Web {
    public static void main(String[] args) throws Exception {
        URL url = new URL(" https://appkeksq.blogspot.com/2022/01/grand-canyon-of-india-chambal-rifts-kota.html");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));   
        String line = null;
        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
// in this program we got a conten from internet
