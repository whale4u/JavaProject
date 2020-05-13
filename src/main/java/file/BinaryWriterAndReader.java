package file;

import java.io.*;


public class BinaryWriterAndReader {
    public static void writeBinary(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            bw.write("Hello World!");
            bw.newLine();
            bw.write("Vimer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readBinary(String fileName) {
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
    public static void main(String[] args) {
        writeBinary("abc.txt");
        readBinary("abc.txt");
    }
}
