import java.util.*;
public class Students {
    Scanner s=new Scanner(System.in);
    String[]name=new String[5];
    int[]rollno=new int[5];
    int[]marks=new int[5];
    int sum=0;
    String today="";
    
   /* Students(String[] string){
        string=string;
    }

    Students(int[] rollno){
        rollno=rollno;
    }*/

    Students(int[]marks){
        this.marks=marks;
    }

    Students(String[]name){
        this.name=name;
    }

    

    String attendance(){
        for(int i=0;i<name.length;i++){
            today=today+name[i]+" ";
            //System.out.println(" ");
        }
        return today;
    }

    

    int markstotal(){
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        return sum;
    }
}
