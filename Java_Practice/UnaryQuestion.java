public class UnaryQuestion {
    public static void main(String[] args) {
        int a = 10;
        boolean flag = true;

        System.out.println("Unary plus: " + (+a));
        System.out.println("Unary minus: " + (-a));

        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));
        System.out.println("After post-increment: " + a);

        System.out.println("Pre-decrement: " + (--a));
        System.out.println("Post-decrement: " + (a--));
        System.out.println("After post-decrement: " + a);

        System.out.println("Logical NOT: " + (!flag));
    }
}