public class Factorial {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;

        int temp;

        System.out.println(n1);

        for(int i=1;i<5;i++){
            temp=n2;
            n2=n1+n2;
            n1=temp;

            System.out.println(n2);
        }

    }
}
