public class Demo02 {
    public static void main(String[] args) {
        Player p = new Player(new PretendDecoder(), new SingleCache(), new UIrender());
        p.play(new byte[]{1,2,3,4});
    }
}
