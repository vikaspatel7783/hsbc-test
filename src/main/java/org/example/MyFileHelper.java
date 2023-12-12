package org.example;

import java.io.IOException;

public class MyFileHelper {

    private final MyFileReaderWriter myFileReaderWriter;

    public MyFileHelper(MyFileReaderWriter myFileReaderWriter) {
        this.myFileReaderWriter = myFileReaderWriter;
    }

    public String readAndWriteReverse(String inputFile, String outputFile) throws IOException {
        String contents = myFileReaderWriter.readContents(inputFile);
        String newContents = new StringBuilder(contents).reverse().toString();
        myFileReaderWriter.writeContents(newContents, outputFile);
        return newContents;
    }
}
