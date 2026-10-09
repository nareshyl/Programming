public class Q08_MinutesToHours {
    public static void main(String[] args) {
        int totalMinutes = 150;
        double hours = totalMinutes / 60.0; // implicit widening conversion

        System.out.println("Total Minutes = " + totalMinutes);
        System.out.println("Hours = " + hours);
    }
}
