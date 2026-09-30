class HardImplicit {
    public static void main(String[] args) {
        int basicSalary = 25000;
        int bonus = 5000;

        int total = basicSalary + bonus;
        double totalSalary = total;
        double fivePercentBonus = totalSalary * 0.05;

        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + totalSalary);
        System.out.println("5% Bonus: ₹" + fivePercentBonus);
    }
}
