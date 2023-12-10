public class VarArgsDemo1 {
    static int minvalue1(int... vals){
        int min=Integer.MAX_VALUE;              //we give max value to initialize with maximum value to get the minimum for comparision
        for(int k:vals){
            if(k<min)
                min=k;
        }
        return min;
    }

    static double minvalue1(double... vals){
        double min=Double.MAX_VALUE;
        for(double k:vals){
            if(k<min)
                min=k;
        }
        return min;
    }

    public static void main(String[] args) {
        int n=minvalue1();
        System.out.println(n);
        int m=minvalue1(5,6,7);                         //the use of two datatypes for method is called is method overloading
        System.out.println(m);
        double p=minvalue1(5.8,9.0,7.8,3.2);
        System.out.println(p);
    }
}
