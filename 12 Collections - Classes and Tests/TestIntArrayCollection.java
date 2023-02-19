import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class TestIntArrayCollection {

    @Test
    public void newArraySizeIs0() {
        Collection<Integer> iac = new IntArrayCollection();
        Assert.assertEquals(0, iac.size());
    }

    @Test
    public void addToEmptyArraySizeIs1() {
        Collection<Integer> iac = new IntArrayCollection();
        iac.add(1);
        Assert.assertEquals(1, iac.size());
    }

    @Test
    public void removeSizeDecreasesOn1() {
        Collection<Integer> iac = new IntArrayCollection();
        iac.add(120);
        iac.remove(120);
        Assert.assertEquals(0, iac.size());
    }


}
