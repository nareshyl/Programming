class HardExplicit {
    public static void main(String[] args) {
        double totalMarks = 456.75;
        double subjects = 5.0;

        double average = totalMarks / subjects;
        int averageInt = (int) average;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average as double: " + average);
        System.out.println("Average as int: " + averageInt);
    }
}
