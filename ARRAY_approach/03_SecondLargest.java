public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
