public class OrderService {
    TaxCalculator tax;
    EmailClient email;

    public OrderService(TaxCalculator tax, EmailClient email) {
        this.tax = tax;
        this.email = email;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = tax.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}