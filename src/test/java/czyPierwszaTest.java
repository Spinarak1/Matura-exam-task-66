import org.junit.Assert;
import org.junit.Test;

public class czyPierwszaTest {
    @Test
    public void test(){
        Assert.assertEquals(true, Main.czyPierwsza(7));
        Assert.assertEquals(false, Main.czyPierwsza(8));
        Assert.assertEquals(true, Main.czyPierwsza(11));
        Assert.assertEquals(false, Main.czyPierwsza(0));
        Assert.assertEquals(false, Main.czyPierwsza(1));
        Assert.assertEquals(false, Main.czyPierwsza(-12));
    }
}
