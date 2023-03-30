package btnv4;

import java.awt.geom.Area;
import java.util.Scanner;

public class Triangle extends Shape {
    int a, b, c, per;
    float p, area;
    @Override
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side A of triangle: ");
        a = input.nextInt();

        System.out.print("Enter side B of triangle: ");
        b = input.nextInt();

        System.out.print("Enter side C of triangle: ");
        c = input.nextInt();
    }
    @Override
    public  void calPerimeter(){
        per = a + b+ c;
    }
    @Override
    public void calArea(){
        p = (float) (a+b+c)/2;
        area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public void display(){
        System.out.println("--Triangle--");
        System.out.println("Perimeter = "+ per);
        System.out.println("Area = "+ area);
    }
}
