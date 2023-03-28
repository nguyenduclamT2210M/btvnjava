package btvn.lan3;

public class Manager extends Staff{
    private String part;
    Manager(String name, int wage, String email, String part )
    {
        super(name, email, wage);
        this.part = part;
    }
    public  void display(){
        super.display();
        System.out.println("Room "+this.part);
    }
}
