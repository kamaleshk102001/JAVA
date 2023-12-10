
public class Employee {
    private double salary;
    private String name;
    private String date;


    
    Employee(String s,double n,String j){
        name=s;
        salary=n;
        date=j;
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

    public String getjoiningdate(){
        return date;
    }

    public void setjoiningdate(String t){
        date=t;
    }

    public void raiseSalary(double percent){
        salary+=salary*percent/100;
    }
    
    public void displayEmployee(){
        System.out.println(name+" "+salary+" "+date);
    }
}