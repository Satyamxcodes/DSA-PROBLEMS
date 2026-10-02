import java.util.Scanner;

public class TWONUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        int n = sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Target: ");
        int target = sc.nextInt();

        for(int i =0;i<arr.length;i++){
            for(int j =(i+1);j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i + "" + j);
                }

            }
        }

      sc.close();
    }
}
