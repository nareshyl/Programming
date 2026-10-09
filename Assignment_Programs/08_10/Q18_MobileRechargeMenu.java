import java.util.Scanner;

public class Q18_MobileRechargeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int selectedPlan = 0;

        do {
            System.out.println("\n--- Mobile Recharge Menu ---");
            System.out.println("1. ₹199 Plan");
            System.out.println("2. ₹299 Plan");
            System.out.println("3. ₹399 Plan");
            System.out.println("4. Check Selected Plan");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    selectedPlan = 199;
                    System.out.println("₹199 plan selected.");
                    break;
                case 2:
                    selectedPlan = 299;
                    System.out.println("₹299 plan selected.");
                    break;
                case 3:
                    selectedPlan = 399;
                    System.out.println("₹399 plan selected.");
                    break;
                case 4:
                    if (selectedPlan == 0) {
                        System.out.println("No plan selected.");
                    } else {
                        System.out.println("Selected plan: ₹" + selectedPlan);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
