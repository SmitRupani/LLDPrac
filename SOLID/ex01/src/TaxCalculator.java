public class TaxCalculator {
    double taxRate;

    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}