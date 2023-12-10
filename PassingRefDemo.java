public class PassingRefDemo {
    public static void main(String[] args) {
        Box2 b1=new Box2(5,3,4);
        Box2 b2=new Box2(6,7,8);

        Box2 b3=b1.doubleBox();

        System.out.println(b1.isEqual(b2));
        System.out.println(b3.length);
    }
}
