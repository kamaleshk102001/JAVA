import java.util.*;
public class ClassDemo {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        //Students stu=new Students();

        //int[]mark=new int[5];

        int[]mark={12,13,14,15,16};

        Students student1=new Students(mark);
        
        

        System.out.println(student1.markstotal());

    }
}
