public class Inheritance {
    public static void main(String[] args) {
        Employee e1=new Employee("vimal",50000);
        e1.raiseSalary(10);
        System.out.println(e1.getSalary());

        Manager m1=new Manager("Raj",80000.0,0.0);

       
        m1.setBonus(20000);


        System.out.println(m1.getSalary());

        
        //System.out.println(m1.);

    }
    
}