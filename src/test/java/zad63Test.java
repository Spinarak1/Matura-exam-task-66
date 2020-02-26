import org.junit.Assert;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

public class zad63Test {
    @Test
    public void test(){
        Trojka[] trojka = {new Trojka(2, 3, 7),
        new Trojka(10, 2, 15),
        new Trojka(84, 2, 10),
        new Trojka(12, 5, 13),
        new Trojka(12, 16, 20)};
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        Main.zad63(trojka, printWriter);
        Assert.assertEquals("12 5 13\n12 16 20", stringWriter.toString());
    }
}
