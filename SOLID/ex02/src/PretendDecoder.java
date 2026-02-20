public class PretendDecoder implements Decoder {
    @Override
    public Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
}
