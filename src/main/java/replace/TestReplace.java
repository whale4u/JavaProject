package replace;

import java.io.*;

public class TestReplace {
    public static void main(String[] args) {
//        String fileName = "../../../../../etc/passwd";
        String fileName = "%2e%2e/%2e%2e/%2e%2e/etc/passwd";

        String NewString = fileName.replaceAll("\\.", "");

//        System.out.println(NewString);

//        NewString = NewString.replaceAll("\\\\", "");

        System.out.println(NewString);


        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}