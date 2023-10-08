import java.util.Scanner;

public class relativesort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        int a2 = 0;
        while (a2 < m) {
            int a1 = 0;
            while (a1 < n) {
                if (arr2[a2] == arr1[a1]) {
                    System.out.print(arr1[a1] + " ");
                }
                a1++;
            }
            a2++;
        }
    }
}