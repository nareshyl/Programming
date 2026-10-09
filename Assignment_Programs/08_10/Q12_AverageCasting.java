public class Q12_AverageCasting {
    public static void main(String[] args) {
        double totalMarks = 425.0;
        double numberOfSubjects = 5.0;

        double average = totalMarks / numberOfSubjects;
        int intAverage = (int) average;

        System.out.println("Average = " + average);
        System.out.println("Integer Average = " + intAverage);
    }
}
