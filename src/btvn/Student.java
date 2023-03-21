package btvn;


public class Student {
    int id;
    String name;
    String email;

    public void inputData(){
        Student input = new Student();

        System.out.println("Enter id: ");
        this.id = input.id;
        System.out.println("Enter name: ");
        this.name = input.name;
        System.out.println("Enter email: ");
        this.email = input.email;

        System.out.println("input completed!");
    }
    public void display(){
        System.out.println("ID" + this.id);
        System.out.println("Name" + this.name);
        System.out.println("Email" + this.email);
    }
}
