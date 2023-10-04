public class TwoDigit{
      static boolean digit(int no){
      int som=0;
      int count=0;
      while(no>0){
          som=som+no%10;
          no=no/10;
          count++;
      }
      if(count==2){
       return true;
      }
      else{
        return false;
      }
}

      public static void main(String[] args) {
 
      boolean status=digit(787);
      System.out.println(status);
  }

}