public class OrderService {
    TaxCalculator tax;
    NotificationClient client;

    public OrderService(TaxCalculator tax, NotificationClient client) {
        this.tax = tax;
        this.client = client;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = tax.totalWithTax(subtotal);
        client.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}