package btnv4;

import java.util.Scanner;

public class Circle extends Shape{
    int r;
    float per, area, pi;
    @Override
    public void inputData() {
        System.out.print("Enter radius of circle: ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
    }

    @Override
    public  void calPerimeter(){
        pi = (float) Math.PI;
        per = 2*r*pi;
    }
    @Override
    public void calArea() {
        pi = (float) Math.PI;
        area = (r*r*pi);
    }

    @Override
    public void display() {
        System.out.println("--Circle--");
        System.out.println("Perimeter = "+ per);
        System.out.println("Area = "+ area);
    }

}
