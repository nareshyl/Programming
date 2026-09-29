class Student {
    String name;             // Instance variable
    int marks;               // Instance variable
    static String college = "ABC College";  // Static variable
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Ravi";
        s1.marks = 80;
        s2.name = "Arun";
          s2.marks = 90;
        s1.display();
        s2.display();
    }
}
