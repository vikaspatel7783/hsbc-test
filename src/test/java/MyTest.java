import org.example.MyFileHelper;
import org.example.MyFileReaderWriter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.doNothing;

public class MyTest {

    @InjectMocks
    MyFileHelper myFileHelper;

    @Test
    public void test_read_write_reverse_success() throws IOException {

        MyFileReaderWriter mockFileReaderWriter = Mockito.mock(MyFileReaderWriter.class);

        Mockito.when(mockFileReaderWriter.readContents(Mockito.anyString())).thenReturn("TEST CONTENTS");
        doNothing().when(mockFileReaderWriter).writeContents(Mockito.anyString(), Mockito.anyString());

        myFileHelper = new MyFileHelper(mockFileReaderWriter);

        String output = myFileHelper.readAndWriteReverse("/input.txt", "/output.txt");

        Assert.assertNotNull(output);
        Assert.assertEquals("STNETNOC TSET", output);
    }

}
