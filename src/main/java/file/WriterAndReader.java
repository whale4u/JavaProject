package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterAndReader {
    public static void writeDocument(String fileName) {
        File file = new File(fileName);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("This is an example of using\n");
            fileWriter.write(" FileReader and \n");
            fileWriter.write(" FileWriter. \n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readDocument(String fileName) {
        File file = new File(fileName);
        FileReader fileReader = null;
        int i=0;

        try {
            fileReader = new FileReader(fileName);
            while ((i=fileReader.read())!=-1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        writeDocument("def.txt");
        readDocument("def.txt");
    }
}

