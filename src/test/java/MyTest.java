import org.example.MyFileHelper;
import org.example.MyFileReaderWriter;
import org.example.employee.product.BaseProduct;
import org.example.employee.product.PriceEngine;
import org.example.employee.product.ProductPrice;
import org.example.employee.product.VanillaProduct;
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

    @Test
    public void getProductPrice() {
        PriceEngine priceEngine = new PriceEngine();
        VanillaProduct vanillaProduct = new VanillaProduct(500, "1/jan/2023");
//        vanillaProduct.strikePrice = 500;
        ProductPrice price = priceEngine.getPrice(vanillaProduct);
        Assert.assertEquals(1500, price.price);
    }

}
