public class Task5_2 {
    public static void main(String[] args) {
        double productCost = 9.99d, VAT = 0.23d;
        double totalCost = productCost + (productCost * VAT);
        System.out.printf("--------------------------\nThe total cost of the product including VAT is: %.2f", totalCost);
        double totalCost2 = (totalCost * 10000) / (1 + VAT);
        System.out.printf("\n--------------------------\nThe total cost for 10000 units sold excluding VAT is: %.2f", totalCost2);
    }
}
