package Array;

import java.util.Scanner;

public class inputOfArrayFunction {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // declaring a array
        int[] arr = new int[n];
        // taking input from user
        for (int i = 0; i < n; i++) {
            System.out.println("enter your element" + i + "th index");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    

    public static void main(String[] args) {
        int [] arr=takeInput();
        printArray(arr);

    }

}
