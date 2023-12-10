import java.util.*;
public class ClassDemo {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        //Students stu=new Students();

        //int[]mark=new int[5];

        int[]mark={12,13,14,15,16};

        String[]names={"Rohit","Karthik","Ravi","Mathi","Vishal"};

        int[]rollnos={1,2,3,4,5};

        Students student1=new Students(mark);
        
        Students student2=new Students(names);
        

        System.out.println(names[0]+student1.markstotal());

        System.out.println(student2.attendance());

    }
}
