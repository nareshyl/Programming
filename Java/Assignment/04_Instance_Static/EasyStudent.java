class EasyStudent {
    String name;
    int age;
    static String college = "ABC College";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println();
    }

    public static void main(String[] args) {
        EasyStudent s1 = new EasyStudent();
        EasyStudent s2 = new EasyStudent();

        s1.name = "Ravi";
        s1.age = 20;
        s2.name = "Arun";
        s2.age = 21;

        s1.display();
        s2.display();
    }
}
