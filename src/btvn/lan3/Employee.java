package btvn.lan3;

public class Employee extends Staff{

        private String skill;
    Employee(String name,String email,int wage,String skill)
    {
        super(name, email, wage);
        this.skill = skill;
    }


    public void display()
    {
        super.display();
        System.out.println("Skill "+this.skill);


    }

}
