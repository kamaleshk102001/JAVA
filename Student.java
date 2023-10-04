import java.util.*;
public class Student {
    Scanner s=new Scanner(System.in);
    int marks[]=new int[3];
    int rollno[]=new int[3];
    String name[]=new String[3];
    
    

    int markstotal(){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        return sum;
    }

    
}
