package org.example;

import java.io.*;

public class MyFileReaderWriter {

    public String readContents(String filePath) throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream(filePath);
        StringBuilder resultStringBuilder = new StringBuilder();
        assert inputStream != null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
            inputStream.close();
        }
        return resultStringBuilder.toString();
    }

    public void writeContents(String content, String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(content);
        printWriter.close();
    }
}
