public class Digit{
static int SumOfDigits(int[]arr){
      int som=0;
      for(int i=0;i<arr.length;i++){
        som=som+arr[i];
      }
      return som;
    }
public static void main(String[] args) {
    int[]arr={10,20,30,40};
    
    int sum=SumOfDigits(arr);
    System.out.println(sum);
  }
}