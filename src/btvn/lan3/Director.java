package btvn.lan3;

public class Director extends Staff{
    private final String room;


    Director(String name, int wage, String email, String room)
    {
        super(name, email, wage);
        this.room = room;
    }
    public  void display(){
        super.display();
        System.out.println("Room "+this.room);
    }
}
