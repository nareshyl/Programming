class MediumExplicit {
    public static void main(String[] args) {
        double price = 99.99;
        double quantity = 3.0;

        double total = price * quantity;
        int convertedTotal = (int) total;

        System.out.println("Original Total: " + total);
        System.out.println("Converted Total: " + convertedTotal);
    }
}
