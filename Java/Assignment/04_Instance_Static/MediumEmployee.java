class MediumEmployee {
    String name;
    double salary;
    static String company = "ABC Technologies";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Company: " + company);
        System.out.println();
    }

    public static void main(String[] args) {
        MediumEmployee e1 = new MediumEmployee();
        MediumEmployee e2 = new MediumEmployee();
        MediumEmployee e3 = new MediumEmployee();

        e1.name = "Ravi";
        e1.salary = 30000;
        e2.name = "Arun";
        e2.salary = 40000;
        e3.name = "Kumar";
        e3.salary = 50000;

        e1.display();
        e2.display();
        e3.display();
    }
}
