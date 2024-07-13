package org.example;

import org.example.file_reader_writer.MyFileHelper;
import org.example.file_reader_writer.MyFileReaderWriter;

import java.io.IOException;

public class HSBC {

    public static void main(String[] args) {
        new HSBC().startReadWrite();
    }

    void startReadWrite() {
        MyFileHelper myFileHelper = new MyFileHelper(new MyFileReaderWriter());
        try {
            String output = myFileHelper.readAndWriteReverse("/input.txt", "src/main/resources/output.txt");
            System.out.println("OUTPUT: "+ output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}