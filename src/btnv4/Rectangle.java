package btnv4;

import java.util.Scanner;

public class Rectangle extends Shape{
    int a, b, per, area;
    @Override
    public void inputData(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width of rectangle: ");
        a = input.nextInt();

        System.out.print("Enter length of rectangle: ");
        b = input.nextInt();
    }
    @Override
    public  void calPerimeter(){
        per = 2*a*b;
    }
    @Override
    public void calArea(){
        area = a*b;
    }
    @Override
    public void display(){
        System.out.println("--Rectangle--");
        System.out.println("Perimeter = "+ per);
        System.out.println("Area = "+ area);
    }
}
