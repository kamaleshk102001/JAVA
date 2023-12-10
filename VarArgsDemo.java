public class VarArgsDemo {
    static int minvalue(int... vals){
        int min=Integer.MAX_VALUE;
        for(int k:vals){
            if(k<min)
             min=k;
        
        }
        return min;
    }
    public static void main(String[] args) {
        int n=minvalue(4,5,6);
        System.out.println(n);
        int m=minvalue(6,7,8,9,10);
        System.out.println(m);
    }
}
