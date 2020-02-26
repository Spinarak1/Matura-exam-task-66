import org.junit.Assert;
import org.junit.Test;

public class zad664Test {
    @Test
    public void test(){
        Trojka[] trojka = {new Trojka(2, 3, 7),
                new Trojka(10, 2, 15),
                new Trojka(9, 2, 10),//
                new Trojka(12, 5, 13),//
                new Trojka(3, 3, 6),
                new Trojka(1, 1, 1),//
                new Trojka(2, 2, 2),//
                new Trojka(4, 1, 2),
                new Trojka(6, 8, 10),//
                new Trojka(2, 1, 1),
                new Trojka(10, 12, 14),//
                new Trojka(11, 12, 13),//
                new Trojka(12, 13, 14),//
                new Trojka(14, 15, 16),//
                new Trojka(1, 2, 3),
                new Trojka(2, 3, 4),//
                new Trojka(1, 1, 5),
                new Trojka(3, 6, 9)};
        int[] tab = new int[2];
        tab[0] =10;
        tab[1] =4;
        //Assert.assertEquals(tab, Main.zad664(trojka));
        Assert.assertArrayEquals(tab, Main.zad664(trojka));
    }
}
