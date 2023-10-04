public class Digit2{
      static int SumOfDigits(int no){
      int som=0;
      while(no>0){
          som=som+no%10;
          no=no/10;
      }
      return som;
}

      public static void main(String[] args) {
 
      int sum=SumOfDigits(787);
      int sum1=SumOfDigits(123);
      System.out.println(sum);
      System.out.println(sum1);
  }

}