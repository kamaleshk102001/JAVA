import java.util.*;
public class Students {
    Scanner s=new Scanner(System.in);
    String[]name=new String[5];
    int[]rollno=new int[5];
    int[]marks=new int[5];
    int sum=0;

   /* Students(String[] string){
        string=string;
    }

    Students(int[] rollno){
        rollno=rollno;
    }*/

    Students(int[]marks){
        this.marks=marks;
    }

    
    int markstotal(){
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        return sum;
    }
}
