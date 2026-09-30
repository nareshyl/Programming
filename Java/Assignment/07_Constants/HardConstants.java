class HardConstants {
    public static void main(String[] args) {
        final double UNIT_PRICE = 8.5;
        final double TAX = 0.05;
        int units = 150;

        double basicBill = units * UNIT_PRICE;
        double taxAmount = basicBill * TAX;
        double finalBill = basicBill + taxAmount;

        System.out.println("Units: " + units);
        System.out.println("Basic Bill: ₹" + basicBill);
        System.out.println("Tax: ₹" + taxAmount);
        System.out.println("Final Bill: ₹" + finalBill);
    }
}
