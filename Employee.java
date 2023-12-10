
public class Employee {
    private double salary;
    private String name;


    Employee(String s,double n){
        name=s;
        salary=n;
    }

    /*Employee(){
        salary=0.0;
        name=null;
    }*/

     public String getName(){
        return name;
    }

     public void setName(String s){
        name=s;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double n){
        salary=n;
    }

    public void raiseSalary(double percent){
        salary+=salary*percent/100;
    }
    
}