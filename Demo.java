import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        Box blackBox=new Box();

        blackBox.length=10;
        blackBox.breadth=3;
        blackBox.height=5;

        System.out.println(blackBox.volume());
        System.out.println(blackBox.area());

        Student raju=new Student();

        raju.name[0]="raju";
        raju.rollno[0]=2;
        
        for(int i=0;i<raju.marks.length;i++){
            raju.marks[i]=d.nextInt();
        }
        //raju.marks[0]=92;
        //raju.marks[1]=93;
       // raju.marks[2]=98;
       
        System.out.println(raju.name[0]+"\n"+raju.rollno[0]+"\n"+raju.markstotal());
    }
}
