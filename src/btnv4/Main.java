package btnv4;

public class Main {
    public static void main(String[] args) {

            Shape shape[] = new Shape[3];

            shape[0] = new Circle();
            shape[1] = new Triangle();
            shape[2] = new Rectangle();

            for (Shape item : shape) {
                item.inputData();
            }
            for (Shape item : shape) {
                item.calPerimeter();
                item.calArea();
                item.display();
            }
        }
    }
