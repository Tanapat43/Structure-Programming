public class App {
    public static void main(String[] args) {
        displayCard("Whis", 2222, "Gold");
        System.out.println("****************");
        displayCard("Vegeta", 1500, "Silver");
        System.out.println("****************");
        displayCard("Lord Biu", 3000, "Yuki");
        System.out.println("****************");
        displayCard("Son Goku", 2000, "Platinum");
    }

    public static void displayCard(String name, double purchaseAmount, String type) {
        double discount = calculateDiscount(type, purchaseAmount);
        System.out.println("Customer Name: " + name);
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Total Amount: " + (purchaseAmount - discount));
    }

    public static double calculateDiscount(String type, double purchaseAmount) {
        switch (type) {
            case "Gold":
                return purchaseAmount * 0.13;
            case "Silver":
                return purchaseAmount * 0.08;
            case "Platinum":
                return purchaseAmount * 0.22;
            case "Diamond":
                return purchaseAmount * 0.31;
            default:
                return 0;
        }
    }
}