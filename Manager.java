public class Manager extends Employee {
    double bonus;

    Manager(String s,double n,double d){
        super(s,n);
        bonus=d;

        //name=s;
        //salary=n;  can't declare since it is public

        
        
    }

    public void setBonus(double e){
        bonus=e;
    }

    public double getBonus(){
        return bonus;
    }
    
    //@Override
     public double getSalary(){//method overriding method used again in derived class
        return super.getSalary()+bonus;
    }
}
