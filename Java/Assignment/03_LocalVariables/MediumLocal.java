class MediumLocal {
    static void calculateMarks() {
        int english = 80;
        int maths = 90;
        int science = 85;

        int total = english + maths + science;
        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }

    public static void main(String[] args) {
        calculateMarks();
    }
}
