import java.util.Collection;

abstract public class AbstractIntCollection implements Collection<Integer> {
    protected int n = 0;

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for (Integer x: c) {
            this.add(x);
        }
        return true;
    }
}
