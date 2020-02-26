import org.junit.Assert;
import org.junit.Test;

public class czyRowneOstatniejTest {
    @Test
    public void test(){
        Assert.assertEquals(true ,Main.czyRowneOstatniej(new Trojka(3, 2 ,5)));
        Assert.assertEquals(true ,Main.czyRowneOstatniej(new Trojka(7, 68 ,21)));
        Assert.assertEquals(false ,Main.czyRowneOstatniej(new Trojka(3, 773 ,5)));
        Assert.assertEquals(false ,Main.czyRowneOstatniej(new Trojka(0, 0 ,21)));
    }
}
