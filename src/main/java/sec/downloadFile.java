package sec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class downloadFile {
    public static void main(String[] args) throws IOException {
//        String downloadPath;
//        String accountId = "../../%00";
//        downloadPath = "/tmp/"+accountId+"1.txt";
//        System.out.println(downloadPath);
        String filePath = "/tmp/../etc/passwd\001.txt";
        BufferedReader buf = new BufferedReader(new FileReader(filePath));
        String str = "";
        while (null != (str=buf.readLine())) {
            System.out.println(str);
        }
        buf.close();
    }
}
