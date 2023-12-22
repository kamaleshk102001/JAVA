
public class AbstractDemo1 {
    public static void main(String[] args) {
        Shape[] s=new Shape[4];
        s[0]=new Square();
        s[1]=new Square();
        s[2]=new Rectangle();
        s[3]=new Rectangle();

        for(Shape s1:s){
            s1.area();
        }
    }
}
