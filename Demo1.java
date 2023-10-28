public class Demo1 {
    public static void main(String[] args) {
        Box1 blackBox1=new Box1(15,16,17);

        System.out.println("Volume of BlackBox is"+" "+blackBox1.volume());

        Box1 b1=new Box1(15,16,18);

        Box1 b2=new Box1(b1);

        //System.out.println("blackbox=="+" "+blackBox1.isEquals(b1));

        System.out.println("blackbox=="+" "+b1.isEquals(b2));
    }
}
