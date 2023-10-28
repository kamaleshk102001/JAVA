public class Box1 {
    int length;
    int breadth;
    int height;

    Box1(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }

    Box1(Box1 b){
        length=b.length;
        breadth=b.breadth;
        height=b.height;
    }

    int volume(){
        return length*breadth*height;
    }

    Boolean isEquals(Box1 b){
        if(length==b.length && breadth==b.breadth && height==b.height)
            return true;

        return false;
    }


}
