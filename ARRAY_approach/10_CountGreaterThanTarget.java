public class CountGreaterThanTarget {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 20, 8};
        int target = 15;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
