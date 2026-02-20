public class UIrender implements Renderer {
    @Override
    public void render(Frame f) {
        System.out.println("\u25B6 Rendering " + f.getData().length + " bytes");
    }
}
