import java.util.Random;
import java.util.*;
public class Randomnumber{

    static int num;
    static int randomnum(){
         Random random=new Random();

         num=random.nextInt(6);

        return num;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       
        int no=s.nextInt();
        //for(int i=1;i<=5;i++){
        
        while(Randomnumber.num>=0){
        if(Randomnumber.num==no){
            System.out.println("guess is correct");
            break;
        }
        randomnum();
        System.out.println("Number wrong");
    }
    
        //}
    }
}