package Array;

import java.util.Scanner;

public class inputOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // declaring a array
        int[] arr = new int[n];
        // taking input from user
        for (int i = 0; i < n; i++) {
            System.out.println("enter your element" + i + "th index");
            arr[i] = sc.nextInt();
        }

        // printing the user value
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
