import java.util.Scanner;

/**
 * prefixsum
 */
public class prefixsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
    }
    int[] prefix = new int[n];
    prefix[0]=arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum:");

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }

        sc.close();
}
}