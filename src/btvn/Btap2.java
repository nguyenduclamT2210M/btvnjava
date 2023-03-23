package btvn;

import java.util.Scanner;

public class Btap2 {
    int sum = 0 ;
    int n  ;

    public void inputData() {

        Scanner input = new Scanner(System.in);
        System.out.println("Sum Digit Program");
        System.out.print("Enter an integer n=");
         n = input.nextInt();
           int m  = n;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum digit  "+m +"="+ sum );
        System.out.println("Press any key to conrinue.");
        /*System.out.print("Enter an integer n=");
        int nhap2 = input.nextInt();
        System.out.println("Press any key to continue.");*/


    }
    public void display(){

    }
}
