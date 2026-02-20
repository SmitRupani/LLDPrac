public class SingleCache implements Cache{
    private Frame last;
    @Override
    public void put(Frame f) {
        this.last = f;
    }

    @Override
    public Frame get() {
        return last;
    }
}
