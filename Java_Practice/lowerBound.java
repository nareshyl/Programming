import java.util.*;

public class Main {
    static int lowerBound(int[] a, int target) {
        int left = 0;
        int right = a.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    static int upperBound(int[] a, int target) {
        int left = 0;
        int right = a.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (a[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    static int countInRange(int[] a, int L, int R) {
        return upperBound(a, R) - lowerBound(a, L);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int L = sc.nextInt();
        int R = sc.nextInt();

        int result = countInRange(nums1, L, R)
                   + countInRange(nums2, L, R);

        System.out.println(result);
        sc.close();
    }
}