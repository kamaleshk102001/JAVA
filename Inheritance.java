public class Inheritance {
    public static void main(String[] args) {
        Employee e1=new Employee("vimal",50000,"27/05/2023");
        e1.raiseSalary(10);
        e1.displayEmployee();

        Manager m1=new Manager("Raj",80000.0,"23/05/2023",0.0);

       
        m1.setBonus(20000);

        Employee e2=new Manager("kamal", 56000, "13/12/2023", 35000);     //polymorphic behaviour


        m1.displayEmployee();

        Employee[] employees=new Employee[4];
        employees[0]=new Employee("kunal", 65000, "11/09/2023");
        employees[1]=new Employee("Sekar", 55000,"23/03/2023");
        employees[2]=new Employee("Bala", 75000, "14/04/2023");
        employees[3]=new Manager("Hari", 80000, "13/03/2023", 0.0);

        Manager m2;
        if(employees[3] instanceof Manager){
         m2=(Manager) employees[3];
         m2.setBonus(15000);
         }

        Manager m3;
        if(employees[2] instanceof Manager){
            m3=(Manager) employees[2];
            m3.setBonus(10000);
        }


        for(Employee e:employees){
            e.displayEmployee();
        }
        //System.out.println(m1.);

    }
    
}