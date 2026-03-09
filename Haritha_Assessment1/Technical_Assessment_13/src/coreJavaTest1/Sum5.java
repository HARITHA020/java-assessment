package coreJavaTest1;

import java.util.Scanner;

public class Sum5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        int count = 0;
        System.out.println("Enter the scores (enter a negative number to stop input):");
        for (int i=0;i<10;i++) {
            int val = input.nextInt();
            if (val < 0) {
                break;
            }
            arr[count++] = val;
        }
        System.out.println("Scores before processing:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Scores after processing:");
        for (int i = 0; i < count; i++) {
            int num = arr[i];
            int result = -1;
            if (num%2 == 0)
                result = 0;
            if (num%2!=0)
                result=Math.max(result,1);
            if (num%8==0)
                result=Math.max(result,2);
            if (num%10==3)
                result=Math.max(result,3);
            if (num%9==0)
                result=Math.max(result,4);
            System.out.print(result+" ");
        }
        input.close();
    }
}
