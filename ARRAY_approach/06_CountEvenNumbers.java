public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14, 17};

        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }

        System.out.println(even);
    }
}
