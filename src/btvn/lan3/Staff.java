package btvn.lan3;

public class Staff {
    private String name;
    private String email;
    private int wage;
    Staff(){
        this.name="";
        this.email="";
        this.wage=0;
    }
    Staff(String name,String email,int wage)
    {
        this.name=name;
        this.email=email;
        this.wage=wage;
    }
public static void main(String[] args)
{
    Employee employees[] = new Employee[3];

    employees[0] = new Employee("lam" , "lam@gmail.com",1313,"Java");
    employees[1] = new Employee("lam" , "lam@gmail.com",1313,"C#");
    employees[2] = new Employee("lam" , "lam@gmail.com",1313,"HTML CSS");

    Director directors[] = new Director[1];
    directors[0] = new Director("lam",123123,"lam@gmail.com","Business");





    Manager managers[] = new    Manager[2];

    managers[0] = new Manager("lam" , 123,"lam@gmail.com","code");
    managers[1] = new Manager("lan" , 123,"lam@gmail.com","marketting");


    for(Employee item : employees){
        System.out.println("---------------------------");
        System.out.println("Employee ");

        item.display();
    }

    for(Director item : directors){
        System.out.println("---------------------------");
        System.out.println("Directors ");

        item.display();
    }

    for(Manager item : managers )
    {
        System.out.println("---------------------------");
        System.out.println("Managers ");
        item.display();
    }
}
    protected void display() {
        System.out.println("Name "+this.name);
        System.out.println("Email "+this.email);
        System.out.println("Wage "+this.wage);
    }
}
