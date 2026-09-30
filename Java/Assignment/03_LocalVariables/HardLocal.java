class HardLocal {
    static void calculateBill() {
        double item1 = 500;
        double item2 = 750;
        double item3 = 250;

        double total = item1 + item2 + item3;
        double discount = total * 0.10;
        double finalAmount = total - discount;

        System.out.println("Total = ₹" + total);
        System.out.println("10% Discount = ₹" + discount);
        System.out.println("Final Amount = ₹" + finalAmount);
    }

    public static void main(String[] args) {
        calculateBill();
    }
}
