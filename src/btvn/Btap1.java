package btvn;

import java.util.Scanner;

public class Btap1 {
    int total = 0;
    int arr[];
    int f = 0;
    int k = 0;

    public void inputData() {
        Scanner input = new Scanner(System.in);
        total = input.nextInt();
        arr = new int[total];
        System.out.println("Sum Even Odd program");
        System.out.print("Enter a number of element n=");
        total = input.nextInt();

        System.out.println("input elementS: ");
        for (int i = 0; i < total; i++) {
            System.out.print("Element  " + i + "=");
            arr[i] = input.nextInt();
            if (arr[i] % 2 == 0) {
                f += arr[i];
            } else if (arr[i] % 2 == 1) {
                k += arr[i];


            }


        }

        System.out.print("tong cac so le la:  " + k);
        System.out.print("\n tong cac so chan la:   " + (f));

    }
    public void display () {





    }
}
