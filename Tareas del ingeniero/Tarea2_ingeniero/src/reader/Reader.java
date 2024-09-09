package reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    private BufferedReader reader;

    public Reader(FileInputStream fileInputStream) {
        this.reader = new BufferedReader(new InputStreamReader(fileInputStream));
    }

    public String next() throws IOException {
        return reader.readLine();
    }
}
