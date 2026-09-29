class LocalExample {
    void calculateSum() {
        int a = 10;       // Local variable
        int b = 20;       // Local variable
        int sum = a + b;  // Local variable
        System.out.println("Sum = " +sum);
    }
    public static void main(String[] args) {
        calculateSum();
        System.out.println("Sum = " +sum);
    }
}