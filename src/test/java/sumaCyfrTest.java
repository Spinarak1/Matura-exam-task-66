import org.junit.Assert;
import org.junit.Test;

public class sumaCyfrTest {
    @Test
    public void test(){
        Assert.assertEquals(3 ,Main.sumaCyfr(12));
        Assert.assertEquals(0 ,Main.sumaCyfr(0));
        Assert.assertEquals(5 ,Main.sumaCyfr(221));
        Assert.assertEquals(17 ,Main.sumaCyfr(449));
    }
}
