public class Demo01 {
    public static void main(String[] args) {
        OrderService osrv = new OrderService(new TaxCalculator(0.18), new EmailClient());
        osrv.checkout("a@shop.com", 100.0);
    }
}
