public class Player {
    private Decoder decoder;
    private Cache cache;
    private Renderer renderer;

    public Player(Decoder decoder, Cache cache, Renderer renderer) {
        this.decoder = decoder;
        this.cache = cache;
        this.renderer = renderer;
    }

    void play(byte[] fileBytes){
        // decode
        Frame f = decoder.decode(fileBytes);
        // draw UI
        renderer.render(f);
        // cache
        cache.put(f);
    }
}