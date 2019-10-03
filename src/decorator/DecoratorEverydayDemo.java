package decorator;

import java.io.*;

public class DecoratorEverydayDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("text");

        doStream.close();
        oStream.close();
    }
}
